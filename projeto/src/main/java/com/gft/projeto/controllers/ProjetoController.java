package com.gft.projeto.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gft.projeto.entities.Projeto;
import com.gft.projeto.services.DesenvolvedorService;
import com.gft.projeto.services.LinguagemService;
import com.gft.projeto.services.ProjetoService;

@Controller
@RequestMapping("/projeto")
public class ProjetoController {

	@Autowired
	private ProjetoService projetoService;

	@Autowired
	private LinguagemService linguagemService;

	@Autowired
	private DesenvolvedorService desenvolvedorService;

	@RequestMapping("/editar")
	public ModelAndView editarProjeto(@RequestParam(required = false) Long id) {

		ModelAndView mv = new ModelAndView("projeto/form");
		Projeto projeto;

		if (id == null) {
			projeto = new Projeto();

		} else {
			try {
				projeto = projetoService.obterProjeto(id);

			} catch (Exception e) {
				projeto = new Projeto();
				mv.addObject("mensagem", e.getMessage());
			}
		}

		mv.addObject("projeto", projeto);
		mv.addObject("listaLinguagens", linguagemService.listarLinguagem());
		mv.addObject("listaDesenvolvedores", desenvolvedorService.listarTodosDesenvolvedores());

		return mv;
	}

	@RequestMapping(method = RequestMethod.POST, path = "editar")
	public ModelAndView salvarProjeto(@Valid Projeto projeto, BindingResult bindingResult) {

		ModelAndView mv = new ModelAndView("projeto/form.html");

		boolean novo = true;

		if (projeto.getId() != null) {
			novo = false;
		}

		if (bindingResult.hasErrors()) {
			mv.addObject("projeto", projeto);
			return mv;
		}

		Projeto projetoSalvo = projetoService.salvarProjeto(projeto);

		if (novo) {
			mv.addObject("projeto", new Projeto());
		} else {
			mv.addObject("projeto", projetoSalvo);
		}

		mv.addObject("mensagem", "Projeto salvo com sucesso!");
		mv.addObject("listaLinguagens", linguagemService.listarLinguagem());
		mv.addObject("listaDesenvolvedores", desenvolvedorService.listarTodosDesenvolvedores());

		return mv;
	}

	@RequestMapping()
	public ModelAndView listarProjetos() {

		ModelAndView mv = new ModelAndView("projeto/listar.html");

		mv.addObject("lista", projetoService.listarProjetos());

		return mv;
	}

	@RequestMapping("/excluir")
	public ModelAndView excluirProjeto(@RequestParam Long id, RedirectAttributes redirectAttributes) {

		ModelAndView mv = new ModelAndView("redirect:/projeto");

		try {
			projetoService.excluirProjeto(id);
			redirectAttributes.addFlashAttribute("mensagem", "Projeto excluído com sucesso!");
		} catch (Exception e) {
			redirectAttributes.addFlashAttribute("mensagem", "Erro ao excluir o projeto!!" + e.getMessage());
		}

		return mv;
	}

}

package com.gft.teste.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gft.teste.entities.Livro;
import com.gft.teste.services.LivroService;

@Controller
@RequestMapping("livro")
public class LivroController {

	@Autowired
	private LivroService livroService;
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView trazerLivro(Long id) {

		ModelAndView mv = new ModelAndView("livro/form");

		mv.addObject("livro", new Livro());

		return mv;
	}

}

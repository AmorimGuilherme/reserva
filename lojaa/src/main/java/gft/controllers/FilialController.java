package gft.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gft.dto.ConsultaFilialDTO;
import gft.dto.EnderecoDTO;

@RestController
@RequestMapping("v1/filiais")
public class FilialController {

	@GetMapping // -----------> ATALHO DO REQUEST MAPPING
	public ResponseEntity<List<ConsultaFilialDTO>> buscarTodasAsFiliais() {

		EnderecoDTO endereco1 = new EnderecoDTO();
		endereco1.setLogradouro("Rua A");

		EnderecoDTO endereco2 = new EnderecoDTO();
		endereco2.setLogradouro("Rua B");

		ConsultaFilialDTO filial1 = new ConsultaFilialDTO();
		filial1.setNome("Filial A");
		filial1.setEndereco(endereco1);

		ConsultaFilialDTO filial2 = new ConsultaFilialDTO();
		filial2.setNome("Filial B");
		filial2.setEndereco(endereco2);

		List<ConsultaFilialDTO> listaFiliais = List.of(filial1, filial2);

		return ResponseEntity.ok(listaFiliais);

	}

}

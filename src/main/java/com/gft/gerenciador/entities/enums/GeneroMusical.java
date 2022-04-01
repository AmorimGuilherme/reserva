package com.gft.gerenciador.entities.enums;

import java.util.Arrays;
import java.util.List;

public enum GeneroMusical {

	AXE, ROCK, FUNK, PAGODE, GOSPEL, RAP, POP, FORRO, ELETRONICA;

	public static List<GeneroMusical> obterGeneros() {
		return Arrays.asList(GeneroMusical.values());
	}

}

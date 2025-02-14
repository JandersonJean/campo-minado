package com.janderson;

import com.janderson.modelo.Tabuleiro;
import com.janderson.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);

	}

}

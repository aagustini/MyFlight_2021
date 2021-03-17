package pucrs.myflight.consoleApp;

import pucrs.myflight.modelo.CiaAerea;
import pucrs.myflight.modelo.GerenciadorCias;

public class App {

	public static void main(String[] args) {
		// teste da classe cia
		CiaAerea cia1 = new CiaAerea("JJ", "TAM");
		CiaAerea tap = new CiaAerea("TP", "TAP Airlines");

		System.out.println(cia1);

		// teste do gerenciado de companias aéreas
		GerenciadorCias cadCias = new GerenciadorCias();
		cadCias.inserir(cia1);
		cadCias.inserir(tap);



	}
}

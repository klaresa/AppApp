package br.com.infnet.app.testes;

import br.com.infnet.app.controller.AppController;

public class AppTeste {
	public static void main(String[] args) {
		
		AppController controler = new AppController();
		
		controler.incluir("OiOi");
		controler.incluir("Alo");
		controler.incluir("HI");
		
		System.out.println("Escolas: " + controler.obterLista());
		
		controler.excluir(1);
		System.out.println("Escolas: " + controler.obterLista());
		
	}
}

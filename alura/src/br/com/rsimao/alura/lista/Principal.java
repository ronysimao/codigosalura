package br.com.rsimao.alura.lista;

public class Principal {
	public static void main(String[] args) throws InterruptedException {
		/**
		 *Implementação rústica de <i><b>List</b></i>
		 *feita à mão 
		 */
		/*
		Lista lista = new Lista();

		for (int i = 0; i < 10; i++) {
			new Thread(new TarefaAdicionarElemento(lista, i)).start();
		}

		Thread.sleep(2000);

		for (int i = 0; i < lista.tamanho(); i++) {
			System.out.println(i + " - " + lista.pegaElemento(i));
		}*/
		
//		List<String> lista = new Vector<String>();
		Lista lista = new Lista();
		
		for (int i = 0; i < 10; i++) {
			new Thread(new TarefaAdicionarElemento(lista, i)).start();
		}
		
//		Thread.sleep(2000);
		
		//este método foi para a TarefaImprimir
//		for (int i = 0; i < lista.tamanho(); i++) {
//			System.out.println(i + " - " + lista.pegaElemento(i));
//		}
		
		new Thread(new TarefaImprimir(lista)).start();
		
	}

}
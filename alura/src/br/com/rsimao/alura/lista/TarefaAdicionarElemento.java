package br.com.rsimao.alura.lista;

public class TarefaAdicionarElemento implements Runnable {

//	private List<String> lista;
	private Lista lista;
	private int numeroDaThread;

	public TarefaAdicionarElemento(Lista lista, int numero) {
		this.lista = lista;
		this.numeroDaThread =  numero;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
//			lista.add("Thread " + numeroDaThread + " - " + i);
			lista.adicionaElementos("Thread " + numeroDaThread + " - " + i );
		}
	}
}
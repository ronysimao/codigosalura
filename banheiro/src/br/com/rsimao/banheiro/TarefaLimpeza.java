package br.com.rsimao.banheiro;

public class TarefaLimpeza implements Runnable {

	private Banheiro banheiroDaTarefa;

	public TarefaLimpeza(Banheiro banheiro) {
		this.banheiroDaTarefa = banheiro;
	}

	@Override
	public void run() {
		while (true) {
			this.banheiroDaTarefa.limpa();

			try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

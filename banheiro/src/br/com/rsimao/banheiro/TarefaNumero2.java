package br.com.rsimao.banheiro;

public class TarefaNumero2 implements Runnable {

	/**
	 * @author ryso
	 * @funcionalidade: Esta linha cria um objeto Banheiro
	 */
	Banheiro banheiroDaTarefa = new Banheiro();

	/**
	 * @category esta tarefa é para quem quer mijar, recebe um {@value} <b>Banheiro</b> e
	 * atribui o mesmo ao banheiroDaTarefa
	 * @param banheiro
	 */
	public TarefaNumero2(Banheiro banheiro) {
		this.banheiroDaTarefa = banheiro;
	}
	/**
	 * roda o método do banheiro atribuído ao banheiroDaTarefa
	 * e faz a <i>atividade</i> número 2
	 */
	@Override
	public void run() {
		this.banheiroDaTarefa.fazNumero2();
	}

}

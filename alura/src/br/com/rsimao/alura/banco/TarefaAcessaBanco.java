package br.com.rsimao.alura.banco;

public class TarefaAcessaBanco implements Runnable {

	private PoolDeconexao pool;
	private GerenciadorDeTransacao tx;

	public TarefaAcessaBanco(PoolDeconexao pool, GerenciadorDeTransacao tx) {
		this.pool = pool;
		this.tx = tx;
	}

	@Override
	public void run() {
		synchronized (pool) {
			System.out.println("Peguei a chave do pool");
			pool.getConnection();

			synchronized (tx) {
				System.out.println("Peguei a chave da transação");
				tx.begin();
			}
		}
	}

}

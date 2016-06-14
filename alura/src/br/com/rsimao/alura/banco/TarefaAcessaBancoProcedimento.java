package br.com.rsimao.alura.banco;

public class TarefaAcessaBancoProcedimento implements Runnable {

	private PoolDeconexao pool;
	private GerenciadorDeTransacao tx;

	public TarefaAcessaBancoProcedimento(PoolDeconexao pool, GerenciadorDeTransacao tx) {
		this.pool = pool;
		this.tx = tx;
	}

	@Override
	public void run() {
		synchronized (pool) {
			System.out.println("Peguei a chave do pool");
			pool.getConnection();

			synchronized (tx) {
				System.out.println("Peguei a chave da Transação");
				tx.begin();
			}
		}
	}

}

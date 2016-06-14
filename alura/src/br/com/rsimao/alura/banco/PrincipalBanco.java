package br.com.rsimao.alura.banco;

public class PrincipalBanco {

	public static void main(String[] args) throws InterruptedException {
		GerenciadorDeTransacao tx = new GerenciadorDeTransacao();
		PoolDeconexao pool = new PoolDeconexao();
		
		new Thread(new TarefaAcessaBanco(pool, tx)).start();
		new Thread(new TarefaAcessaBancoProcedimento(pool,tx)).start();
	}

}
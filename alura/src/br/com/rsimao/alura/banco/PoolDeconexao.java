package br.com.rsimao.alura.banco;

public class PoolDeconexao {

	public String getConnection(){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "connection";
	}
}

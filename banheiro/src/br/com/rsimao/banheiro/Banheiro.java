package br.com.rsimao.banheiro;

public class Banheiro {

	private boolean estaSujo = true;

	public void fazNumero1() {

		String nome = Thread.currentThread().getName();

		System.out.println(nome + "..... batendo na porta");

		synchronized (this) {
			System.out.println(nome + "-> Entrando no Banheiro");

			while (estaSujo) {
				esperaLaFora(nome);
			}

			System.out.println(nome + "-> Mijando");

			dormeUmPouco(3000);

			fimDoServico(nome);
		}

	}

	public void fazNumero2() {
		String nome = Thread.currentThread().getName();

		System.out.println(nome + "..... batendo na porta");

		synchronized (this) {
			System.out.println(nome + "-> Entrando no Banheiro");

			while (estaSujo) {
				esperaLaFora(nome);
			}

			System.out.println(nome + "-> Cagando");

			dormeUmPouco(3000);

			fimDoServico(nome);
		}
	}

	/**
	 * Entra no banheiro, faz a limpeza e avisa que está limpo
	 */
	public void limpa() {

		String nome = Thread.currentThread().getName();

		System.out.println(nome + "..... batendo na porta");

		synchronized (this) {
			System.out.println(nome + "-> Entrando no Banheiro");

			while (!this.estaSujo) {
				System.out.println(nome + ", não está sujo, vou sair");
				return;
			}

			System.out.println(nome + ".... limpando o banheiro");
			this.estaSujo = false;

			dormeUmPouco(4000);

			this.notifyAll();

			System.out.println(nome + " saindo do banheiro");

		}
	}

	private void esperaLaFora(String nome) {

		System.out.println(nome + ", eca, banheiro está sujo!");

		try {
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	private void dormeUmPouco(long milissegundos) {

		try {
			Thread.sleep(milissegundos);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void fimDoServico(String nome) {

		estaSujo = true;
		System.out.println(nome + "-> Dando descarga");
		System.out.println(nome + "-> Lavando as mãos");
		System.out.println(nome + "-> Saindo do banheiro");
	}
}

package br.com.rsimao.alura.threads;

public class Principal {

	public static void main(String[] args) {
		
/*		String nome = "da";*/
		String nomeProcurado = "(Dan|Chad)(\\s|\\w)*";
		
		Thread threadAssinaturas1 = new Thread(new TarefaBuscaTextual("assinaturas1.txt", nomeProcurado));
		Thread threadAssinaturas2 = new Thread(new TarefaBuscaTextual("assinaturas2.txt", nomeProcurado));
		Thread threadAutores = new Thread(new TarefaBuscaTextual("autores.txt", nomeProcurado));
		
		threadAssinaturas1.start();
		threadAssinaturas2.start();
		threadAutores.start();
	}
}
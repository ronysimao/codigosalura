package br.com.rsimao.threads2.cliente;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClienteTarefas {

	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 12345);
		System.out.println("Conexão estabelecida");

		// enviando o comando c1 para o servidor
		PrintStream saida = new PrintStream(socket.getOutputStream());
		saida.println("c1");

		// aguardando o Enter
		Scanner teclado = new Scanner(System.in);
		teclado.nextLine();

		// fechando os recursos
		saida.close();
		teclado.close();
		socket.close();
	}

}

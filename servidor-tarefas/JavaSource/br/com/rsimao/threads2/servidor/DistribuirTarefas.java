package br.com.rsimao.threads2.servidor;

import java.net.Socket;
import java.util.Scanner;

public class DistribuirTarefas implements Runnable {

	private Socket socket;

	public DistribuirTarefas(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		System.out.println("Distribuindo mensagens para o cliente " + socket);

		try {
			Scanner entradaCliente = new Scanner(socket.getInputStream());

			while (entradaCliente.hasNextLine()) {
				String comando = entradaCliente.nextLine();
				System.out.println(comando);
			}
			
			entradaCliente.close();

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}
}

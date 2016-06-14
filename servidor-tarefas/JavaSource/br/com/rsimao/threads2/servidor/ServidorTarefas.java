package br.com.rsimao.threads2.servidor;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ServidorTarefas {

	public static void main(String[] args) throws Exception {

		System.out.println("---Servidor foi inicializado---");

		@SuppressWarnings("resource")
		ServerSocket servidor = new ServerSocket(12345);

		while (true) {
			Socket socket = servidor.accept();
			System.out.println("Aceitando novo cliente na porta " + socket.getPort());

			ExecutorService threadsPool = Executors.newFixedThreadPool(2);
			DistribuirTarefas distribuidor = new DistribuirTarefas(socket);
			threadsPool.execute(distribuidor);			
		}
	}
}
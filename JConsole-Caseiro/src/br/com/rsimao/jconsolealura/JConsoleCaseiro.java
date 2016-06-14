package br.com.rsimao.jconsolealura;

import java.util.Set;

public class JConsoleCaseiro {

	public static void main(String[] args) {

		Set<Thread> todasAsThreads = Thread.getAllStackTraces().keySet();

		Runtime runtime = Runtime.getRuntime();
		int qtdProcessadores = runtime.availableProcessors();
		System.out.println("Quantidade de processadores: " + qtdProcessadores);
		System.out.println("==================//===//=====================");
		
		
		for (Thread thread : todasAsThreads) {
			System.out.println("Nome: " + thread.getName());
			System.out.println("Contexto: " + thread.getContextClassLoader());
			System.out.println("Estado: " + thread.getState());
			System.out.println("Grupo: " + thread.getThreadGroup());
			System.out.println("Prioridade: " + thread.getPriority());
			System.out.println("==============================================");
		}
		
	}

}

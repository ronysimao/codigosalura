package br.com.rsimao.alura.banco;

import java.io.File;

public class DeadLock {

	public static File arquivo1 = new File("arquivo1.txt");

	public static File arquivo2 = new File("arquivo2.txt");

	public static void main(String[] args) {

		new Thread(new Runnable() {
			public void run() {

				synchronized (arquivo1) {

					System.out.println("Thread 1 ­ Adquiriu arquivo 1");

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
					synchronized (arquivo2) {
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
						}
						System.out.println("Thread 1 ­ Adquiriu arquivo 2");
						System.out.println("Thread 1 executou");
					}
				}
			}
		}).start();

		new Thread(new Runnable() {
			public void run() {

				synchronized (arquivo1) {

					System.out.println("Thread 2 ­ Adquiriu arquivo 1");

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
					synchronized (arquivo2) {

						System.out.println("Thread 2 ­ Adquiriu arquivo 2");
						System.out.println("Thread 2 executou");

					}
				}
			}
		}).start();
	}
}
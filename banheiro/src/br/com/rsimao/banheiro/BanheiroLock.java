package br.com.rsimao.banheiro;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BanheiroLock {
	private Lock trava = new ReentrantLock();

	public void fazNumero1() {
		trava.lock();
		
			System.out.println("entrando no banheiroLock");
			System.out.println("mijando");

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("dando descarga");
			System.out.println("lavando as mãos");
			System.out.println("saindo do banheiro");
		
		trava.unlock();
	}
	
	public void fazNumero2() {
		trava.lock();
		
			System.out.println("entrando no banheiroLock");
			System.out.println("cagando");

			try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("dando descarga");
			System.out.println("lavando as mãos");
			System.out.println("saindo do banheiro");
		
		trava.unlock();
	}
}

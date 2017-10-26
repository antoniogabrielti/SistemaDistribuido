package Atividade2;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Thread implements Runnable {
	private int qtdThread;
	
	
	public Thread(int qtdThread){
		this.qtdThread = qtdThread;
	}
	

	@Override
	public void run() {
		int resto = (100 % this.qtdThread);
		for(int i=1; i<=resto;i++){
			System.out.print(i);
		}
		
		
        try {
        	java.lang.Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Thread.class.getName()).log(Level.SEVERE, null, ex);
        }
		
	}

}

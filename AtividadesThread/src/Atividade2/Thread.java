package Atividade2;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Thread implements Runnable {
	private int start;
	private int end;
	
	
	public Thread(int start,int end){
		this.start = start;
		this.end = end;
	}
	

	@Override
	public void run() {
		
		for(int i=start; i<=this.end;i++){
			System.out.println(i);
		}
			
        try {
        	java.lang.Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Thread.class.getName()).log(Level.SEVERE, null, ex);
        }
		
	}

}

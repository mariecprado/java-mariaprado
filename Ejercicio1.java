import java.util.Random;
import java.lang.Thread;
import java.io.*;

public class Ejercicio1 implements Runnable {
	Thread t;

	public void run(){
		int numAltea = 0;
		Random rnd = new Random();
		
		for(int i = 0; i < 11; i++ ){
			int numero =rnd.nextInt(101);
			System.out.print(numero);
			if ((numero % 2) == 0){
				System.out.println(" yes");
			}else{
				System.out.println(" no");
			}
			try{
				Thread.sleep(1000);
			}catch(Exception e) {
            System.out.println(e);
         }
		}
	}
	public static void main(String[] args){
		Thread t = new Thread(new Ejercicio1());
		t.start();
		
	}
}
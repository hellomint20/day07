package random;

import java.util.Random;

public class TestClass01 {
	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			System.out.println(Math.random());
		}
		
		System.out.println("==========");
		for(int i=0; i<5; i++) {
			double ran = Math.random() * 5;
			System.out.println((int)ran);
		}
	
		System.out.println("==========");
		Random r = new Random();
		for(int i=0; i<5; i++) {
			int num = r.nextInt(45);	//0~44
			System.out.println(num+1);	//1~45
		}
	}
}

package Aula15exerc;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("entre com um n�mero");
		int num = scan.nextInt();
	     if (num >= 0){
	    	 System.out.println("O n�mero infomado � positivo"); 
	     } else {
	    	 System.out.println("O n�mero informado � negativo");
	     }
	}

}

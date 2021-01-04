package Aula15exerc;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("entre com uma letra:");
		String letra = scan.next();
		 
		/*if ( letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") 
			   || letra.equalsIgnoreCase ("i") || letra.equalsIgnoreCase ("o")
			   || letra.equalsIgnoreCase("u"));{
			 System.out.println("vogal");
           }  {
		    	System.out.println("consoante");
           }*/
		
		switch (letra ){
		  case"a":
		  case"e":
		  case"i":
		  case"o":
		  case"u":
		  case"A":
		  case"E":
		  case"I":
		  case"O":
		  case"U":System.out.println("vogal");break;
		  default: System.out.println("consoante");
		}

	}

}

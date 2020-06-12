package it.dstech.frasiPalindrome;

import java.util.Scanner;

public class frasiPalindrome {


	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("inserire parola o frase palindroma");
		String frase=in.nextLine().toLowerCase();
		String []app = frase.split(" ");
		int size = app.length;
		String fraseNOspazi="";
		for(int i=0;i<size;i++)fraseNOspazi+=app[i];
		boolean palindroma=false;
		for(int i=0;i<fraseNOspazi.length()/2;i++)
		{
			if(fraseNOspazi.charAt(i)==fraseNOspazi.charAt(fraseNOspazi.length()-i-1))palindroma=true;
			else {
				palindroma=false;
				break;
			}
		}
		if(palindroma)System.out.println(frase+" è palindroma");
		else System.out.println(frase+" non è palindroma");
	}

}

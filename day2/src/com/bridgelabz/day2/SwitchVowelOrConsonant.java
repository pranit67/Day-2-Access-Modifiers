package com.bridgelabz.day2;
import java.util.Scanner;
public class SwitchVowelOrConsonant {
	public static void main(String[] args) {
	Scanner sc =  new Scanner(System.in);
	System.out.println("Please Enter The Character: ");
	char X = sc.next().charAt(0);
	boolean tf = false;
	 switch(X) {
     case 'A' :
     case 'E' :
     case 'I' :
     case 'O' :
     case 'U' :
     case 'a' :
     case 'e' :
     case 'i' :
     case 'o' :
     case 'u' : tf = true;
  }
  if(tf == true){
     System.out.println("Given character is an vowel ");
  }else{
     System.out.println("Given character is a consonant ");
     
  }
	}
}

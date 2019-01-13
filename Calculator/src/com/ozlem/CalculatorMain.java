package com.ozlem;
import java.util.Scanner;
public class CalculatorMain {

	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		double a, b, result, islem;
		result = 0;
		System.out.println("entered for collection proccess 1, for subtraction process 2, for multiplication process 3 and for division process 4:");
		islem=read.nextInt();
		System.out.println("Enter first number:");
		a=read.nextInt(); 
		System.out.println("enter second number:");
		b=read.nextInt(); 
		if(islem==1){ 
		result=a + b;		
		}
		if(islem==2){
		result=a - b;
		}
		if(islem==3){
		result=a*b;
		}
		if(islem==4){
		result=a/b;
		}
		System.out.println("Result :" +result);
System.out.println("dasdad");
	}

}

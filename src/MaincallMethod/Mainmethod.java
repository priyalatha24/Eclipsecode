package MaincallMethod;

import java.util.Scanner;

import primeprob.Primeclass;

public class Mainmethod {
	public static void main(String[]args) {
		int arr[] ={17,21,15,13,5,19,16};	
		Primeclass obj = new Primeclass ();
		
		System.out.println("The prime numbers are : "+obj.primenumber(arr));
	}
	
	}

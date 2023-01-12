package paquete;

import java.util.Scanner;

public class clasemain {

	public static void main(String[] args) {
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un valor para 'a': ");
		a = sc.nextInt();
		System.out.print("Introduzca un valor para 'b': ");
		b = sc.nextInt();
		
		System.out.println("El valor de 'a' es " + a + " y el de 'b' " + b);
		
		System.out.println("El valor de a es primo? : "+clasemain.sumaDeNumerosEsPrimo(a));
		System.out.println("El valor de b es primo? : "+ clasemain.sumaDeNumerosEsPrimo(b));
		
		sc.close();
	    }
	public static boolean sumaDeNumerosEsPrimo(int x) {
		
		boolean primo = true; //declaramos este boolean llamado primo que equivale a true
		
		for (int i = 2; i<x; i++) {
			
			//En cada vuelta del for va a dividir el numero introducido entre i, si en algun caso resulta ser 0 pues el numero no es primo
			if (x % i == 0) {
				//entonces nuestro boolean pasa a ser false
				primo = false;
			}
		}
	return primo;//solicitamos que devuelva primo
	}
}

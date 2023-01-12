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
		sc.close();
	}

}

package paquete;

import java.util.Scanner;

public class clasemain {

	public static void main(String[] args) {
		int a, b;
		int opcion;
		double resultado = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un valor para 'a': ");
		a = sc.nextInt();
		System.out.print("Introduzca un valor para 'b': ");
		b = sc.nextInt();
		
		System.out.print("Si desea realizar una SUMA, pulse 1\n"
				+ "Si desea realizar una RESTA, pulse 2\n"
				+ "Si desea realizar una MULTIPLICACIÓN, pulse 3\n"
				+ "Si desea realizar una DIVISIÓN, pulse 4\n");
			opcion = sc.nextInt();
		
		switch(opcion) {
		case 1:
			resultado = a + b;
			break;
		case 2:
			resultado = a - b;
			break;
		case 3:
			resultado = a * b;
			break;
		case 4: 
			resultado = a / b;
		}
		
		System.out.print("El resultado de la operación es: " + resultado);
		
		sc.close();
		
	}

}

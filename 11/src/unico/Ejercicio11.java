package unico;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

//Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10.
		
		final int TOPEINF = 1;
		final int TOPESUP = 10;
		int num;
		int mult;
		
		for (num = TOPEINF; num <= TOPESUP; num++) {
            System.out.println("Tabla de multiplicar del " + num + ": ");
            for (mult= 1; mult <= TOPESUP; mult++) {
                System.out.println(num  + " X " + mult + " =" + (mult*num));
            }
	}
	}
}

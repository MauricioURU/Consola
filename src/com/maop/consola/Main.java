package com.maop.consola;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int choice = 0;
		
		do {
			
			System.out.println("1. Consola Win");
			System.out.println("2. Consola unix");
			System.out.println("0. Salir");
			Scanner sc = new Scanner(System.in);
			try {
				choice = sc.nextInt();
			}
			catch (Exception e) {
				System.out.println("Caracteres invalidos, reinicie el programa.\n");
			}
		
		
		switch (choice) {
		case 1: 
			WindowsSyntax winSyn = new WindowsSyntax();
			winSyn.runWin();
			break;
			
		case 2:
			UnixSyntax unixSyn = new UnixSyntax();
			unixSyn.runUnix();
			break;
			
		case 0: System.exit(0);
		
		default:
			System.out.print("Selecciona una opcion valida.\n\n");
			break;
		}
		

}while(true);

	}
}

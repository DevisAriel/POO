package ej3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe una palabra que creas que es un palindromo:");
        String palabra = scanner.nextLine();

        if (esPalindromo(palabra)) {
            System.out.println("La palabra " + palabra + " es un palidromo");
        } else {
            System.out.println("La palabra " + palabra + " no es un palidromo");
        }
        
    }
    
}
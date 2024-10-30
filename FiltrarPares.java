
package com.mycompany.filtrarpares;

public class FiltrarPares {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        
        // Popula o array com valores de exemplo
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1; // Preenche com números de 1 a 100
        }
        
        System.out.println("Números pares:");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }
}

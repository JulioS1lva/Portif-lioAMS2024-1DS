
package com.mycompany.filtrarimpares;

public class FiltrarImpares {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        
        // Popula o array com valores de exemplo
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1; // Preenche com números de 1 a 100
        }
        
        System.out.println("Números ímpares:");
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                System.out.println(numero);
            }
        }
    }
}


package com.mycompany.ordenarnumeros;

import java.util.Arrays;

public class OrdenarNumeros {
    public static void main(String[] args) {
        int[] numeros = new int[50];
        
        // Popula o array com valores de exemplo
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100); // Número aleatório entre 0 e 99
        }
        
        Arrays.sort(numeros); // Ordena em ordem crescente
        
        System.out.println("Array de 50 números em ordem crescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}

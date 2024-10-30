
package com.mycompany.vetornumerosdecrescentes;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class VetorNumerosDecrescentes {
    public static void main(String[] args) {
        Integer[] numeros = new Integer[50];
        Random random = new Random();

        // Preenche o vetor com 50 números aleatórios entre 0 e 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(101);
        }

        Arrays.sort(numeros, Collections.reverseOrder()); // Ordena em ordem decrescente

        System.out.println("Números em ordem decrescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}

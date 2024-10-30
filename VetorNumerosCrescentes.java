

package com.mycompany.vetornumeroscrescentes;
import java.util.Arrays;
import java.util.Random;

public class VetorNumerosCrescentes {
    public static void main(String[] args) {
        int[] numeros = new int[50];
        Random random = new Random();

        // Preenche o vetor com 50 números aleatórios entre 0 e 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(101);
        }

        Arrays.sort(numeros); // Ordena em ordem crescente

        System.out.println("Números em ordem crescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}


package com.mycompany.vetornomedecrescente;

import java.util.Arrays;
import java.util.Collections;

public class VetorNomeDecrescente {
    public static void main(String[] args) {
        String[] nomes = {"Carlos", "Ana", "Pedro", "Maria", "Bruno", "Paula", "Julios", "Ricardo", "Camila", "Julia", 
                          "Larissa", "Daniel", "Fernanda", "Luiz", "Renata"};
        
        Arrays.sort(nomes, Collections.reverseOrder()); // Ordena em ordem decrescente
        
        System.out.println("Nomes em ordem decrescente:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}

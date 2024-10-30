
package com.mycompany.vetornomecrescente;

import java.util.Arrays;

public class VetorNomeCrescente {
    public static void main(String[] args) {
        String[] nomes = {"Carlos", "Ana", "Pedro", "Maria", "Bruno", "Paula", "Julio", "Ricardo", "Camila", "Julia", 
                          "Larissa", "Daniel", "Fernanda", "Luiz", "Renata"};
        
        Arrays.sort(nomes); // Ordena em ordem crescente
        
        System.out.println("Nomes em ordem crescente:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}

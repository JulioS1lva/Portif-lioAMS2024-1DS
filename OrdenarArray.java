
package com.mycompany.ordenararray;

import java.util.Arrays;

public class OrdenarArray {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bruno", "Carlos", "Diana", "Eduardo", "Fernanda", "Gabriel", "Helena", "Igor", "Julia"};
        
        Arrays.sort(nomes); // Ordena em ordem crescente
        
        System.out.println("Array de 10 nomes em ordem crescente:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}

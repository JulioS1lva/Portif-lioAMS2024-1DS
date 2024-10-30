
package com.mycompany.ordenararray2;
import java.util.Arrays;
import java.util.Collections;

public class OrdenarArray2 {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bruno", "Carlos", "Diana", "Eduardo", "Fernanda", "Gabriel", "Helena", "Igor", "Julia",
                          "Karla", "Luan", "Mariana", "Maria", "Oscar", "Paula", "Quintino", "Renata", "Silvio", "Julio"};
        
        Arrays.sort(nomes, Collections.reverseOrder()); // Ordena em ordem decrescente
        
        System.out.println("Array de 20 nomes em ordem decrescente:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}

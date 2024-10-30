
package com.mycompany.campeonatobrasileiro;

public class CampeonatoBrasileiro {
    public static void main(String[] args) {
        String[] classificacao = {
            "1. Botafogo", "2. Palmeiras", "3. Flamengo", "4. Fortaleza", "5. Internacional",
            "6. Sao Paulo", "7. Bahia", "8. Cruzeiro", "9.Vasco", "10. Atletico-MG",
            "11. Gremio", "12. Criciuma", "13.Fluminense", "14. Vitoria (MELHOR TIME DA TABELA)",
            "15. Corinthians", "16. Athletico-PR ", "17. Bragantino", "18. Juventude", "19. Cuiaba",
            "20. Atletico-GO"
        };
        
        System.out.println("Classificaçao do Campeonato Brasileiro 2024 (dia 30/10/2024 onde o flamengo esta por enquanto ganhando):");
        for (String time : classificacao) {
            System.out.println(time);
        }
    }
}

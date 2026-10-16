package petshop;

import java.util.Scanner;

public class petShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do pet: ");
        String nome = sc.nextLine();
        System.out.print("Espécie: ");
        String especie = sc.nextLine();
        System.out.print("Peso (kg): ");
        double peso = sc.nextDouble();

        String porte;
        if (peso < 10) {
            porte = "Pequeno";
        } else if (peso < 25) {
            porte = "Médio";
        } else {
            porte = "Grande";
        }

        System.out.println("\n=== FICHA DO PETSHOP ===");
        System.out.println("Nome: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.printf("Peso: %.1f kg\n", peso);
        System.out.println("Porte: " + porte);
    }
}
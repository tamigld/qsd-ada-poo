package tech.ada.estudos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o peso da primeira pessoa em kg: ");
        double peso1 = scanner.nextDouble();

        System.out.println("Digite o peso da segunda pessoa em kg: ");
        double peso2 = scanner.nextDouble();

        final float FATOR_CONVERSAO_KG_LB = 2.20462f;

        System.out.printf("O peso da primeira pessoa em libras é %flb.%n", (peso1 * FATOR_CONVERSAO_KG_LB));
        System.out.printf("O peso da segunda pessoa em libras é %flb.%n", (peso2 * FATOR_CONVERSAO_KG_LB));
    }
}

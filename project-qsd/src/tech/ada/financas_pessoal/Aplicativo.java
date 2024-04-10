package tech.ada.financas_pessoal;

public class Aplicativo {
    public static void main(String[] args){
        final int valorDespesa1 = 100;
        String tipoDespesa1 = "Luz";

        int valorDespesa2 = 150;
        String tipoDespesa2 = "Água";

        int valorMedio = (valorDespesa1 + valorDespesa2) / 2;

        System.out.println("Valor mensal: " + valorMedio);


        int valorTotal = 0;
        valorTotal += valorDespesa1;
        valorTotal = valorTotal + valorDespesa1;

    }
}

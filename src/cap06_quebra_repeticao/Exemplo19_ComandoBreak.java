package cap06_quebra_repeticao;

public class Exemplo19_ComandoBreak {

    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};

        // trecho de código abaixo vai imprimir no console os 3 primeiros números pares existentes no array
        // que está sendo varrido; ou seja, o valor 144 não deve ser imprimido

        System.out.println("3 primeiros pares do array numeros:");
        int pares = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) { // condição para verificar se o elemento do array é par
                System.out.println(numero);
                pares++;
                if (pares == 3) {
                    break; // sai do loop FOR, pois não queremos imprimir no console mais nenhum numero par
                }
            }
        }
    }
}

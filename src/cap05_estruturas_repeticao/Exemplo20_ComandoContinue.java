package cap05_estruturas_repeticao;

public class Exemplo20_ComandoContinue {

    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};

        // trecho de código abaixo vai imprimir no console os 3 primeiros números pares existentes no array
        // que está sendo varrido

        System.out.println("3 primeiros pares do array numeros:");
        int pares = 0;
        for (int numero : numeros) {
            if (pares == 3 || numero % 2 == 1) {
                continue; // retorna ao início do loop e ignora o restante do bloco de código
            }
            System.out.println(numero);
            pares++;
        }

        // OBSERVAÇÃO:
        //
        // Notem que este exemplo realiza o mesmo objetivo que o do exemplo anterior, porém, usando o comando "continue",
        // que indica ao compilador voltar para o início do loop, em vez do "break", que informa o compilador para sair
        // do bloco de código do loop.
    }
}

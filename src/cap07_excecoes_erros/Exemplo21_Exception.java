package cap07_excecoes_erros;

public class Exemplo21_Exception {

    public static void main(String[] args) {

        // Lembra do ArrayIndexOutOfBoundsException do exemplo 05?
        // Vamos provocar essa exceção novamente e analisar o que acontece.

        int[] numeros = new int[5];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 5;
        numeros[4] = 8;
        numeros[5] = 13; // essa linha deve gerar o ArrayIndexOutOfBoundsException...

        // OBSERVAÇÕES:
        //
        // Esta exceção foi lançada pela JVM porque o array numeros foi instanciado com tamanho 5 e, sendo assim,
        // não é possível acessar o 6o elemento, que estaria fora dos limites do array.

    }
}

package cap07_excecoes_erros;

public class Exemplo22_TryCatch {

    public static void main(String[] args) {

        // Como no exemplo anterior, vamos instanciar um array, preencher seus elementos e tentar acessar uma posição fora
        // dos limites. A JVM vai lançar o ArrayIndexOutOfBoundsException e, então, iremos capturar a exceção com TRY-CATCH
        // e exibir uma mensagem amigável ao usuário.

        int[] numeros = new int[5];

        try {
            numeros[0] = 1;
            numeros[1] = 2;
            numeros[2] = 3;
            numeros[3] = 5;
            numeros[4] = 8;
            numeros[5] = 13; // essa linha deve gerar o ArrayIndexOutOfBoundsException...
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Vc tentou acessar uma posição do array que não existe!");
            System.out.println("O Java não permite adicionar ou acessar elementos de um array fora dos seus limite.");
        }

    }
}

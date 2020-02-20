package cap07_excecoes_erros;

public class Exemplo27_TryCatchFinally2 {

    public static void main(String[] args) {

        // Nesse exemplo, não provocaremos o lançamento de nenhuma execção. Contudo, o bloco de código definido no
        // finally será executado mesmo assim.

        int[] numeros = new int[5];

        try {
            numeros[0] = 1;
            numeros[1] = 2;
            numeros[2] = 3;
            numeros[3] = 5;
            numeros[4] = 8;
            System.out.println("O código executou corretamente até aqui... mas mesmo assim, o finally será acionado.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Vc tentou acessar uma posição do array que não existe!");
            System.out.println("O Java não permite adicionar ou acessar elementos de um array fora dos seus limite.");
        } catch (Exception e) {
            System.out.println("Algo inesperado ocorreu!");
            System.out.println("A exceção lançada foi "+e.getClass().getName());
            System.out.println("Mensagem da exceção: "+e.getMessage());
        } finally {
            // este trecho de código será executado obrigatoriamente após a execução do bloco de código do catch correspondente
            System.out.println("Este é o trecho do finally que sempre é executado ao final do TRY-CATCH");
        }

    }
}

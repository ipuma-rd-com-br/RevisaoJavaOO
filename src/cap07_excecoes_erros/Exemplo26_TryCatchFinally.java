package cap07_excecoes_erros;

public class Exemplo26_TryCatchFinally {

    public static void main(String[] args) {

        // Nesse exemplo, vamos provocar o lançamento de ArrayIndexOutOfBoundsException, vamos realizar o tratamento da
        // exceção com catch e vamos executar o bloco de código definido com finally, que sempre é executado quando
        // definido no TRY-CATCH.

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

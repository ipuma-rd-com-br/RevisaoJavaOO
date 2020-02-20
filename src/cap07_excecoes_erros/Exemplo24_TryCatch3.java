package cap07_excecoes_erros;

public class Exemplo24_TryCatch3 {

    public static void main(String[] args) {

        // Nesse exemplo, vamos provocar a mesma exceção lançada no exemplo anterior. Contudo, adicionamos o tratamento
        // da exceção NullPointerException para exibir uma mensagem amigável ao usuário.

        int[] numeros = null;

        try {
            numeros[0] = 1; // essa linha deve gerar o NullPointerException...
            numeros[1] = 2;
            numeros[2] = 3;
            numeros[3] = 5;
            numeros[4] = 8;
            numeros[5] = 13; // essa linha deveria gerar o ArrayIndexOutOfBoundsException...
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Vc tentou acessar uma posição do array que não existe!");
            System.out.println("O Java não permite adicionar ou acessar elementos de um array fora dos seus limite.");
        } catch (NullPointerException e) {
            System.out.println("O array está definido como null!");
            System.out.println("Instancie o array antes de começar a manipula-lo.");
        }

        // OBSERVAÇÕES:
        //
        // Notem que como a exceção lançada pela JVM foi NullPointerException. Como estava definido no TRY-CATCH
        // um tratemento para esta exceção, com o comando "catch(NullPointerException e)", a execução do trecho de código
        // é interrompido onde houve a exceção e vai diretamente para o bloco de código definido dentro do CATCH com
        // NullPointerException.
        //
        // Contudo, essa ainda não é a forma de definir usar o TRY-CATCH que vai garantir que qualquer exceção que venha
        // a ocorrer seja tratada adequadamente. Veremos no próximo exemplo como fazer isso.
    }
}

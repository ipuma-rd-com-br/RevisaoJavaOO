package cap07_excecoes_erros;

public class Exemplo25_TryCatch4 {

    public static void main(String[] args) {

        // Nesse exemplo, vamos provocar o lançamento de NullPointerException novamente. Porém, em vez de definir o
        // catch para NullPointerException explicitamente, vamos definir o catch para Exception, que é a classe-mãe (ou
        // superclasse) de todas as classes de exceções do Java. Assim, se houver alguma exceção não prevista nos catches
        // anteriores, o bloco de código desse catch será acionado e algum tratamento poderá ser realizado.

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
        } catch (Exception e) {
            System.out.println("Algo inesperado ocorreu!");
            System.out.println("A exceção lançada foi "+e.getClass().getName());
            System.out.println("Mensagem da exceção: "+e.getMessage());
        }

        // OBSERVAÇÕES:
        //
        // getClass() é um método da classe Object que Exception herda uma vez que todas as classes no Java são herdeiras
        // de Object.
        //
        // getMessage() é um método que Exception herda de Throwable, que retorna, quando possível, uma mensagem descritiva
        // relacionada à exceção lançada.

    }
}

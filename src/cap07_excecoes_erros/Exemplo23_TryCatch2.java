package cap07_excecoes_erros;

public class Exemplo23_TryCatch2 {

    public static void main(String[] args) {

        // Nesse exemplo, propositadamente, vamos somente definir uma variável array de int, mas não vamos instanciar o array.
        // Ou seja, o objeto array não será criado na memória e será definido o valor null para variável criada.
        //
        // A seguir, vamos tentar acessar os elementos do array, como se ele tivesse sido criado. Evidentemente, como o
        // array não foi criado, uma exceção será lançada.
        //
        // Vamos ver como se comporta o mesmo tratamento utilizado no exemplo anterior.

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
        }

        // OBSERVAÇÕES:
        //
        // Como é possível verificar ao rodar o método main(), uma exceção de NullPointerException foi lançada pela JVM
        // e o tratamento definido no TRY-CATCH não foi possível de ser realizado.
        //
        // O NullPointerException foi lançado porque a variável numeros estava definido com null. Quando um membro de um
        // objeto com null é acessado, a JVM lança essa exceção porque não há como acessar um objeto na memória sem saber
        // o seu endereço (lembrando que variáveis de objeto sempre guardam o endereço da memória em que o objeto está
        // armazenado).
        //
        // Para realizar o tratamento dessa exceção adequadamente, é necessário explicitamente definir um tratamento para
        // o NullPointerException, ou para uma classe de exceção superior, como a classe Exception.
        //
        // Veremos nos próximos exemplos como fazer isso.

    }
}

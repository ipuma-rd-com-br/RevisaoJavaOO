package cap07_excecoes_erros;

public class Exemplo30_ComandoThrow {

    public static void main(String[] args) {

        // Exemplo de uso do comando throw, que também serve para delegar o lançamento de exceções. Contudo, com throw
        // é possível definir os detalhes da exceção que será delegada.

        // Aqui vamos definir um método calculaODobroDeUmNumeroPar(), que recebe um valor do tipo int como parâmetro e
        // retorna o dobro do seu valor. Porém, se não for passado um valor par, o método devolve uma exceção específica
        // para essa situação.

        try {
            System.out.println("O dobro do número 2 é "+calculaODobroDeUmNumeroPar(2));
            System.out.println("O dobro do número 3 é "+calculaODobroDeUmNumeroPar(3)); // essa linha deve receber a exceção que será lançada pelo método calculaODobroDeUmNumeroPar()...
        } catch (Exception e) {
            System.out.println("Algo inesperado ocorreu!");
            System.out.println("A exceção lançada foi "+e.getClass().getName());
            System.out.println("Mensagem da exceção: "+e.getMessage());
        }

    }

    private static int calculaODobroDeUmNumeroPar(int i) throws Exception {
        if (i % 2 != 0) {
            // abaixo está o comando que cria um novo objeto de Exception para representar a exceção específica a
            // ser lançada e delega a quem chamou este método o tratamento da exceção
            throw new Exception("Este método só calcula o dobro de números pares! O número informado é impar: "+i);
        }
        return i * 2;
    }

    // OBSERVAÇÕES:
    //
    // Pesquisem sobre IllegalArgumentException e tentem adaptar esse exemplo com o uso dessa exceção.
}

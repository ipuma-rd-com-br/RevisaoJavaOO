package cap04_estruturas_decisao;

public class Exemplo10_ComandoIfElseifElse {

    public static void main(String[] args) {

        int numero = 1;
        System.out.println("definida variavel numero = "+numero);

        System.out.println("vai verificar se numero == 1, numero == 2, numero == 3 ou nenhum dos anteriores");
        if (numero == 1) {
            // bloco de código para caso essa condição do IF-ELSEIF for satisfeita
            System.out.println("vai imprimir isso no console se numero == 1");
        } else if (numero == 2) {
            // bloco de código para caso essa condição do IF-ELSEIF for satisfeita
            System.out.println("vai imprimir isso no console se numero == 2");
        } else if (numero == 3) {
            // bloco de código para caso essa condição do IF-ELSEIF for satisfeita
            System.out.println("vai imprimir isso no console se numero == 3");
        } else {
            // bloco de código para caso nenhuma das condições acima do IF-ELSEIF NÃO forem satisfeitas
            System.out.println("vai imprimir isso no console se numero != 1, 2 ou 3");
        }

        System.out.println("vai imprimir isso de qualquer forma, pois o código está fora do bloco do IF-ELSE");

        // OBSERVAÇÕES:
        //
        // Troque o valor da variável numero e execute o metódo main() novamente para observar o comportamento do código.

    }
}

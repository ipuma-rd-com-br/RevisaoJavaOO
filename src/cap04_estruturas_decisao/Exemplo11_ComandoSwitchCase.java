package cap04_estruturas_decisao;

public class Exemplo11_ComandoSwitchCase {

    public static void main(String[] args) {

        int numero = 1;
        System.out.println("definida variavel numero = "+numero);

        System.out.println("vai verificar se numero == 1, numero == 2, numero == 3 ou nenhum dos anteriores");
        switch (numero) {
            case 1:
                // bloco de código para caso numero == 1
                System.out.println("vai imprimir isso no console se numero == 1");
                break;
            case 2:
                // bloco de código para caso numero == 2
                System.out.println("vai imprimir isso no console se numero == 2");
                break;
            case 3:
                // bloco de código para caso numero == 3
                System.out.println("vai imprimir isso no console se numero == 3");
                break;
            default:
                // bloco de código para caso numero != 1, 2 ou 3
                System.out.println("vai imprimir isso no console se numero != 1, 2 ou 3");
        }

        System.out.println("vai imprimir isso de qualquer forma, pois o código está fora do bloco do SWITCH-CASE");

        // OBSERVAÇÕES:
        //
        // Troque o valor da variável numero e execute o metódo main() novamente para observar o comportamento do código.
        //
        // Notou o comando "break" ao final do bloco de código de cada "case"?
        //
        // O "break" vai informar o compilador para sair do bloco SWITCH-CASE. No próximo exemplo, vamos ver o que acontece
        // se o "break" é omitido no comando SWITCH-CASE.

    }

}

package cap04_estruturas_decisao;

public class Exemplo12_ComandoSwitchCase2 {

    public static void main(String[] args) {

        int numero = 1;
        System.out.println("definida variavel numero = "+numero);

        System.out.println("vai verificar se numero == 1, numero == 2, numero == 3 ou nenhum dos anteriores");
        switch (numero) {
            case 1:
                // bloco de código para caso numero == 1
                System.out.println("vai imprimir isso no console se numero == 1");
            case 2:
                // bloco de código para caso numero == 2
                System.out.println("vai imprimir isso no console se numero == 2");
            case 3:
                // bloco de código para caso numero == 3
                System.out.println("vai imprimir isso no console se numero == 3");
            default:
                // bloco de código para caso numero != 1, 2 ou 3
                System.out.println("vai imprimir isso no console se numero != 1, 2 ou 3");
        }

        System.out.println("vai imprimir isso de qualquer forma, pois o código está fora do bloco do SWITCH-CASE");

        // OBSERVAÇÕES:
        //
        // Troque o valor da variável numero e execute o metódo main() novamente para observar o comportamento do código.
        //
        // Notou que nesse exemplo não há o comando "break" ao final do bloco de código de cada "case"?
        //
        // Sem o "break", o compilador continua executando os blocos de código dos "cases" abaixo do 1o. "case" que
        // que apresenta o valor igual ao da variável que está sendo testada (no caso, a variável "numero").

    }
}

package cap07_excecoes_erros;

public class Exemplo28_ComandoThrows {

    public static void main(String[] args) {

        // Nesse exemplo, vamos demonstrar o funcionamento do comando throws, que define quais exceções um método
        // pode delegar a quem o chamar, caso a exceção ocorra dentro dele

        System.out.println("Método criaUmArrayMasTentaAcessarPosicaoForaDoLimite() será chamado...");
        criaUmArrayMasTentaAcessarPosicaoForaDoLimite();
        System.out.println("Esse texto nunca será exibido no console, pois a exceção lançada no método acima não foi tratada e a execução é interrompida.");
    }

    private static void criaUmArrayMasTentaAcessarPosicaoForaDoLimite() throws ArrayIndexOutOfBoundsException {

        int[] numeros = new int[5];

        numeros[0] = 1;
        numeros[1] = 1;
        numeros[2] = 1;
        numeros[3] = 1;
        numeros[4] = 1;
        numeros[5] = 1; // essa linha de código deve lançar um ArrayIndexOutOfBoundsException...

        // mas a execução não vai quebrar aqui dentro do método, pois ele delega a exceção para quem
        // o chamou, no caso, o método main()
    }
}

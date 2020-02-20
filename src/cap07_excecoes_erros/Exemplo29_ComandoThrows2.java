package cap07_excecoes_erros;

public class Exemplo29_ComandoThrows2 {

    public static void main(String[] args) {

        // Esse exemplo é semelhante ao anterior. A diferença é que a exceção delegada pelo método que usa o throws será
        // tratada com TRY-CATCH, impedindo que a execução seja interrompida.

        System.out.println("Método criaUmArrayMasTentaAcessarPosicaoForaDoLimite() será chamado...");
        try {
            criaUmArrayMasTentaAcessarPosicaoForaDoLimite();
        } catch (Exception e) {
            System.out.println("Algo inesperado ocorreu!");
            System.out.println("A exceção lançada foi "+e.getClass().getName());
            System.out.println("Mensagem da exceção: "+e.getMessage());
        }
        System.out.println("Agora esse texto será exibido no console, pois a exceção lançada no método acima foi tratada adequadamente e a execução não foi interrompida.");
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

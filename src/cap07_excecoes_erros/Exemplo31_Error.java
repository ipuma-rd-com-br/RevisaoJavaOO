package cap07_excecoes_erros;

public class Exemplo31_Error {

    public static void main(String[] args) {

        // Nesse exemplo, vamos provocar um erro de estouro de pilha de memória (StackOverflowError) através de chamadas
        // recursivas infinitas.
        //
        // Tentaremos tratar o erro com TRY-CATCH, mas veremos que é inútil, pois TRY-CATCH serve para tratar exceções e
        // um erro não é igual a uma exceção.
        //
        // Um erro é lançado quando há uma situação atípica, geralmente é um problema sério, relacionado a aspectos físicos,
        // como um estouro de pilha de memória. Quando situações como essa ocorrem, não é possível recuperar o sistema e
        // fazer a execução do programa prosseguir.

        try {
            fazChamadasRecursivasInfinitamente();
        } catch (Exception e) {
            System.out.println("Algo inesperado ocorreu!");
            System.out.println("A exceção lançada foi "+e.getClass().getName());
            System.out.println("Mensagem da exceção: "+e.getMessage());
        }

    }

    private static void fazChamadasRecursivasInfinitamente() {
        retornaSeZeroSenaoFazChamadaRecursiva(1);
    }

    private static void retornaSeZeroSenaoFazChamadaRecursiva(int i) {
        if (i == 0) {
            return;
        } else {
            retornaSeZeroSenaoFazChamadaRecursiva(i++);
        }
    }

}

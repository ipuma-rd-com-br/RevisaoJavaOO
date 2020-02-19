package cap01_metodo_main;

public class Ex02TiposPrimitivos {

    public static void main(String[] args) {

        // tipo booleand
        boolean tipoBooleano = true;        // true ou false, valor padrão = false

        // tipos de números inteiros
        byte tipoByte = 1;                  // faixa de -128 a 127 (tamanho de 8 bits), valor padrão = 0
        short tipoShort = 100;              // faixa de -32768 a 32767 (tamanho de 16 bits), valor padrão = 0
        int numeroInteiro = 1000;           // faixa de -2^31 a (2^31-1) (tamanho de 32 bits), valor padrão = 0
        long numeroInteiroLong = 1000000L;  // faixa de -2^63 a (2^63-1) (tamanho de 64 bits), valor padrão = 0L; note o "L" após o número, isso determina ao compilador que o valor é do tipo "long"

        // tipos de números flutuantes
        float numeroPontoFlutuante = 100.2345F;               // tamanho de 32 bits, valor padrão = 0.0F; note o "F" após o número, isso determina para o compilador que o valor é do tipo "float"
        double numeroPontoFlutuanteDouble = 1000000.23456789; // tamanho de 64 bits, valor padrão = 0

        // exibindo no console
        System.out.println("\nTipo Booleano:");
        System.out.println("tipoBooleano = "+tipoBooleano);
        System.out.println("\nTipos de Números Inteiros:");
        System.out.println("tipoByte = "+tipoByte);
        System.out.println("tipoShort = "+tipoShort);
        System.out.println("numeroInteiro = "+numeroInteiro);
        System.out.println("numeroInteiroLong = "+numeroInteiroLong);
        System.out.println("\nTipos de Números Flutuantes:");
        System.out.println("numeroPontoFlutuante = "+numeroPontoFlutuante);
        System.out.println("numeroPontoFlutuanteDouble = "+numeroPontoFlutuanteDouble);
    }
}

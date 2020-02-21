package cap01_tipos_java;

public class Exemplo02_TiposPrimitivos {

    public static void main(String[] args) {

        // tipo booleano

        // true ou false, valor padrão = false
        boolean booleano = true;

        System.out.println("\nTipo Booleano:");
        System.out.println("booleano: "+booleano);

        // tipo caracter

        // char (tamanho de 16 bits), valor padrão = 0
        char tipoChar = 'A';       // caracter simples
        char tipoChar2 = 65;       // número inteiro
        char tipoChar3 = '\u0041'; // código Unicode

        System.out.println("\nTipo Caracter:");
        System.out.println("tipoChar : "+tipoChar);
        System.out.println("tipoChar2: "+tipoChar2);
        System.out.println("tipoChar3: "+tipoChar3);

        // tipos de números inteiros

        // byte: faixa de -128 a 127 (tamanho de 8 bits), valor padrão = 0
        byte numeroByte = 1;

        // short: faixa de -32768 a 32767 (tamanho de 16 bits), valor padrão = 0
        short numeroShort = 100;

        // int: faixa de -2^31 a (2^31-1) (tamanho de 32 bits), valor padrão = 0
        int numeroInteiro = 1000;

        // long: faixa de -2^63 a (2^63-1) (tamanho de 64 bits), valor padrão = 0L
        // note o "L" após o número, isso determina ao compilador que o valor é do tipo "long"
        long numeroInteiroLong = 1000000L;

        System.out.println("\nTipos de Números Inteiros:");
        System.out.println("numeroByte       : "+numeroByte);
        System.out.println("numeroShort      : "+numeroShort);
        System.out.println("numeroInteiro    : "+numeroInteiro);
        System.out.println("numeroInteiroLong: "+numeroInteiroLong);

        // tipos de números flutuantes

        // float: faixa de -3.4028*10^38 a 3.4028*10^38, com precisão de 6-7 dígitos decimais (tamanho de 32 bits), valor padrão = 0.0F
        // note o "F" após o número, isso determina para o compilador que o valor é do tipo "float"
        float numeroPontoFlutuante = 100.2345F;

        // double: faixa de -1.7976*10^308 a 1.7976*10^308, com precisão de 15 dígitos (tamanho de 64 bits), valor padrão = 0
        double numeroPontoFlutuanteDouble = 1000000.23456789;

        System.out.println("\nTipos de Números Flutuantes:");
        System.out.println("numeroPontoFlutuante      : "+numeroPontoFlutuante);
        System.out.println("numeroPontoFlutuanteDouble: "+numeroPontoFlutuanteDouble);

        // excedendo os limites de faixa de valores de cada tipo
        numeroByte = (byte) 129;
        numeroShort = (short) 32768;
        numeroInteiro = (int) Math.pow(2, 31);                             // 2 elevado a 31 -> 2147483648
        numeroInteiroLong = (long) Math.pow(2, 63);                        // 2 elevado a 63 -> 9223372036854775808
        numeroPontoFlutuante = (float) ((3.4028 * Math.pow(10, 38)) * 10); // 3.4028 * 10 elevado a 38 -> 3.4028e+38
        numeroPontoFlutuanteDouble = ((1.7976 * Math.pow(10, 308)) * 10);  // 1.7976 * 10 elevado a 308 -> 1.7976e+308

        // A linha de comando "numeroByte = (byte) 129;" é um exemplo de casting (veremos mais sobre isso posteriormente).
        //
        // Sem o casting, o compilador dá erro, pois o inteiro 129 não cabe numa variável do tipo byte.
        //
        // Para contornar, fazemos o casting para informar o compilador que ele deve "converter" o valor inteiro 129
        // para um valor byte 129 (mas veremos que isso é um problema, devido à perda de precisão do valor)

        System.out.println("\nExcedendo os limites de cada Tipo Numérico:");
        System.out.println("numeroByte (= 129)                            : "+numeroByte);
        System.out.println("numeroShort (= 32768)                         : "+numeroShort);
        System.out.println("numeroInteiro (= 2147483648)                  : "+numeroInteiro);
        System.out.println("numeroInteiroLong (= 9223372036854775808)     : "+numeroInteiroLong);
        System.out.println("numeroPontoFlutuante (= 3.4028e+38 + 1)       : "+numeroPontoFlutuante);
        System.out.println("numeroPontoFlutuanteDouble (= 1.7976e+308 + 1): "+numeroPontoFlutuanteDouble);
    }
}

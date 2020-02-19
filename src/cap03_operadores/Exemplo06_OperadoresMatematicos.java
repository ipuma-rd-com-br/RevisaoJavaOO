package cap03_operadores;

public class Exemplo06_OperadoresMatematicos {

    public static void main(String[] args) {

        // operadores de aritmética

        int soma = 1 + 2;          // operador de adição
        int subtracao = 2 - 1;     // operador de subtração
        int multiplicacao = 2 * 3; // operador de multiplicação
        double divisao = 3.0 / 2;  // operador de divisão
        int restoDivisao = 3 % 2;  // operador de resto de divisão

        System.out.println("\nOperadores de aritmética:");
        System.out.println("soma          (1 + 2 = 3)  : "+soma);
        System.out.println("subtracao     (2 - 1 = 1)  : "+subtracao);
        System.out.println("multiplicacao (2 * 3 = 6)  : "+multiplicacao);
        System.out.println("divisao       (3 / 2 = 1.5): "+divisao);
        System.out.println("restoDivisao  (3 % 2 = 1)  : "+restoDivisao);

        // operadores de precedência de operação "(" e ")"

        int comParenteses = (1 + 2) * 3; // vai resolver a conta dentro do parênteses primeiramente
        int semParenteses = 1 + 2 * 3; // vai resolver a conta de multiplicação primeiramente

        System.out.println("\nOperadores de precedência de operação:");
        System.out.println("(1 + 2) * 3 = 9: "+comParenteses);
        System.out.println(" 1 + 2  * 3 = 7  : "+semParenteses);

        // operador de incremento

        int i = 0;
        System.out.println("\nOperador de incremento:");
        System.out.println("i = "+i);
        i++; // mesmo que i = i + 1;
        System.out.println("após i++");
        System.out.println("i = "+i);

        // operadores para acumulação (shortcut)
        int numero = 0;
        System.out.println("\nOperadores de acumulação (shortcut)");
        System.out.println("numero = "+numero);

        numero += 10; // mesmo que: numero = numero + 10;
        System.out.println("após numero += 10");
        System.out.println("numero = "+numero);

        numero -= 2; // mesmo que: numero = numero - 2;
        System.out.println("após numero -= 2");
        System.out.println("numero = "+numero);

        numero *= 2; // mesmo que: numero = numero * 2;
        System.out.println("após numero *= 2");
        System.out.println("numero = "+numero);

        numero /= 4; // mesmo que: numero = numero / 2;
        System.out.println("após numero /= 4");
        System.out.println("numero = "+numero);

    }
}

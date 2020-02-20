package cap08_classes_objetos;

public class Exemplo34_Construtores2 {

    public static void main(String[] args) {

        UmaClasseQualquerComConstrutorComParametros qualquer =
                new UmaClasseQualquerComConstrutorComParametros(10, "ABC");
        qualquer.atributoInt = 100;
        qualquer.atributoString = "DEF";
        qualquer.executaMetodoQualquer();

        // o comando abaixo está comentado porque não compila
        // o motivo é que a criação do objeto está sendo feito com chamada do construtor padrão da classe
        // UmaClasseQualquerComConstrutorComParametros, que não foi definido
        //UmaClasseQualquerComConstrutorComParametros outro = new UmaClasseQualquerComConstrutorComParametros();

        /*
        OBSERVAÇÕES:

        UmaClasseQualquerComConstrutorComParametros é um exemplo de classe com construtor com parâmetros definido.
        Verifiquem o código de UmaClasseQualquerComConstrutorComParametros.

        Notem que, como foi definido um construtor com parâmetros na classe UmaClasseQualquerComConstrutorComParametros,
        o compilador Java não inclui automaticamente um construtor padrão.

        Para que exista um construtor padrão e um construtor com parâmetros na mesma classe, todos os construtores devem
        ser definidos explicitamente no código da classe.
         */

    }
}

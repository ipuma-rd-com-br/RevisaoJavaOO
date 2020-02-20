package cap08_classes_objetos;

public class Exemplo33_Construtores {

    public static void main(String[] args) {

        UmaClasseQualquerComConstrutorPadrao qualquer = new UmaClasseQualquerComConstrutorPadrao();

        qualquer.atributoInt = 10;
        qualquer.atributoString = "ABC";

        qualquer.executaMetodoQualquer();

        /*
        OBSERVAÇÕES:

        UmaClasseQualquerComConstrutorPadrao é um exemplo de classe com construtor padrão definido. Verifiquem o código
        de UmaClasseQualquerComConstrutorPadrao.

        Notem que o comando new realiza a criação de um objeto fazendo a chamada do construtor de sua classe.

        Notem também que, no exemplo anterior, a classe UmaClasseQualquer não tem construtor definido. Contudo, mesmo
        assim, o comando new funciona e faz a chamada do construtor para crir o objeto.

        Isso acontece porque o compilador Java automaticamente inclui um construtor padrão caso não seja explicitamente
        declarado no código da classe.
         */

    }
}

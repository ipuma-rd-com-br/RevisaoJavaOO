package cap08_classes_objetos;

/**
 * Uma classe qualquer com um construtor padrão.
 *
 * Veja como definir um construtor padrão no código abaixo.
 */
class UmaClasseQualquerComConstrutorPadrao {

    // atributos
    int atributoInt;
    String atributoString;

    // métodos
    void executaMetodoQualquer() {
        System.out.println("Imprimindo no console um texto qualquer.");
    }

    // construtor padrão
    UmaClasseQualquerComConstrutorPadrao() {
        // esse comando executa o construtor da classe-mae (ou superclasse)
        // no entanto, no construtor padrão, essa chamada é opcional (pois a JVM vai executar o construtor da
        // superclasse obrigatoriamente)
        super();

        System.out.println("O construtor padrão da classe UmaClasseQualquerComConstrutorPadrao foi chamado.");
    }

}

package cap08_classes_objetos;

class UmaClasseQualquerComConstrutoresPadraoEComParametros {

    // atributos
    int atributoInt;
    String atributoString;

    // métodos
    void executaMetodoQualquer() {
        System.out.println("Imprimindo no console um texto qualquer.");
    }

    // construtor com parâmetros
    UmaClasseQualquerComConstrutoresPadraoEComParametros(int numero, String texto) {
        // o this é usado para referenciar os membros da própria classe
        this.atributoInt = numero;
        this.atributoString = texto;
        System.out.println("O construtor com parâmetros da classe UmaClasseQualquerComConstrutoresPadraoEComParametros foi chamado.");
    }

    // construtor padrão
    UmaClasseQualquerComConstrutoresPadraoEComParametros() {
        System.out.println("O construtor padrão da classe UmaClasseQualquerComConstrutoresPadraoEComParametros foi chamado.");
    }

}

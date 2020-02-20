package cap08_classes_objetos;

class UmaClasseQualquerComConstrutorComParametros {

    // atributos
    int atributoInt;
    String atributoString;

    // métodos
    void executaMetodoQualquer() {
        System.out.println("Imprimindo no console um texto qualquer.");
    }

    // construtor com parâmetros
    UmaClasseQualquerComConstrutorComParametros(int numero, String texto) {
        // o this é usado para referenciar os membros da própria classe
        this.atributoInt = numero;
        this.atributoString = texto;
        System.out.println("O construtor com parâmetros da classe UmaClasseQualquerComConstrutorComParametros foi chamado.");
    }

}

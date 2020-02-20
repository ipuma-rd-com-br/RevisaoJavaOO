package cap09_heranca;

public class Exemplo36_Heranca {

    public static void main(String[] args) {

        UmaSuperClasse superclasse = new UmaSuperClasse();
        superclasse.umAtributoInt = 10;
        superclasse.umAtributoString = "ABC";
        //superclasse.outroAtributoString = "DEF"; // essa linha dá erro de compilação, pois o atributo não existe em UmaSuperClasse
        superclasse.umMetodoQualquer();
        //superclasse.outroMetodoQualquer(); // essa linha tbm dá erro de compilação, pois o método não existe em UmaSuperClasse

        UmaSubClasse subclasse = new UmaSubClasse();
        subclasse.umAtributoInt = 20; // atributo herdado de UmaSuperClasse
        subclasse.umAtributoString = "ABC"; // atributo herdado de UmaSuperClasse
        subclasse.outroAtributoString = "DEF"; // atributo que só existe em UmaSubClasse
        subclasse.umMetodoQualquer(); // método herdado de UmaSuperClasse
        subclasse.outroMetodoQualquer(); // método que só existe em UmaSubClasse

        /*
        OBSERVAÇÕES:

        UmaSubClasse é uma classe-filha (ou subclasse) de UmaSuperClase, que é sua classe-mae (ou super-classe).

        Verifiquem os códigos de UmaSubClasse e UmaSuperClasse.

        Notem que ao criar um objeto de uma subclasse, automaticamente o construtor da superclasse é executado antes
        da execução do construtor da subclasse.
         */
    }
}

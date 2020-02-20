package cap11_sobrecarga_sobrescrita;

public class Exemplo39_Sobrescrita {

    public static void main(String[] args) {

        UmaSuperClasse superclasse = new UmaSuperClasse();
        superclasse.umMetodo();
        superclasse.outroMetodo();

        UmaSubClasse subclasse = new UmaSubClasse();
        subclasse.umMetodo(); // método herdado de UmaSuperClasse
        subclasse.outroMetodo(); // método sobrescrito em UmaSubClasse

        /*
        OBSERVAÇÕES:

        UmaSubClasse é uma classe que é herdeira de UmaSuperClasse, logo herda todos seus métodos e atributos. No entanto,
        UmaSubClasse sobrescreve o método outroMetodo(), realizando uma implementação diferente da definida na super-classe.

        Verifiquem o código de UmaSubClasse e UmaSuperClasse.
         */
    }
}

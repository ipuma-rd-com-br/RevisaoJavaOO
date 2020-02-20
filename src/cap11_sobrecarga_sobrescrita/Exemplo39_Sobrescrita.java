package cap11_sobrecarga_sobrescrita;

public class Exemplo39_Sobrescrita {

    public static void main(String[] args) {

        UmaSuperClasse superclasse = new UmaSuperClasse();
        superclasse.umMetodo();
        superclasse.outroMetodo();

        UmaSubClasse subclasse = new UmaSubClasse();
        subclasse.umMetodo(); // método herdado de UmaSuperClasse
        subclasse.outroMetodo(); // método sobrescrito em UmaSubClasse
    }
}

package cap10_interface;

public class Exemplo37_Interface {

    public static void main(String[] args) {

        UmaClasse uma = new UmaClasse();
        uma.umMetodo();
        uma.outroMetodo();

        OutraClasse outra = new OutraClasse();
        outra.umMetodo();
        outra.outroMetodo();

        MaisOutraClasse maisOutra = new MaisOutraClasse();
        maisOutra.umMetodo();
        maisOutra.outroMetodo();

        /*
        OBSERVAÇÕES:

        UmaClasse, OutraClasse e MaisOutraClasse são classes que implementam a interface UmaInterface.

        Verifiquem os códigos de UmaClasse, OutraClasse, MaisOutraClasse e UmaInterface.
         */
    }
}

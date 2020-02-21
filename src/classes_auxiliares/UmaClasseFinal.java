package classes_auxiliares;

public final class UmaClasseFinal {

    private int umAtributoInt;
    private String umAtributoString;

    public UmaClasseFinal(int numero, String texto) {
        this.umAtributoInt = numero;
        this.umAtributoString = texto;
        System.out.println("Construtor da classe UmaClasseFinal foi chamado.");
    }

    public void umMetodo() {
        System.out.println("Chamado umMetodo() de UmaClasseFinal.");
        System.out.println("this.umAtributoInt: "+this.umAtributoInt);
        System.out.println("this.umAtributoString: "+this.umAtributoString);
    }
}

package classes_auxiliares;

public class UmaClasseComMembrosPrivate {

    private int atributoInt;
    private String atributoString;

    private void executaMetodoPrivate() {
        System.out.println("Executando este método, que é private.");
    }

    public void executaMetodoPublicQueExecutaUmMetodoPrivate() {
        System.out.println("Executando este método, que é public.");
        executaMetodoPrivate();
    }
}

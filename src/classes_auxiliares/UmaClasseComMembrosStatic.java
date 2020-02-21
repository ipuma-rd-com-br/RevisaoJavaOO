package classes_auxiliares;

public class UmaClasseComMembrosStatic {

    public int umAtributoInt;
    public static int umAtributoIntStatic;

    public UmaClasseComMembrosStatic() {
        System.out.println("Chamado construtor padrão de UmaClasseComMembrosStatic.");
    }

    public void umMetodo() {
        System.out.println("Chamado umMetodo() de UmaClasseComMembrosStatic.");
        System.out.println("this.umAtributoInt: "+this.umAtributoInt);
        System.out.println("this.umAtributoIntStatic: "+this.umAtributoIntStatic);
    }

    public static void umMetodoStatic() {
        System.out.println("Chamado umMetodoStatic() de UmaClasseComMembrosStatic.");
        //System.out.println("this.umAtributoInt: "+umAtributoInt); // não compila, pois membros de instância não podem ser acessados em métodos static
        System.out.println("umAtributoIntStatic: "+umAtributoIntStatic);
    }
}

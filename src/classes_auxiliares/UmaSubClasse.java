package classes_auxiliares;

public class UmaSubClasse extends UmaClasseComMembrosProtected {

    public void metodoQueAcessaMembrosDaSuperClasse() {
        //this.umAtributoPrivate = 10; // não compila, porque o atributo é private na superclasse e não acessível na subclasse
        this.umAtributoProtected = 20; // atributo protected, acessível na subclasse
        this.umAtributoPublic = 30; // atributo public, acessível para todos
        System.out.println("Executando metodoQueAcessaMembrosDaSuperClasse() de UmaSubClasse que herda de UmaClasseComMembrosProtected");
        System.out.println("umAtributoProtected: "+this.umAtributoProtected);
        System.out.println("umAtributoPublic: "+this.umAtributoPublic);
    }
}

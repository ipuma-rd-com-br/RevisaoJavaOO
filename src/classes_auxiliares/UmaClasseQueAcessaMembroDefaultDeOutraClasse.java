package classes_auxiliares;

public class UmaClasseQueAcessaMembroDefaultDeOutraClasse {
    
    public void metodoQueAcessaMembrosDefaultDeOutraClasse() {
        UmaClasseComMembrosDefault umaClasse = new UmaClasseComMembrosDefault();
        //umaClasse.umAtributoPrivate = 10; // não compila
        umaClasse.umAtributoProtected = 20;
        umaClasse.umAtributoDefault = 30;
        umaClasse.umAtributoPublic = 40;
        System.out.println("Executando método metodoQueAcessaMembrosDefaultDeOutraClasse() de UmaClasseQueAcessaMembroDefaultDeOutraClasse");
        System.out.println("umAtributoProtected: "+umaClasse.umAtributoProtected);
        System.out.println("umAtributoDefault: "+umaClasse.umAtributoDefault);
        System.out.println("umAtributoPublic: "+umaClasse.umAtributoPublic);
    }
}

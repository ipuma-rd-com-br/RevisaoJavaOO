package cap12_modificadores_acesso;

import classes_auxiliares.UmaClasseComMembrosFinal;

public class Exemplo44_ModificadorFinal {

    public static void main(String[] args) {

        UmaClasseComMembrosFinal umaClasse = new UmaClasseComMembrosFinal(10, 20);

        // compila ok
        umaClasse.umAtributoPublic = 100;

        // não compila, pois o atributo foi definido como final, assim, seu valor não pode mais ser modificado após
        // sua inicialização
        //umaClasse.umAtributoPublicFinal = 200;
    }
}

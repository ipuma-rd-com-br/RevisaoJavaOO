package cap12_modificadores_acesso;

import classes_auxiliares.UmaClasseComMembrosFinal;
import classes_auxiliares.UmaClasseComMetodoFinal;

public class Exemplo45_ModificadorFinal2 {

    public static void main(String[] args) {

        UmaClasseComMetodoFinal umaClasse = new UmaClasseComMetodoFinal();
        umaClasse.umMetodoFinal();

        // Verifiquem o código da classe UmaSubClasseQueTentaSobrescreverMetodoFinal.
        //
        // A classe é herdeira de UmaClasseComMetodoFinal, tenta sobrescrever o método umMetodoFinal() da superclasse,
        // mas o código não compila, pois o método é definido como final.

    }
}

package cap12_modificadores_acesso;

import classes_auxiliares.UmaClasseComMembrosPublic;

public class Exemplo40_ModificadorPublic {

    public static void main(String[] args) {

        UmaClasseComMembrosPublic umaClasse = new UmaClasseComMembrosPublic();

        umaClasse.atributoInt = 10;
        umaClasse.atributoString = "ABC";

        umaClasse.executaMetodoPublic();

        /*
         OBSERVAÇÕES:

         Verifiquem o código da classe UmaClasseComMembrosPublic.

         Os atributos atributoInt e atributoString, assim como o método executaMetodoPublic(), foram declarados com o
         modificador de acesso public. Assim, ficam acessíveis para todas as classes que instanciarem um objeto da classe.
         */
    }
}

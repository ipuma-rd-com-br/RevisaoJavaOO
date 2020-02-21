package cap12_modificadores_acesso;

import classes_auxiliares.UmaClasseComMembrosPrivate;

public class Exemplo41_ModificadorPrivate {

    public static void main(String[] args) {

        UmaClasseComMembrosPrivate umaClasse = new UmaClasseComMembrosPrivate();

        // os comando abaixo estão comentados porque dão erro de compilação, pois tentam acessar membros (ou seja,
        // atributos ou métodos) do objeto que são private

        // umaClasse.atributoInt;
        // umaClasse.atributoString;
        // umaClasse.executaMetodoPrivate();

        // esse comando funciona porque o método acessado é public
        umaClasse.executaMetodoPublicQueExecutaUmMetodoPrivate();

        /*
         OBSERVAÇÕES:

         Verifiquem o código da classe UmaClasseComMembrosPrivate.

         Os atributos atributoInt e atributoString, assim como o método executaMetodoPrivate(), foram declarados com o
         modificador de acesso private. Assim, ficam acessíveis somente na própria classe.
         */
    }
}

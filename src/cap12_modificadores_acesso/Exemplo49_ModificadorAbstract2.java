package cap12_modificadores_acesso;

import classes_auxiliares.UmaClasseComMetodoAbstract;

public class Exemplo49_ModificadorAbstract2 {

    public static void main(String[] args) {

        // não compila, pois UmaClasseComMetodoAbstract é definida como abstract, logo não pode ser instanciada (ou seja, pbjetos
        // não podem ser criados a partir desta classe)
        //UmaClasseComMetodoAbstract umaClasse = new UmaClasseComMetodoAbstract();

        /*
        OBSERVAÇÕES:

        Verifiquem o código da classe UmaClasseComMetodoAbstract.

        Como UmaClasseComMetodoAbstract foi definida como abstract, isso significa que é uma classe abstrata. Ou seja, nunca pode
        ser instanciada, apenas ser extendida por outras subclasses.
         */

    }
}

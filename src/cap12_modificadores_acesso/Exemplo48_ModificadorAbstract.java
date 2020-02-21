package cap12_modificadores_acesso;

import classes_auxiliares.UmaClasseAbstract;

public class Exemplo48_ModificadorAbstract {

    public static void main(String[] args) {

        // não compila, pois UmaClasseAbstract é definida como abstract, logo não pode ser instanciada (ou seja, pbjetos
        // não podem ser criados a partir desta classe)
        //UmaClasseAbstract umaClasse = new UmaClasseAbstract();

        /*
        OBSERVAÇÕES:

        Verifiquem o código da classe UmaClasseAbstract.

        Como UmaClasseAbstract foi definida como abstract, isso significa que é uma classe abstrata. Ou seja, nunca pode
        ser instanciada, apenas ser extendida por outras subclasses.
         */
    }
}

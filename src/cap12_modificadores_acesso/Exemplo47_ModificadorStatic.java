package cap12_modificadores_acesso;

import classes_auxiliares.UmaClasseComMembrosStatic;
import classes_auxiliares.UmaClasseFinal;

public class Exemplo47_ModificadorStatic {

    public static void main(String[] args) {

        UmaClasseComMembrosStatic umaClasse = new UmaClasseComMembrosStatic();
        umaClasse.umAtributoInt = 10;
        umaClasse.umAtributoIntStatic = 100;
        umaClasse.umMetodo();
        umaClasse.umMetodoStatic();

        // outra forma de acessar membros static em uma classe
        UmaClasseComMembrosStatic.umAtributoIntStatic = 200;
        UmaClasseComMembrosStatic.umMetodoStatic();

        umaClasse.umMetodoStatic();

        // criando outro objeto de UmaClasseComMembrosStatic
        UmaClasseComMembrosStatic outraClasse = new UmaClasseComMembrosStatic();
        outraClasse.umAtributoInt = 99;
        outraClasse.umAtributoIntStatic = 999;
        outraClasse.umMetodo();
        outraClasse.umMetodoStatic();

        umaClasse.umMetodoStatic();

        /*
        OBSERVAÇÕES:

        Verifiquem o código da classe UmaClasseComMembrosStatic.

        Notem que os atributos definidos como static são únicos para todas as instâncias (ou objetos) da classe.

        Isso significa que os dois objetos de UmaClasseComMembrosStatic compartilham dos mesmo membros static.
         */


    }
}

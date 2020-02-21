package cap12_modificadores_acesso;

import classes_auxiliares.UmaClasseComMembrosDefault;
import classes_auxiliares.UmaClasseQueAcessaMembroDefaultDeOutraClasse;

public class Exemplo43_ModificadorDefault {

    public static void main(String[] args) {

        UmaClasseQueAcessaMembroDefaultDeOutraClasse outraClasse = new UmaClasseQueAcessaMembroDefaultDeOutraClasse();
        outraClasse.metodoQueAcessaMembrosDefaultDeOutraClasse();

        UmaClasseComMembrosDefault umaClasse = new UmaClasseComMembrosDefault();

        // nao compila, pois o atributo é private e somente acessível dentro da propria classe
        //umaClasse.umAtributoPrivate = 10;

        // nao compila, pois o atributo é protected e somente acessível dentro da propria classe e nas suas subclasses
        //umaClasse.umAtributoProtected = 20;

        // nao compila, pois o atributo é default e somente acessível dentro da propria classe, nas suas subclasses e
        // nas demais classes contidas no mesmo pacote
        //umaClasse.umAtributoDefault = 30;

        // compila, pois o atributo é public
        umaClasse.umAtributoPublic = 40;

        /*
         OBSERVAÇÕES:

         Verifiquem os códigos das classes UmaClasseQueAcessaMembroDefaultDeOutraClasse e UmaClasseComMembrosDefault.

         UmaClasseComMembrosDefault contém membros de default, sendo assim, somente as classes contidas no mesmo pacote
         (ou package) da classe conseguem acessar os membros default.

         UmaClasseQueAcessaMembroDefaultDeOutraClasse é uma classe que está no mesmo pacote de UmaClasseComMembrosDefault,
         por isso ela consegue acessar os membros default de UmaClasseComMembrosDefault.

         Contudo, a classe Exemplo43_ModificadorDefault, que instancia um objeto de UmaClasseComMembrosDefault, não consegue
         acessar os atributos private, protected e default.
         */

    }
}

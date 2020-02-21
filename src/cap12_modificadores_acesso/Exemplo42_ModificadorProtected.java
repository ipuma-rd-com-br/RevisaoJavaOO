package cap12_modificadores_acesso;

import classes_auxiliares.UmaClasseComMembrosProtected;
import classes_auxiliares.UmaSubClasse;

public class Exemplo42_ModificadorProtected {

    public static void main(String[] args) {

        UmaSubClasse subclasse = new UmaSubClasse();
        subclasse.metodoQueAcessaMembrosDaSuperClasse();

        UmaClasseComMembrosProtected umaClasse = new UmaClasseComMembrosProtected();
        //umaClasse.umAtributoPrivate = 10; // não compila, porque umAtributoPrivate é private, somente acessivel na própria classe
        //umaClasse.umAtributoProtected = 20; // não compila, porque umAtributo é protected, somente acessível na própria classe e nas suas subclasses
        umaClasse.umAtributoPublic = 10; // acessível porque é public

        /*
         OBSERVAÇÕES:

         Verifiquem os códigos das classes UmaSubClasse e UmaClasseComMembrosProtected.

         UmaSubClasse é herdeira dos membros de UmaClasseComMembrosProtected. Os membros de UmaClasseComMembrosProtected
         são acessíveis somente na própria classe e nas suas subclasses, por isso UmaSubClasse consegue acessar o atributo
         umAtributoProtected.

         Contudo, a classe Exemplo42_ModificadorProtected, que instancia um objeto de UmaClasseComMembrosProtected, não consegue
         acessar os atributos private e protected.
         */
    }
}

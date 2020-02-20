package cap09_heranca;

class UmaSubClasse extends UmaSuperClasse {

    // a relação de herança entre classes é definida pelo comando extends na definição da classe
    //
    // como UmaSubClasse é herdeira de UmaSuperClasse, todos os membros (atributos e métodos) de UmaSuperClasse são
    // adicionadas implicitamente em UmaSubClasse
    //
    // somente os membros que só devem existir em UmaSubClasse devem ser definidos aqui

    String outroAtributoString;

    void outroMetodoQualquer() {
        System.out.println("UmaSubClasse imprimindo no console outro texto qualquer.");
    }

    UmaSubClasse() {
        System.out.println("Chamado construtor padrão de UmaSubClasse");
    }
}

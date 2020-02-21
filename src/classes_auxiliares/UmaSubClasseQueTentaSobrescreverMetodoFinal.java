package classes_auxiliares;

public class UmaSubClasseQueTentaSobrescreverMetodoFinal extends UmaClasseComMetodoFinal {

    // o método abaixo não compila, pois foi definido como final na superclasse
    // ou seja, não pode ser sobrescrito
//    public void umMetodoFinal() {
//        System.out.println("Exibindo texto em umMetodoFinal() de UmaSubClasseQueTentaSobrescreverMetodoFinal");
//    }

}

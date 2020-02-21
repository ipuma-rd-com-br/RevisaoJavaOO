package cap13_collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class Exemplo51_Set {

    public static void main(String[] args) {

        // Set é uma interface do pacote java.util que define os membros que as classes que a implementam devem
        // sobrescrever.
        //
        // As implementações mais utilizadas são HashSet e TreeSet, que dão aos objetos criados uma estrutura parecida
        // com a de um conjunto de objetos, em que seus elementos podem ser mais rapidamente pesquisados que nas
        // implementações de List.
        //
        // TreeSet também implementa a interface SortedSet e possui métodos para ordenação dos elementos.
        //
        // HashSet e TreeSet são as implementações mais utilizadas, mas há outras. Exṕlore o Javadoc para conhecer outras
        // implementações de Set.

        // criando uma set de Integer
        SortedSet<Integer> inteiros = new TreeSet<>();

        // adicionando inteiros ao set
        inteiros.add(1);
        inteiros.add(2);
        inteiros.add(3);
        inteiros.add(1);
        inteiros.add(13);
        inteiros.add(5);
        inteiros.add(8);

        // exibindo cada elemento do set com forEach
        System.out.println("Elementos do set:");
        for (Integer i: inteiros) {
            System.out.println(i);
        }

        // removendo o numero 5, caso estiver contido no set
        if (inteiros.contains(5)) {
            System.out.println("Removendo inteiro 5");
            inteiros.remove(5);
        }

        // exibindo novamente cada elemento do set com forEach
        System.out.println("Elementos do set:");
        for (Integer i: inteiros) {
            System.out.println(i);
        }

       /*
        OBSERVAÇÕES:

        Notem que um Set não permite a inclusão de objetos repetidos.

        Estes são os métodos mais utilizados de Set, mas há muitos outros. Crie seus próprios exemplos para explorar
        o uso das implementações de Set.
         */

    }
}

package cap13_collections;

import java.util.ArrayList;
import java.util.List;

public class Exemplo50_List {

    public static void main(String[] args) {

        // List é uma interface do pacote java.util que define os membros que as classes que a implementam devem
        // sobrescrever.
        //
        // A implementação mais utilizada é a ArrayList, que dá a objeto criado uma estrutura parecida com a de um
        // array de objetos em que seus elementos podem ser facilmente incluídos e removidos.
        //
        // ArrayList é a implementação mais utilizada, mas há outras. Exṕlore o Javadoc para conhecer outras
        // implementações de List.

        // criando uma list de String
        List<String> list = new ArrayList<>();

        // adicionando elementos a list
        list.add("ABC");
        list.add("DEF");
        list.add("GHI");
        list.add("ABC");

        // exibindo cada elemento da list com forEach
        System.out.println("Elementos de list:");
        for (String s: list) {
            System.out.println(s);
        }

        // obtendo posição do elemento 'DEF'
        System.out.println("'DEF' está na posição: "+list.indexOf("DEF"));

        // obtendo o elemento através de sua posição na list
        int index = list.indexOf("DEF");
        System.out.println("Exibindo elemento contido na posição "+index+": "+list.get(index));

        // removendo a String "DEF", caso ela estiver contida na list
        if (list.contains("DEF")) {
            System.out.println("Removendo elemento 'DEF");
            list.remove("DEF");
        }

        // exibindo novamente cada elemento da list com forEach
        System.out.println("Elementos de list após remover 'DEF':");
        for (String s: list) {
            System.out.println(s);
        }

        /*
        OBSERVAÇÕES:

        Notem que um ArrayList permite a inclusão de objetos repetidos.

        Estes são os métodos mais utilizados de List, mas há muitos outros. Crie seus próprios exemplos para explorar
        o uso de ArrayList.
         */

    }
}

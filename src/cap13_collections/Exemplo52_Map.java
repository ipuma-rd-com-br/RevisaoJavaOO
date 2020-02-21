package cap13_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exemplo52_Map {

    public static void main(String[] args) {

        // Map é uma interface do pacote java.util que define os membros que as classes que a implementam devem
        // sobrescrever.
        //
        // Uma das implementações mais utilizadas é a HasMap, que dá aos objetos criados uma estrutura parecida
        // com a de um dicionário de objetos, que pode ser muito útil para armazenar e recuperar com facilidade dados
        // na estrutura de chave-valor.
        //
        // HashMap é a implementação mais utilizada, mas há outras. Exṕlore o Javadoc para conhecer outras
        // implementações de Map.

        // criando uma map de String como chave e Integer como valor
        Map<String, Integer> ddds = new HashMap<>();

        // adicionando conjuntos de chave-valor ao map
        ddds.put("SP", 11);
        ddds.put("RJ", 21);
        ddds.put("MG", 31);
        ddds.put("PR", 41);
        ddds.put("RS", 51);

        // obtendo o valor de uma chave incluida no map
        System.out.println("Exibindo o DDD do RJ: "+ddds.get("RJ"));

        // verificando se uma dada chave está contida no map
        if (ddds.containsKey("RS")) {
            System.out.println("O DDD de RS está armazenado no map.");
        }

        // exibindo as chaves e valores contidos no map
        Set<String> ufs = ddds.keySet();
        System.out.println("chave valor");
        System.out.println("----- -----");
        for (String uf: ufs) {
            System.out.println(uf+" "+ddds.get(uf));
        }

        // removendo DDD do PR
        System.out.println("Removendo DDD  do PR");
        ddds.remove("PR");

        // exibindo as chaves e valores contidos no map
        ufs = ddds.keySet();
        System.out.println("chave valor");
        System.out.println("----- -----");
        for (String uf: ufs) {
            System.out.println(uf+" "+ddds.get(uf));
        }

        /*
        OBSERVAÇÕES:

        Estes são os métodos mais utilizados de HashMap, mas há muitos outros. Crie seus próprios exemplos para explorar
        o uso das implementações de Map.
         */

    }
}

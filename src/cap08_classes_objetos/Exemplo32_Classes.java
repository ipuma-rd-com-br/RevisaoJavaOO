package cap08_classes_objetos;

public class Exemplo32_Classes {

    public static void main(String[] args) {

        // criando (ou instanciando) um objeto da classe (ou tipo) UmaClasseQualquer
        // "qualquer" é o nome da variável que vai referenciar o objeto que acabou de ser criado
        UmaClasseQualquer qualquer = new UmaClasseQualquer();

        // modificando os atributos do objeto do tipo UmaClasseQualquer que foi criado
        qualquer.atributoInt = 10;
        qualquer.atributoString = "ABC";

        // executando o método definido na classe UmaClasseQualquer, a partir do objeto do tipo UmaClasseQualquer
        // que foi criado
        qualquer.executaMetodoQualquer();

        /*
        OBSERVAÇÕES:

        UmaClasseQualquer é um exemplo de classe. Verifiquem o código de UmaClasseQualquer para ver como definir uma
        classe no Java.

        A variável "qualquer" do tipo UmaClasseQualquer faz referência ao objeto de UmaClasseQualquer que foi criado
        com o comando new.

        Para acessar qualquer membro (atributo ou método) do objeto criado, basta escrever "." após o nome do objeto
        e, então, escrever o nome do membro.

        Ex.:
        qualquer.atributoInt = 10;
         */
    }
}

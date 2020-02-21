package cap01_tipos_java;

public class Exemplo03_TiposObjetos {

    public static void main(String[] args) {

        String objetoString = new String("ABC");
        String objetoStringLiteral = "ABC"; // isso é como se implicitamente o compilador fizesse 'new String("ABC")'
        UmaClasseQualquer objetoQualquer = new UmaClasseQualquer();

        System.out.println("objetoString                  : "+objetoString);
        System.out.println("objetoString.toString()       : "+objetoString.toString());

        System.out.println("objetoStringLiteral           : "+objetoStringLiteral);
        System.out.println("objetoStringLiteral.toString(): "+objetoStringLiteral.toString());

        System.out.println("objetoQualquer                : "+objetoQualquer);
        System.out.println("objetoQualquer.toString()     : "+objetoQualquer.toString());

        // OBSERVAÇÕES:
        //
        // O toString() é um método definido na classe Object. Como todas as classes no Java herdam de Object,
        // todas as classes herdam o método toString().
        //
        // Veremos a seguir mais sobre herança e a classe Object.
        //
        // Mas notem que o método println() executa o toString() do objeto quando recebe como parâmetro a variável
        // o qual faz referência.

    }

}

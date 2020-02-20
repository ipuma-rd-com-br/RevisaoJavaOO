package cap08_classes_objetos;

public class Exemplo35_Construtores3 {

    public static void main(String[] args) {

        // cria um objeto chamando o construtor com parâmetros
        UmaClasseQualquerComConstrutoresPadraoEComParametros criadoComParametros =
                new UmaClasseQualquerComConstrutoresPadraoEComParametros(10, "ABC");

        criadoComParametros.atributoInt = 100;
        criadoComParametros.atributoString = "DEF";
        criadoComParametros.executaMetodoQualquer();

        // cria um objeto chamando o construtor padrão
        UmaClasseQualquerComConstrutoresPadraoEComParametros criadoComPadrao =
                new UmaClasseQualquerComConstrutoresPadraoEComParametros();

        criadoComPadrao.atributoInt = 200;
        criadoComPadrao.atributoString = "GHI";
        criadoComPadrao.executaMetodoQualquer();

        /*
        OBSERVAÇÕES:

        É possível ter uma classe com dois ou mais construtores definidos devido a capacidade de se fazer sobrecarga
        de métodos no Java.

        Sobrecarga de métodos é fazer a definição de dois ou mais métodos com mesmo nome, porém com retorno e parâmetros
        distintos.

        Veremos mais adiante sobre sobrecarga de métodos.
         */
    }
}

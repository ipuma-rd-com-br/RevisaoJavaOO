package cap12_modificadores_acesso;

import classes_auxiliares.UmaClasseFinal;

public class Exemplo46_ModificadorFinal3 {

    public static void main(String[] args) {

        UmaClasseFinal umaClasse = new UmaClasseFinal(10, "ABC");
        umaClasse.umMetodo();

        // Verifiquem o código da classe UmaSubClasseDeClasseFinal.
        //
        // A classe é herdeira de UmaClasseFinal, mas seu código nem compila, pois uma classe definida como final
        // não pode ser extendida (ou ser superclasse) por nenhuma subclasse.

    }
}

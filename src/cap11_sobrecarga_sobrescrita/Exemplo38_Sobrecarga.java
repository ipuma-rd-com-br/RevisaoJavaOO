package cap11_sobrecarga_sobrescrita;

public class Exemplo38_Sobrecarga {

    public static void main(String[] args) {

        UmaClasseComSobrecargaDeMetodos umaClasse = new UmaClasseComSobrecargaDeMetodos();

        umaClasse.metodoComSobrecarga();
        umaClasse.metodoComSobrecarga(10);
        umaClasse.metodoComSobrecarga("ABC");

        /*
        OBSERVAÇÕES:

        UmaClasseComSobrecargaDeMetodos é uma classe que define a sobrecarga de 3 métodos metodoComSobrecarga().

        Verifiquem o código de UmaClasseComSobrecargaDeMetodos.
         */
    }

}

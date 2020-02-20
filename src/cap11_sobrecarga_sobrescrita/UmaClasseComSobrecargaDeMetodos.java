package cap11_sobrecarga_sobrescrita;

class UmaClasseComSobrecargaDeMetodos {

    /*
    Esta classe exemplifica o uso de sobrecarga de métodos.

    A sobrecarga de um método acontece quando se define dois ou mais métodos com o mesmo nome, porém com parâmetros distintos.
    */

    void metodoComSobrecarga() {
        System.out.println("Executando sobrecarga de metodoComSobrecarga() sem parametros.");
    }

    void metodoComSobrecarga(int numero) {
        System.out.println("Executando sobrecarga de metodoComSobrecarga() com parametro int. numero="+numero);
    }

    void metodoComSobrecarga(String texto) {
        System.out.println("Executando sobrecarga de metodoComSobrecarga() com parametro String. texto="+texto);
    }
}

package cap15_enumeration;

public class Exemplo55_Enum {

    public static void main(String[] args) {

        Status status = Status.CRIADO;
        System.out.println("codigo status: "+status.getCodigo());
        System.out.println("status: "+status);

        if (status.equals(Status.FINALIZADO)) {
            System.out.println("Status está finalizado.");
        } else {
            System.out.println("Status AINDA não está finalizado.");
        }
    }
}

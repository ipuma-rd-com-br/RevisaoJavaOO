package cap05_estruturas_repeticao;

public class Exemplo16_ComandoFor {

    public static void main(String[] args) {

        int[] numeros = {10, 20, 30, 40, 50};

        System.out.println("numeros.length: "+numeros.length);
        System.out.println("i numeros[i]");
        System.out.println("- ----------");

        // loop FOR para varrer o array e imprimir no console o valor de cada elemento

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(i+" "+numeros[i]);
        }

    }
}

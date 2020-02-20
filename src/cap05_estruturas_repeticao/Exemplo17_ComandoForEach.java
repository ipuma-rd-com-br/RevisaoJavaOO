package cap05_estruturas_repeticao;

public class Exemplo17_ComandoForEach {

    public static void main(String[] args) {

        int[] numeros = {10, 20, 30, 40, 50};

        System.out.println("numeros.length: "+numeros.length);
        System.out.println("numeros[i]");
        System.out.println("----------");

        // loop FOREACH para varrer o array e imprimir no console o valor de cada elemento

        for (int numero : numeros) {
            System.out.println(numero);
        }

    }
}

package cap05_estruturas_repeticao;

public class Exemplo14_ComandoWhile {

    public static void main(String[] args) {

        int[] numeros = {10, 20, 30, 40, 50};

        System.out.println("numeros.length: "+numeros.length);
        System.out.println("i numeros[i]");
        System.out.println("- ----------");

        // loop WHILE para varrer o array e imprimir no console o valor de cada elemento

        int i = 0;
        while (i < numeros.length) {
            System.out.println(i+" "+numeros[i]);
            i++;
        }
    }
}

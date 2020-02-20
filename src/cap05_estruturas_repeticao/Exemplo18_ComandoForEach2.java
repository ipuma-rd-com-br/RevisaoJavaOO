package cap05_estruturas_repeticao;

public class Exemplo18_ComandoForEach2 {

    public static void main(String[] args) {

        int[] numeros = {10, 20, 30, 40, 50};

        System.out.println("numeros.length: "+numeros.length);
        System.out.println("i numeros[i]");
        System.out.println("- ----------");

        // loop FOREACH para varrer o array e imprimir no console o valor de cada elemento

        int i = 0;
        for (int numero : numeros) {
            System.out.println(i+" "+numero);
            i++;
        }

        // OBSERVAÇÃO:
        //
        // Exemplo de FOREACH semelhante ao anterior, porém com uma pequena alteração para imprimir a
        // posição do array ao lado do valor de cada elemento.

    }
}

package cap02_arrays;

public class Exemplo04_Arrays {

    public static void main(String[] args) {

        // declarando, instanciando e definindo os valores de um array com uma linha de comando (usando o array initializer)
        int[] umArray = {0, 1, 2, 3, 4};
        System.out.println("umArray.length: "+umArray.length);

        // declarando e instanciando um array
        int[] outroArray = new int[5];
        System.out.println("outroArray.length (antes de definir os valores) : "+outroArray.length);
        // definindo os valores do array
        outroArray[0] = 0;
        outroArray[1] = 1;
        outroArray[2] = 2;
        outroArray[3] = 3;
        outroArray[4] = 4;
        System.out.println("outroArray.length (depois de definir os valores): "+outroArray.length);

        // exibindo no console os valores do array
        System.out.println("umArray[0]: "+umArray[0]);
        System.out.println("umArray[1]: "+umArray[1]);
        System.out.println("umArray[2]: "+umArray[2]);
        System.out.println("umArray[3]: "+umArray[3]);
        System.out.println("umArray[4]: "+umArray[4]);

        System.out.println("umArray           : "+umArray);
        System.out.println("umArray.toString(): "+umArray.toString());

        // OBSERVAÇÕES:
        //
        // Notem que um array é considerado um objeto no Java.
        // Como qualquer objeto, o array herda atributos e métodos do tipo Object (como o toString()).
    }
}

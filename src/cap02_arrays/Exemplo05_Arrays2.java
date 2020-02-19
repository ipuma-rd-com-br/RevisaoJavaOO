package cap02_arrays;

public class Exemplo05_Arrays2 {

    public static void main(String[] args) {

        // declarando e instanciando um array
        int[] umArray = new int[5];
        System.out.println("umArray.length (antes de definir os valores) : "+umArray.length);
        // definindo os valores do array
        umArray[0] = 0;
        umArray[1] = 1;
        umArray[2] = 2;
        umArray[3] = 3;
        umArray[4] = 4;

        // o comando abaixo deve lançar uma exceção do tipo ArrayIndexOutOfBoundsException (veremos mais sobre exceções adiante),
        // pois não é possível adicionar um elemento numa posição acima do limite definido na instanciação (criação) do array.
        umArray[5] = 5;

    }
}

package cap03_operadores;

public class Exemplo07_OperadoresLogicos {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = true;
        boolean c = false;
        boolean d = false;

        System.out.println("\nDados os valores booleanos:");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);

        // operador AND (&&)

        System.out.println("\nOperador AND (&&):");
        System.out.println("a && b (= true): "+(a && b));
        System.out.println("a && c (= false): "+(a && c));
        System.out.println("c && d (= false): "+(c && d));

        // operador OR (||)

        System.out.println("\nOperador OR (||):");
        System.out.println("a || b (= true): "+(a || b));
        System.out.println("a || c (= true): "+(a || c));
        System.out.println("c || d (= false): "+(c || d));

        // operador NOT (!)

        System.out.println("\nOperador NOT (!)");
        System.out.println("!a (= false): "+(!a));
        System.out.println("!b (= false): "+(!b));
        System.out.println("!c (= true): "+(!c));
        System.out.println("!d (= true): "+(!d));
    }
}

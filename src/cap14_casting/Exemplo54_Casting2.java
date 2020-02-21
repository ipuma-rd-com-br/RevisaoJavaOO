package cap14_casting;

public class Exemplo54_Casting2 {

    public static void main(String[] args) {

        String string = new String("ABC");
        Object objeto = new Object();
        System.out.println("string: "+string);
        System.out.println("objeto: "+objeto);
        System.out.println("***");

        // casting implicito, pois String é subclasse de Object
        objeto = string;
        System.out.println("string: "+string);
        System.out.println("objeto: "+objeto);
        System.out.println("***");

        // sem casting, dá erro de compilação, por isso o compilador força que o casting seja explícito
        // o casting deve ser explícito porque Object é superclasse de String
        String outraString = (String) objeto;
        System.out.println("string: "+string);
        System.out.println("outraString: "+outraString);
        System.out.println("objeto: "+objeto);
        System.out.println("***");

    }
}

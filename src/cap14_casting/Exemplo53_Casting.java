package cap14_casting;

public class Exemplo53_Casting {

    public static void main(String[] args) {

        int umInteiro;
        long umLong;
        double umDouble;

        umInteiro = 10;
        umLong = umInteiro; // casting implicito, como um int cabe em um double, o compilador assume o casting
        System.out.println("umInteiro: "+umInteiro);
        System.out.println("umLong: "+umLong);
        System.out.println("***");

        umLong = 100;
        umInteiro = (int) umLong; // sem casting, dá erro de compilação, por isso o compilador força que o casting seja explícito
        System.out.println("umInteiro: "+umInteiro); // como int pode armazenar menos valores que long, pode haver perda de precisão no casting
        System.out.println("umLong: "+umLong);
        System.out.println("***");

        umLong = 1125899906842624L;
        umInteiro = (int) umLong; // sem casting, dá erro de compilação, por isso o compilador força que o casting seja explícito
        System.out.println("umInteiro: "+umInteiro); // como int pode armazenar menos valores que long, pode haver perda de precisão no casting
        System.out.println("umLong: "+umLong);
        System.out.println("***");

        umInteiro = 1000;
        umDouble = umInteiro; // casting implicito, como um int cabe em um double, o compilador assume o casting
        System.out.println("umInteiro: "+umInteiro);
        System.out.println("umDouble: "+umDouble);
        System.out.println("***");

        umDouble = 123.45;
        umInteiro = (int) umDouble; // sem casting, dá erro de compilação, por isso o compilador força que o casting seja explícito
        System.out.println("umInteiro: "+umInteiro); // como int pode armazenar menos valores que double, pode haver perda de precisão no casting
        System.out.println("umDouble: "+umDouble);
        System.out.println("***");

    }
}

package classes_auxiliares;

/**
 * Experimente escrever "public class UmaClasseComMetodoAbstract", em vez de
 * "public abstract class UmaClasseComMetodoAbstract" e veja se o código da classe compila.
 */
public abstract class UmaClasseComMetodoAbstract {

    public int umAtributoInt;
    public String umAtributoString;

    // ao definir um método abstract em uma classe, o compilador obriga que a classe também seja definida como abstract
    public abstract void umMetodo();

}

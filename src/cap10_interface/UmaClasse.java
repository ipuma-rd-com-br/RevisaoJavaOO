package cap10_interface;

class UmaClasse implements UmaInterface {

    // a definição que uma classe implementa uma interface acontece por meio do comando "implements"
    //
    // ao definir que uma classe implementa uma interface, obrigatoriamente todos os métodos definidos na interface
    // devem ser definidos na classe
    //
    // se algum método da interface não for definido, a classe não compila!

    @Override
    public void umMetodo() {
        System.out.println("UmaClasse executando método umMetodo() implementado de UmaInterface.");
    }

    @Override
    public void outroMetodo() {
        System.out.println("UmaClasse executando método outroMetodo() implementado de UmaInterface.");
    }
}

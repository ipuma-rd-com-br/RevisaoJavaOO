package cap10_interface;

class MaisOutraClasse implements UmaInterface {

    @Override
    public void umMetodo() {
        System.out.println("MaisOutraClasse executando método umMetodo() implementado de UmaInterface.");
    }

    @Override
    public void outroMetodo() {
        System.out.println("MaisOutraClasse executando método outroMetodo() implementado de UmaInterface.");
    }
}

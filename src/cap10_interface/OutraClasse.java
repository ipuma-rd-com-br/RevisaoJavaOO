package cap10_interface;

class OutraClasse implements UmaInterface {

    @Override
    public void umMetodo() {
        System.out.println("OutraClasse executando método umMetodo() implementado de UmaInterface.");
    }

    @Override
    public void outroMetodo() {
        System.out.println("OutraClasse executando método outroMetodo() implementado de UmaInterface.");
    }
}

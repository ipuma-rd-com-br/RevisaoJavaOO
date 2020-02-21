package cap15_enumeration;

public enum Status {

    CRIADO(0),
    EM_ANALISE(1),
    FINALIZADO(2);

    private int codigo;

    Status(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return this.codigo;
    }

}

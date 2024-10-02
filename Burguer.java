package lanchonete;

class Burguer {
    private String tipo;

    public Burguer(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Burguer: " + tipo;
    }
}




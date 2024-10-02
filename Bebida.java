package lanchonete;

public class Bebida {
	private String tipo;

    public Bebida(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Bebida: " + tipo;
    }
}

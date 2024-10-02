package lanchonete;

public class Sobremesa {
	 private String tipo;

	    public Sobremesa(String tipo) {
	        this.tipo = tipo;
	    }

	    public String getTipo() {
	        return tipo;
	    }

	    @Override
	    public String toString() {
	        return "Sobremesa: " + tipo;
	    }
}

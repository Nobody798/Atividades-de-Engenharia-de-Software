package lanchonete;

public class Combo {
	private Burguer burguer;
    private Sobremesa sobremesa;
    private Bebida bebida;

    public void CriarCombo(int tipo) {
        switch(tipo) {
            case 1: // Combo Master
                burguer = new Burguer("Cheeseburguer");
                sobremesa = new Sobremesa("Sorvete");
                bebida = new Bebida("Refrigerante");
                break;
            case 2: // Super Combo
                burguer = new Burguer("Hamburguer Duplo");
                sobremesa = new Sobremesa("Torta de maçã");
                bebida = new Bebida("Suco");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    @Override
    public String toString() {
        return burguer + "\n" + sobremesa + "\n" + bebida;
    }
}

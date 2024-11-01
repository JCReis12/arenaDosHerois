package proj;

public class Arqueiro extends Personagem {

	public Arqueiro(String nome) {
		super(nome, 80, 20);
	}

	@Override
	public void atacar(Personagem oponente) {
			oponente.receberDano(this.getDanoBase() + 15);
			System.out.println(getNome() + " disparou uma flecha+ em " + oponente.getNome() + " à distância.");
		}
}


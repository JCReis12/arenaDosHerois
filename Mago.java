package proj;

public class Mago extends Personagem {
	private int cosmo;
	
	public Mago(String nome) {
		super(nome, 100, 25);
		this.cosmo = 50;
	}

	@Override
	public void atacar(Personagem oponente) {
		if (cosmo >= 10) {
			oponente.receberDano(this.getDanoBase() + 15);
			cosmo -= 10;
			System.out.println(getNome() + " lançou um feitiço em " + oponente.getNome() + " à distância.");
		}
		else {
			System.out.println(getNome() + " não tem cosmo suficiente para atacar!");
		}
	}
}

package Trabalho7;

abstract class Heroi extends Personagem{
	
	private String nome;
	

	public Heroi(int cor, String nome) {
		super(cor);
		this.nome = nome;
	}

	public void correr(float x, float y) {
		
		System.out.println("Her�i correndo...");
		this.posicaoX = x;
		this.posicaoY = y;
		
	}
	
	public void saltar(float z) {
		System.out.println("Her�i saltando...");
		this.posicaoZ = z;
		
	}

	public String getNome() {
		return nome;
	}

}

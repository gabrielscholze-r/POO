package Trabalho7;

abstract class Vilao extends Personagem{
	
	public Vilao(int cor) {
		super(cor);
	}
	
	public void correr(float x, float y) {
		
		System.out.println("Vil�o correndo...");
		this.posicaoX = x;
		this.posicaoY = y;
		
	}

}

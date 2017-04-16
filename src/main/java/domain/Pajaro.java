package domain;

public class Pajaro {
	private int energia; // atributo
	// métodos

	
	public Pajaro(){
	this.energia=500;
	}
	public void volar() {
		this.energia = this.energia - 10;
	}
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}

}

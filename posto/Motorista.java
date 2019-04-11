package posto;

public class Motorista {
	
	private float gasolina;
	private float refri = 6;
	
	public float getGasolina() {
		return gasolina;
	}
	public void setGasolina(float gasolina) {
		this.gasolina = gasolina;
	}
	public float getRefri() {
		return refri;
	}
	public void setRefri(float refri) {
		this.refri = refri;
	}
	
	public void gerarConta() {
		System.out.format("O valor da conta foi: %.2f", ((getGasolina()* 2.5) + getRefri()));
	}
}

package classes;

public class Impressora {

	// atributos
	
	boolean ligada;
	int qtdPapel;
	String imprimir;
	String modelo;
	
	//construtor
	
	public Impressora(String modelo) {
		super();
		this.ligada = ligada;
		this.modelo = modelo;
	}

	//getters setters
	
	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public int getQtdPapel() {
		return qtdPapel;
	}

	public void setQtdPapel(int qtdPapel) {
		this.qtdPapel = qtdPapel;
	}

	public String getImprimir() {
		return imprimir;
	}

	public void setImprimir(String imprimir) {
		this.imprimir = imprimir;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	// metodos
	
	public void ligar() {
		System.out.println("impressora ligada");
		ligada = true;
	}

	public void desligar() {
		System.out.println("impressora desligada");
		ligada = false;
	}

	public void tem() {
		
		if (ligada && qtdPapel > 0) {
			System.out.println("O que deseja imprimir? ");
		}
		else if (ligada && qtdPapel == 0) {			
			System.out.println("Sem papel !!!");
		}
	}
}

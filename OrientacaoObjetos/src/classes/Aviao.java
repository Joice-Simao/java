package classes;

public class Aviao {
			
		//atributos - é, tem, estar
	
		public boolean ligado;
		public String modelo;
		public String nome;
		public int qtdAssentos;
		public int velocidade;
		
		//construtor
		
		public Aviao(String modelo, String nome) {
			super();
			this.modelo = modelo;
			this.nome = nome;
		}
		
		//getters setters
		
		public boolean isLigado() {
			return ligado;
		}

		public void setLigado(boolean ligado) {
			this.ligado = ligado;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getQtdAssentos() {
			return qtdAssentos;
		}

		public void setQtdAssentos(int qtdAssentos) {
			this.qtdAssentos = qtdAssentos;
		}

		public int getVelocidade() {
			return velocidade;
		}

		public void setVelocidade(int velocidade) {
			this.velocidade = velocidade;
		}

		//metodo
		
		public void ligar() {
			System.out.println("Avião ligado");
			ligado = true;
		}
		public void desligar() {
			System.out.println("Avião desligado");
			ligado = false;
		}
}
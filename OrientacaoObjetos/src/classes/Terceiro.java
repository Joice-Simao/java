package classes;

public class Terceiro extends Funcionario {

	//atributos
	private double adicional;
		
	//construtor
	public Terceiro(String matricula, String nome, double adicional) {
		super(matricula, nome);
		this.adicional = adicional;		
	}
		public Terceiro(String matricula, int horasTrabalhadas, double valorHora, String nome, double adicional) {
		super(matricula, horasTrabalhadas, valorHora, nome);
		this.adicional = adicional;
	}
	//encapsulamento
		public double getAdicional() {
			return adicional;
		}
		public void setAdicional(double adicional) {
			this.adicional = adicional;
		}
		
	//metodos 
	@Override
		public double salario() {
		
		return (this.horasTrabalhadas * this.valorHora) + this.adicional;
	}
	
		
}
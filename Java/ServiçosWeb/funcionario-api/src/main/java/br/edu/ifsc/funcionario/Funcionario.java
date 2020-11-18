package br.edu.ifsc.funcionario;



public class Funcionario {
	
	private int matricula;
	private String nome;
	private double salarioBase;
	private int numeroDependentes;
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public int getNumeroDependentes() {
		return numeroDependentes;
	}
	public void setNumeroDependentes(int numeroDependentes) {
		this.numeroDependentes = numeroDependentes;
	}
	public Funcionario(int matricula, String nome, double salarioBase, int numeroDependentes) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.numeroDependentes = numeroDependentes;
	}
	
	public double calcularSalarioLiquido(){
		double irpf = 0.0;
		if(salarioBase>=8500)
		{
			 irpf = 0.275;
		}else
		if((salarioBase>= 5000) && (salarioBase<8500)) 
		{
			irpf = 0.15;
		}else
		if(salarioBase<5000)
		{
			irpf= 0.0;
		}
		 numeroDependentes = numeroDependentes * 150;

		return salarioBase-(salarioBase*irpf)+numeroDependentes;
	}
	
	
	
	

}

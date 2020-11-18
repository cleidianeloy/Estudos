package br.edu.ifsc.funcionario;
// CLASSEQUE REPRESENTA O DOMÍNIO DO PROBLEMA.
public class Funcionario {
	
	public double salarioBruto;
	public double irpf;
	public double inss;
public Funcionario(double salarioBruto, double irpf, double inss) {
		super();
		this.salarioBruto = salarioBruto;
		this.irpf = irpf;
		this.inss = inss;
	}
	//MÉTODO DE ACESSO.
	public double getSalarioBruto() {
		return salarioBruto;
	}
//MÉTODO CONSTRUTOR.
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public Funcionario(double salarioBruto) {
		super();
		this.salarioBruto = salarioBruto;
	}
//CRIAR MÉTODO(AÇÃO) P/ CALCULAR O  VALOR DO IRFP.
	public static double calcularDescontoIrpf(double salarioBruto) {
	double irpf = 0.0;
		if(salarioBruto <= 1903.98)
		{
		   irpf = 0.0;	
		}
		if(salarioBruto >= 1903.99 && salarioBruto <= 2826.65 ) 
		{
		   irpf = (salarioBruto * 0.075) - 142.80;
		}
		else if(salarioBruto >= 2826.66 && salarioBruto <= 3751.05 )
		{
		   irpf = (salarioBruto * 0.15) - 354.80;
		}
		else if(salarioBruto >= 3751.06 && salarioBruto <= 4664.68)
		{
		   irpf = (salarioBruto * 0.225) - 636.13;
		}
		else if(salarioBruto > 4664.68)
		{
		   irpf = (salarioBruto * 0.275) - 869.36;
		}
		return irpf;
	}
//CRIAR MÉTODO P/ CALCULAR  O VALOR DO INSS.	
    public static double calcularDescontoInss(double salarioBruto) {
	double inss = 0.0;
	    if(salarioBruto <= 1045.00)
	    {
		   inss = salarioBruto * 0.075;
	    }
		else if(salarioBruto >= 1045.01 && salarioBruto <= 2089.60)
		{
		   inss = salarioBruto * 0.09;
		} 
		else if(salarioBruto >= 2089.61 && salarioBruto <= 3134.40)
		{
		   inss = salarioBruto * 0.12;
		}
		else 
		{
		   inss = salarioBruto * 0.14;
		}		
		return inss;
    }
//CRIAR MÉTODO P/ CALCULAR O SALÁRIO LÍQUIDO.
	public static double calcularSalarioLiquido(double salarioBruto) {
	double salarioLiquido = 0.0;
	double irpf = calcularDescontoIrpf(salarioBruto);
	double inss = calcularDescontoInss(salarioBruto);
	salarioLiquido = salarioBruto - inss - irpf;
	return salarioLiquido;
				
	}
}

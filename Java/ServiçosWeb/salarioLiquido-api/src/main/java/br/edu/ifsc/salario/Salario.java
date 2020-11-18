package br.edu.ifsc.salario;

public class Salario {
		private double salarioBruto;

		public double getSalarioBruto() {
			return salarioBruto;
		}

		public void setSalarioBruto(double salarioBruto) {
			this.salarioBruto = salarioBruto;
		}

		public Salario(double salarioBruto) {
			super();
			this.salarioBruto = salarioBruto;
		}
		
		public static double calcularIRPF( double salarioBruto) {
			double irpf = 0.0;
			if(salarioBruto<=1903.98) {
				irpf = 0.0; 
			}else
			if(salarioBruto>1903.98 && salarioBruto<=2826.65)
			{
				irpf = (salarioBruto*0.075) - 142.80;
			}else
			if(salarioBruto>2826.65 && salarioBruto<=3751.05)
			{
				
				irpf = (salarioBruto * 0.15) - 354.80;
			}else
			if(salarioBruto> 3751.05 && salarioBruto<=4664.68) {
				irpf = (salarioBruto * 0.225) - 636.13;
			}else 
			if(salarioBruto>4664.68) {
				irpf = (salarioBruto * 0.275) - 869.36;
			}
				
			return irpf;
		}
		
		public static double calcularINSS( double salarioBruto) {
			double desconto= 0.0;
			if(salarioBruto<= 1045.80) {
//				Até R$ 1.045,00: descontar 7,5 do salário bruto
				desconto =salarioBruto * 0.075;
				
			}else
			if(salarioBruto>1045.80 && salarioBruto<=2089.60 ){
//				• de R$ 1.045,01 até R$ 2.089,60: descontar 9% do salário bruto
				desconto =salarioBruto * 0.09;
			}else
			if(salarioBruto > 2089.60 && salarioBruto< 3134.40) {
//				• de R$ 2.089,61 até R$ 3.134,40: descontar 12% do salário bruto
				desconto =salarioBruto * 0.12;
			}else
			if(salarioBruto > 3134.41 ) {
//				• de R$ 3.134,41 até R$ 6.101,06: descontar 14% do salário bruto (coloquei acima de 3134.41 porque não foi apresentado uma opção de que maior que 6101.06)
				desconto = salarioBruto * 0.14;
			}
			return desconto;


		}
		
		public static double  calcularSalario( double salarioBruto) {
			double salarioLiquido= 0.0;
			double irpf = calcularIRPF(salarioBruto);
			double inss = calcularINSS(salarioBruto);
				
			salarioLiquido = salarioBruto - irpf - inss;
			
			 return salarioLiquido;

			
		}
		

}

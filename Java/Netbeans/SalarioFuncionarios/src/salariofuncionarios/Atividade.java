
package salariofuncionarios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Cleid
 */
public class Atividade {
    private static double calcularComissao(double totalVendas){
        double comissao;
        if(totalVendas > 50000 && totalVendas < 100000){
            
            comissao = totalVendas*0.02;
            
        }else if(totalVendas > 100000 && totalVendas < 150000){
            
            comissao = totalVendas*0.05;
            
        }else if(totalVendas > 150000)
        {
           comissao = totalVendas*0.07;
        }else
        {
            comissao = totalVendas*0.0;
        }
        return comissao;
    }
    private static double calcularSalarioBruto(double salarioBase, double comissao){
        double salarioBruto = salarioBase + comissao;
        return salarioBruto;
    }
    private static double calcularBonus(double totalVendas){
        double bonus;
        return bonus = (totalVendas >= 100000) ? 1000 : 0;
        
    }
    private static double calcularINSS(double salarioBruto){
        /*inss = 8% para salarioBruto <= R$ 965,67 
          inss = 9% para salarioBruto <= R$ 1.609,45
          inss = 11% para salarioBruto <= R$ 3.218,90 
        (teto máximo R$ 3.218,90)*/
        double inss = 0.0;
        if(salarioBruto <= 935.67){
            inss = salarioBruto * 0.08;
        }else if(salarioBruto <= 1609.45){
            inss = salarioBruto * 0.09;
        }else if(salarioBruto <= 3218.90){
            inss = salarioBruto * 0.11;
        }else if(salarioBruto>3218.90){
            inss = 3218.90 * 0.11;
        }
        return inss;
    }
    private static double calcularIRPF(double salarioBruto){

        double irpf = 0.0;
        if(salarioBruto<= 1434.59){
            irpf = 0.0;
        }else if(salarioBruto > 1434.59 && salarioBruto < 2150){
            irpf = (salarioBruto * 0.075) - 107.59;
        }else if(salarioBruto > 2150 && salarioBruto <2866.70){
            irpf = (salarioBruto * 0.15) - 268.84;
        }else if(salarioBruto > 2866.70 && salarioBruto < 3582){
            irpf = (salarioBruto * 0.225) - 483.84;
        }else if(salarioBruto > 3582){
            irpf = (salarioBruto * 0.275) - 662.94;
        }
        return irpf;
        
    }
    private static double calcularSalarioFamilia(int dependentes, double salarioBruto){

        double salarioFamilia = 0.0;
        if(salarioBruto<=10000){
            salarioFamilia = 405.00 * dependentes;
            
        }else if(salarioBruto<=20000){
            salarioFamilia = 210 * dependentes;
        }else if (salarioBruto > 20000){
            salarioFamilia = 0.0;
        }
        return salarioFamilia;
    }
    private static double calcularSalarioLiquido(double salarioBruto, double irpf, double inss, double bonus, double salarioFamilia){
        double salarioLiquido;
        salarioLiquido = salarioBruto - irpf - inss + bonus + salarioFamilia;
        return salarioLiquido;
    }
    private static void imprimirFolhaPagamento(String nome,String mesAno,double salarioBase,double totalVendas, int dependentes){
        DecimalFormat df = new DecimalFormat("#,###.##");
        double comissao= calcularComissao(totalVendas);
        double salarioBruto = calcularSalarioBruto(salarioBase, comissao) ;
        double bonus = calcularBonus(totalVendas);
        double salarioFamilia = calcularSalarioFamilia( dependentes,salarioBruto);
        double irpf = calcularIRPF(salarioBruto);
        double inss = calcularINSS( salarioBruto);
        double salarioLiquido= calcularSalarioLiquido( salarioBruto, irpf,inss, bonus, salarioFamilia);
                System.out.println("╔═════════════════════════════════════════════════════╗\n"+
                                   "                          F O L H A          D E         P A G A M E N T O                    \n"+
                                   "                                     "+ mesAno +"                                             \n"+
                                   "╠═════════════════════════════════════════════════════╣\n" +
                                   "                             Nome.............: "+ nome +"                               \n" +
                                   "                             Salário base.....: R$ "+ df.format(salarioBase) +"          \n" +
                                   "                             Total de vendas..: R$ "+ df.format(totalVendas) +"          \n" +
                                   "                            --------------------------------                             \n" +
                                   "                             Comissão ........: R$ "+ df.format(comissao) +"             \n" +
                                   "                             Salário bruto ...: R$ "+ df.format(salarioBruto) +"         \n" +
                                   "                           --------------------------------                              \n" +
                                   "                             Bônus ...........: R$ "+ df.format(bonus) +"                \n" +
                                   "                             Salário família .: R$ "+ df.format(salarioFamilia) +"       \n" +
                                   "                            --------------------------------                             \n" +
                                   "                             IRPF .........(-): R$ "+ df.format(irpf) +"                 \n" +
                                   "                             INSS .........(-): R$ "+ df.format(inss) +"                 \n" +
                                   "                            --------------------------------                             \n" +
                                   "                             Salário líquido..: R$ "+df.format(salarioLiquido) +"        \n" +
                                   "╠═════════════════════════════════════════════════════╣\n" +
                                   "                            Observações: Número de dependentes: "+dependentes+"           \n" +
                                   "╚═════════════════════════════════════════════════════╝");        
    }
    
    public static void atividade(){
        Scanner escreva = new Scanner(System.in);
        int i = 1;
        System.out.println("Bem vindo ao Sistema de Salário \n"+
                           "Por favor,digite seu usuario:");
        String usuario = escreva.next();
        System.out.println("Por favor, digite sua senha: ");
        String senha = escreva.next();
        do{
            if(!"admin".equals(usuario) || !"admin".equals(senha)){
                System.out.println("Você tem mais "+ (3-i) + " tentativas");
                System.out.println("Senha ou usuario incorreto, tente novamente\n"+
                                   "Por favor, digite seu usuário");
                usuario = escreva.next();
                System.out.println("Por favor, digite sua senha: ");
                senha = escreva.next();
                
            }
            i++;
            if(i==3){
                System.out.println("Você atingiu o limite maximo de tentativas, o sistema está sendo finalizado");
                break;
            }
        }while(!"admin".equals(usuario) && !"admin".equals(senha));
        
        if("admin".equals(usuario) && "admin".equals(senha)){
            System.out.print("Bem vindo, ");
            int escolha = 1;
            do{

                 System.out.println("você pode escolher algumas opções:");
                do{
                if(escolha != 1 && escolha != 2 && escolha!= 3){
                    System.out.println("Opção invalida, tente de novo");
                }
                System.out.println( "1 – Calcular novo salário\n" +
                                    "2 – Tela de bloqueio\n" +
                                    "3 – Sair do programa\n"+
                                    "Digite 1, 2 ou 3");
                escolha = escreva.nextInt();
                i=1;
                }while(escolha != 1 && escolha != 2 && escolha!= 3);
                switch(escolha){
                    case 1:
                        System.out.println("Você escolheu calcular novo salario\n"+
                                       "Escreva o nome do funcionario");
                        String nome = escreva.next();
                        System.out.println("Escreva Mês/Ano de referencia");
                        String mesAno = escreva.next();
                        System.out.println("Escreva o valor do salario base ");
                        double salarioBase = escreva.nextDouble();
                        System.out.println("Total de vendas");
                        double totalVendas = escreva.nextDouble();
                        System.out.println("Escreva o numero de dependentes");
                        int dependentes = escreva.nextInt();
                        imprimirFolhaPagamento(nome, mesAno, salarioBase, totalVendas, dependentes); 
                        break;
                    case 2:
                        System.out.println("Você bloqueou sua tela, para voltar");
                        System.out.println("Por favor, digite seu usuario:");
                        usuario = escreva.next();
                        System.out.println("Por favor, digite sua senha: ");
                        senha = escreva.next();
                        do{
                            if(!"admin".equals(usuario) || !"admin".equals(senha)){
                              System.out.println("Você tem mais "+ (3-i) + " tentativas");
                              System.out.println("Senha ou usuario incorreto,tente novamente\n"+
                                                  "Por favor digite seu usuário");
                                usuario = escreva.next();
                              System.out.println("Por favor, digite sua senha: ");
                              senha = escreva.next();
                             }
                            i++;
                            if(i==3){
                            System.out.println("Você atingiu o limite maximo de tentativas, o sistema está sendo finalizado");
                            escolha = 3;
                            break;
                            }
                        }while(!"admin".equals(usuario) && !"admin".equals(senha));
                        break;
                    default:
                        break;
                }
                
            }while(escolha != 3 );
            
            
                
            }


           
    }
}

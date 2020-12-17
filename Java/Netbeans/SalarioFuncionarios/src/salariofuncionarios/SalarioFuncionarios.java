/*
Resolva o exercício abaixo fazendo uso de métodos da linguagem de programação Java.
Objetivo: Calcular o salário líquido de um determinado vendedor.
Problema: Dado o salário base e o total de vendas de um vendedor, calcular o seu salário
líquido. O salário líquido é composto por:
salarioLiquido =
(salarioBase + comissaoVendas) – (IRRF + INSS) +
bonus + salário - família
O acesso ao sistema só pode ocorrer mediante autenticação de usuário e senha.
Exemplo:
Usuário: admin
Senha: ******
O programa deverá apresentar um menu com as seguintes opções:
Menu:
1 – Calcular novo salário
2 – Tela de bloqueio ( como se fosse uma tela de ausência)
3 – Sair do programa
Entradas para calcular o novo salário:
- Nome do funcionário
- Mês/Ano de referência
- Valor do salário base
- Total de vendas
- Número de dependentes (exemplo: filhos, cônjuge)
Processos: (métodos)
- calcularComissao
comissao = 2% para totalVendas > R$ 50.000,00
comissao = 5% para totalVendas > R$ 100.000,00
comissao = 7% para totalVendas > R$ 150.000,00
- calcularSalarioBruto
salarioBruto = salarioBase + comissao
- calcularBonus
bonus = R$ 1.000,00 para totalVendas >= R$ 100.000,00
bonus = R$ 0,00 para totaVendas < R$ 100.000,00
- calcularINSS
inss = 8% para salarioBruto <= R$ 965,67
inss = 9% para salarioBruto <= R$ 1.609,45
inss = 11% para salarioBruto <= R$ 3.218,90
(teto máximo R$ 3.218,90)

- calcularIRPF
irpf = salarioBruto <= R$ 1.434,59 → isento
irpf = salarioBruto > R$ 1.434,59 → (7.5% do salarioBruto – R$ 107,59 de dedução)
irpf = salarioBruto > R$ 2.150,00 → (15% do salarioBruto – R$ 268,84 de dedução)
irpf = salarioBruto > R$ 2.866,70 → (22.5% do salarioBruto – R$ 483,84 de dedução)
irpf = salarioBruto > R$ 3.582,00 → (27.5% do salarioBruto – R$ 662,94 de dedução)
- calcularSalarioFamilia
salarioFamilia = 405,00 por dependente (para salarioBruto até 10.000,00)
salarioFamilia = 210,00 por dependente (para salarioBruto até 20.000,00)
salarioFamilia = 0,00 (para salarioBruto acima de 20.000,00)
- calcularSalarioLiquido
salarioLiquido = salarioBruto – irpf – inss + bonus + salarioFamilia
- imprimirFolhaPagamento
Exemplo:
╔═════════════════════════════════════════════════════╗
║ F O L H A D E P A G A M E N T O ║
║ JANEIRO / 2017 ║
╠═════════════════════════════════════════════════════╣
║ Nome.............: Tadeu ║
║ Salário base.....: R$ 1.000,00 ║
║ Total de vendas..: R$ 250.000,00 ║
║ -------------------------------- ║
║ Comissão ........: R$ 17.500,00 ║
║ Salário bruto ...: R$ 18.500,00 ║
║ -------------------------------- ║
║ Bônus ...........: R$ 1.000,00 ║
║ Salário família .: R$ 840,00 ║
║ -------------------------------- ║
║ IRRF .........(-): R$ 4.424,56 ║
║ INSS .........(-): R$ 354,08 ║
║ -------------------------------- ║
║ Salário líquido..: R$ 15.561,36 ║
╠═════════════════════════════════════════════════════╣
║ Observações: Número de dependentes: 4 ║
╚═════════════════════════════════════════════════════╝
 */
package salariofuncionarios;

/**
 *
 * @author Cleid
 */
public class SalarioFuncionarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Atividade.atividade();
    }
    
}

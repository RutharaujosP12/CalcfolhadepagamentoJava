import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cabecalhoEmpresa = """
                Empresa Ficticia
                CNPJ: 00.000.0000/00
                Endereço:
                """;
        while (true) {
            System.out.println(cabecalhoEmpresa);
            String funcao = """
                    Digite o número correspondente ao seu nível:
                    1. Trainee
                    2. Junior 
                    3. Pleno 
                    4. Sênior
                    0. Sair
                    """;
            String beneficiosDesc = """
                    Benefícios e seus determinados descontos: 
                    1. Trainne: 
                    - V.T: - 9% 
                    - Plano de saúde : - 10%
                    - Dependentes plano de saúde: - 20%
                    - Previdência Social: - 7,5%
                    
                    2. Júnior: 
                    - Aux. home. office: + R$ 200,00
                    - Plano de saúde : - 10%
                    - Dependentes plano de saúde: - 20%
                    - Previdência Social: - 7,5%
                    
                    3. Pleno: 
                    - Aux. home. office: + R$ 200,00
                    - Plano de saúde : - 10%
                    - Dependentes plano de saúde: - 20%
                    - Previdência Social: - 7,5%
                    - IRPF: - 15%
                    
                    4.Sênior:
                    - Aux. home. office: + R$ 200,00
                    - Plano de saúde : - 10%
                    - Dependentes plano de saúde: - 20%
                    - Previdência Social: - 7,5%
                    - IRPF: - 22,5%
                    """;
            System.out.println(beneficiosDesc);
            System.out.println("*************************************");
            System.out.println(funcao);
            double Salariobase = 1518;
            int idfuncao = sc.nextInt();

            switch (idfuncao) {
                case 0:
                    System.out.println("Você saiu do sistema");
                    sc.close();
                    return;
                case 1:
                    System.out.println("Salário Bruto (Nível Trainee): R$" + Salariobase);
                    break;
                case 2:
                    double AdcSalj = Salariobase * 70 / 100;
                    double SalBrutoJ = AdcSalj + Salariobase;
                    System.out.println("Salário Bruto (Nível Júnior): R$" + SalBrutoJ);
                    break;
                case 3:
                    double AdcSalP = Salariobase * 190 / 100;
                    double SalBrutoP = AdcSalP + Salariobase;
                    System.out.println("Salário Bruto (Nível Pleno): R$" + SalBrutoP);
                    break;
                case 4:
                    double AdcSalS = Salariobase * 230 / 100;
                    double SalBrutoS = AdcSalS + Salariobase;
                    System.out.println("Salário Bruto (Nível Sênior): R$" + SalBrutoS);
                    break;
                default:
                    String mensagemAtencao = """
                            Opção Inválida!
                            Por favor, reveja as opções e selecione novamente!
                            """;
                    System.out.println(mensagemAtencao);
            }
                sc.close();
            }
        }
    }


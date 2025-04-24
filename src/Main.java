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
            System.out.println(funcao);

            double Salariobase = 1518;
            int idfuncao = sc.nextInt();

            if (idfuncao == 1) {
                System.out.println("Salário Bruto (Nível Trainee): R$" + Salariobase);
                break;
            } else if (idfuncao == 2) {
                double AdcSalj = Salariobase * 70 / 100;
                double SalBrutoJ = AdcSalj + Salariobase;
                System.out.println("Salário Bruto (Nível Júnior): R$" + SalBrutoJ);
                break;
            } else if (idfuncao == 3) {
                double AdcSalP = Salariobase * 190 / 100;
                double SalBrutoP = AdcSalP + Salariobase;
                System.out.println("Salário Bruto (Nível Pleno): R$" + SalBrutoP);
                break;
            } else if (idfuncao == 4) {
                double AdcSalS = Salariobase * 230 / 100;
                double SalBrutoS = AdcSalS + Salariobase;
                System.out.println("Salário Bruto (Nível Sênior): R$" + SalBrutoS);
                break;
            } else if (idfuncao == 0) {
                System.out.println("Você saiu do sistema.");
                break;
            } else {
                String mensagemAtencao = """
                        Opção Inválida!
                        Por favor, reveja as opções e selecione novamente!
                        """;
                System.out.println(mensagemAtencao);
            }
        }
        sc.close();
    }
}

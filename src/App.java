import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do professor:");
        String nome = input.nextLine();
        System.out.println("Digite o regime de pagamento:");
        String regimePag = input.nextLine();
        double valorTotal;
        
        if (regimePag.equalsIgnoreCase("CLT")) {
            System.out.println("Digite o salário mensal do professor");
            double Salário = input.nextDouble();
            valorTotal = Salário;
        }else if(regimePag.equalsIgnoreCase("Horista")) {
            System.out.println("Digite o valor da hora de trabalho:");
            double valorHora = input.nextDouble();
            System.out.println("Digite a quantidade de horas trabalhadas:");
            int quantidadeHora = input.nextInt();
            valorTotal = valorHora * quantidadeHora;
        }else if(regimePag.equalsIgnoreCase("PJ")) {
            System.out.println("Digite o valor do contrato:");
            double valorContrato = input.nextDouble();
            valorTotal = valorContrato;
        } else {System.out.println("Regime de pagamento inválido");
             return;}
        System.out.printf("Nome: %s\n",nome);
        System.out.printf("Valor total: %.2f%n",valorTotal);
        
    }
}

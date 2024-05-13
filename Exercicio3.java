import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        double valor1 = ler.nextDouble();

        System.out.print("Digite outro valor: ");
        double valor2 = ler.nextDouble();

        System.out.print("Digite a operação que vc deseja fazer:\nsomar, subtrair, dividir ou multiplicar: ");
        String operacao = ler.next();

        switch (operacao) {
            case "somar":
                double soma = valor1 + valor2;
                System.out.println("Resultado: " + soma);
                break;
            case "subtrair":
                double subtracao = valor1 - valor2;
                System.out.println("Resultado: " + subtracao);
                break;
            case "dividir":
                double divisao = valor1 / valor2;
                System.out.println("Resultado: " + divisao);
                break;
            case "multiplicar":
                double multiplicacao = valor1 * valor2;
                System.out.println("Resultado: " + multiplicacao);
                break;
            default:
                System.out.println("Operação não reconhecida");
                break;
        }
    }
}

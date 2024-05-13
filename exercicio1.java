import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Exer01 {

  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.printf("Informe um número: ");
    Integer num = input.nextInt();

    if (num < 0){
      System.out.println(String.format("O número %d é negativo",num)); // %d espera receber um int, se fosse string seria %s, se fosse double/floot %f
    } else if (num > 0 ) {
      System.out.println(String.format("O número %d é positivo", num));
    } else {
      System.out.println("O número informado é igual a 0");
    }
}
}

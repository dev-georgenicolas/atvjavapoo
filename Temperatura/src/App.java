import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double k;
        double f;

        System.out.print("Digite uma temperatura em graus Kelvin: ");
        k= scanner.nextDouble();

        f= (9*(k-273.15) + 160)/5;

        System.out.println("A temperatura em Fahrenheit é de: "+ f +"º");
      


    }
}

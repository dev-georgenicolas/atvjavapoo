import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        System.out.print("Digite um número inteiro: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        if(numero%2 == 0){
            System.out.println("O número é par!");
        }
        else{
            System.out.println("O número é ímpar!");
        }
    }
}
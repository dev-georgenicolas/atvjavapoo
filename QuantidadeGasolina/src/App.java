import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite em horas o tempo gasto na viagem: ");
        double tempo = scanner.nextDouble();
        System.out.print("Digite em km/h a velocidade média: ");
        int velocidade = scanner.nextInt();
        double distancia = velocidade*tempo;

        double litrosUsados = distancia/12;

        System.out.printf("Tempo:%.2fh\n", tempo);
        System.out.printf(" Velocidade:%dkm/h\n",velocidade);
        System.out.printf("Distancia:%.2fKm\n",distancia);
        System.out.printf("Litros usados:%.2fL",litrosUsados);


    }
}

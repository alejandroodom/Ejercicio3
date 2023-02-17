import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Qué temperatura hace?");
        int temperatura = teclado.nextInt();
        if (temperatura < 2) {
            System.out.println("riesgo de hielo");
        }
    }
}
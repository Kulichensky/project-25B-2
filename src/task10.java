import java.util.Scanner;
public class task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int price = a * 100 + b;
        int pay = c * 100 + d;
        int sdat = pay - price;

        int r = sdat / 100;
        int k = sdat % 100;

        System.out.println(r + " " + k);
    }
}
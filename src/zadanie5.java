import java.util.Scanner;
public class zadanie5 {
    //5. Задать две дробных переменных. Вывести наибольшую из них.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите переменную x: ");
        double x = scanner.nextDouble();
        System.out.println("Введите переменную y: ");
        double y = scanner.nextDouble();
        if (x > y) {
            System.out.println("Наибольшая переменная: x");
        } else if (x < y) {
            System.out.println("Наибольшая переменная: y");
        } else {
            System.out.println("x = y");
        }
    }
}
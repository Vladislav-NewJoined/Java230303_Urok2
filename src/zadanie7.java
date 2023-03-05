import java.util.Scanner;
public class zadanie7 {
    //7. Задать две переменных - икс и игрек. Вывести, что больше - икс в степени игрек, или наоборот.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите переменную x: ");
        double x = scanner.nextDouble();
        System.out.println("Введите переменную y: ");
        double y = scanner.nextDouble();
        if (Math.pow (x,y) > Math.pow (y,x)) {
            System.out.println("Больше x в степени y");
        } else if (Math.pow (x,y) < Math.pow (y,x)) {
            System.out.println("Больше y в степени x");
        } else {
            System.out.println("x в степени y = y в степени x");
        }
    }
}
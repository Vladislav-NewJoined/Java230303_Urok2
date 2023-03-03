public class zadanie1 {
    //1. Если 5 в 15 степени больше миллиарда, вывести -«Степень это мощь. Power is a power.»
    public static void main(String[] args) {
        int x = 5;
        if (Math.pow(x, 15) > 1000000000) {
            System.out.println("Степень это мощь. Power is a power.");
        }
    }
}
public class zadanie15 {
    //15. Задать две строковых переменных. Найти, какая из них длиннее. (Используйте .length() )
    public static void main(String[] args) {
        String str1 = "Вы - разработчики";
        int len1 = str1.length();
        String str2 = "Вы - программисты";
        int len2 = str2.length();
        System.out.println("Длина строки 1: " + len1);
        System.out.println("Длина строки 2: " + len2);
        if (len1 == len2) {
            System.out.println("Длины строк равны.");
        }
        if (len1 > len2) {
            System.out.println("Длина строки 1 больше.");
        }
        if (len1 < len2) {
            System.out.println("Длина строки 2 больше.");
        }
    }
}
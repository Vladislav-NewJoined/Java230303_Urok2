public class zadanie14 {
    //14. Задать строковую переменную. Заменить в ней буквы а на @, а буквы о на 0.
    public static void main(String[] args) {
        String str = "Артур Конан Дойл";
        String str2 = str.replace('а', '@').replace('о', '0');
        System.out.println(str);
        System.out.println(str2);
    }
}

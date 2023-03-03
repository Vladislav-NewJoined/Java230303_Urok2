public class zadanie4 {
    //4. Если 2 в 10 степени меньше 512 вывести - «Pentium 2», иначе вывести - «ARM»
    public static void main(String[] args) {
        if (Math.pow(2, 10) < 512) {
            System.out.println("Pentium 2");
        } else {
            System.out.println("ARM");
        }
    }
}
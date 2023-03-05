public class zadanie16 {
    //16. Задать три переменных, найти наибольшую из них.
    /*
      Алгоритм поиска наибольшего из трех чисел:

1. Start
2. Read the three numbers to be compared, as A, B and C
3. Check if A is greater than B.

  3.1 If true, then check if A is greater than C
         If true, print 'A' as the greatest number
          If false, print 'C' as the greatest number

  3.2 If false, then check if B is greater than C
        If true, print 'B' as the greatest number
        If false, print 'C' as the greatest number
4. End
   * */
    // Method 1
    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        int c = 1;
        if ((a > b) && (a > c)) {
            System.out.println("a");
        } else if (b > c) {
            System.out.println("b");
        } else {
            System.out.println("c");
        }
    }
}
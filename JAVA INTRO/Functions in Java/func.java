import java.util.Scanner;

public class func {
   /*  public static void printMyName(String name){
        System.out.println(name);
        return;
    } */

    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static int calculateProduct(int a, int b){
        return a * b;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
      /*   String name = sc.nextLine();

        printMyName(name); */
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.println(calculateProduct(a, b));
    }
}

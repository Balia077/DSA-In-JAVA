import java.util.Scanner;

public class GN {

    public static void greatestNumber(int a, int b){
        if(a > b){
            System.out.println(a + " is Greater");
        }
        else if(a == b){
            System.out.println("Both are Equal");
        }
        else{
            System.out.println(b + " is Greater");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        greatestNumber(a, b);
    }
}

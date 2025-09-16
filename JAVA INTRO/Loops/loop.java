import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
        /* for(int i = 0; i <= 3; i++){
            System.out.println(i);
        } */

        /* int i = 0;
        while(i <= 3){
            System.out.println("Hello World");
            i++;
        } */

        /* int i = 0;
        do { 
            System.out.println(i);
            i++;
        } while (i<=3); */

        Scanner sc = new Scanner(System.in);
        /* int sum = 0;
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.println(sum); */

        int n = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(n * i);
        }
    }

}

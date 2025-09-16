import java.util.Scanner;

public class SON {

    public static void sumOfOddNumbers(int n, int sum){
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        sumOfOddNumbers(n, sum);
    }    
}

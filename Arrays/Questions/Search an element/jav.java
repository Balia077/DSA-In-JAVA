import java.util.Scanner;

public class jav{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        boolean found = false;
        int X = sc.nextInt();

        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }

        for(int i = 0; i < A.length; i++){
            if(A[i] == X){
                found = true;
                break;
            }
        }
        if(found == true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

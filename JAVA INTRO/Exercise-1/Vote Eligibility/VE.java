import java.util.Scanner;

public class VE {

    public static void voteEligibility(int age){
        if(age >= 18){
            System.out.println("Eligible to Vote");
        }
        else{
            System.out.println("Not Eligible to Vote");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        voteEligibility(age);
    }
}

public class LE{
    public static void main(String args[]){
        int arr[] = {10, 324, 45, 90, 9808};
        int largest = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
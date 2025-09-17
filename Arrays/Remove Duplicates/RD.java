public class RD{
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 3, 3};

        int i = 0;
        int n = arr.length;

        for(int j = 1; j < n; j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        printArray(arr);
    }
}
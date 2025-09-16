public class TLE{
    public static void main(String args[]){
        int arr[] = {2, 4, 1, 3, 5};
        int largest = arr[0];
        int secondLargest = -1;
        int thirdLargest = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > secondLargest && arr[i] < largest){
                secondLargest = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > thirdLargest && arr[i] < secondLargest){
                thirdLargest = arr[i];
            }
        }
        System.out.println(thirdLargest);
    }
}
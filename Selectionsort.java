public class Selectionsort {

    static void selection(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n-1 ; i++){
            int min_index = i;
            for(int j = i+1 ; j < n ; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,7,4,6,9};
        selection(arr);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}

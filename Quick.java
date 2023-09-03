public class Quick {

    static void display(int[] arr){
        for (int val : arr) {
            System.out.println(val + " ");
            
        }
    }

    static void swap(int[] arr , int x , int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int partition(int[] arr , int start , int end){
        int pivot = arr[start];
        int cnt = 0;

        for(int i = start+1 ; i <= end ; i++){
            if(arr[i] < pivot) cnt++;

        }
        int pivotidx = start + cnt;
        swap(arr, start, pivotidx);
        int i = start , j = end;
        while(i < pivotidx && j > pivotidx){
            while(arr[i] <= pivot) i++;
            while(arr[j] > pivot) j--;

            if(i < pivotidx && j > pivotidx){
                swap(arr, i , j);
                i++;
                j--;
            }
        }
        return pivotidx;

    }

    static void quicksort(int[] arr , int start , int end){
        if(start >= end) return;

        int pi = partition(arr, start, end);
        quicksort(arr, start, pi-1);
        quicksort(arr, pi+1, end);

    }
    public static void main(String[] args) {
        int[] arr = {3,6,2,8,6};

        System.out.println("Array befor sorting");
        display(arr);
        System.out.println();
        quicksort(arr, 0, arr.length-1);

        System.out.println("Array after sorting");
        display(arr);
    }
    
}

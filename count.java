public class count{

    static int findmax(int[] arr){
        int mx = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;
    }

    static void basiccountsort(int[] arr){

        int max = findmax(arr);
        int [] count = new int[max+1];
        for(int i = 0 ; i < arr.length ; i++){
            count[arr[i]]++;
        }

        int k = 0;
        for(int i = 0 ; i < count.length ; i++){
            for(int j = 0 ; j < count[i] ; j++){
                arr[k++] = i;
            }
        }

    }


    static void display(int[] a){
        for (int val : a) {
            System.out.print(val + " ");
        }
        System.out.println();
    }





    public static void main(String[] args) {
        int[] arr = {1 , 2 , 4 , 4 , 3 , 5 , 5};
        basiccountsort(arr);
        display(arr);
        
    }
}
public class BinarySearch {

    static boolean binarysearch(int[] a , int target){
        int n = a.length;
        int st = 0;
        int end = n-1;

        while(st <= end){
            int mid = (st + end)/2;

            if(target == a[mid]){

                return true;

            }else if(target < a[mid]){
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        return false;

    }

    // USING RECURSSION

    static boolean recbinarysearch(int[] a , int st , int end , int target){

        if(st > end) return false;

        while(st <= end){
            int mid = (st + end)/2;
            if(target == a[mid]){
                return true;
            }else if(target < a[mid]){
                return recbinarysearch(a, st, mid-1 , target);
            }else{
                return recbinarysearch(a, mid+1 , end, target);
            }
        }
        return false;

    }

    // SQUAREROOT

    static int sqrt(int x){
        
        int st = 0;
        int end = x;
        int ans = -1;

        while(st <= end){
            int mid = st + (end - st)/2;
            int val = mid * mid;
            if(val == x){
                return mid;
            }else if(val < x){
                ans = mid;
                st = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int x = 4;
        System.out.println(sqrt(x));
        int target = 0;
        System.out.println(binarysearch(a, target));
        System.out.println(recbinarysearch(a, 0 , a.length - 1, target));
    }
    
}

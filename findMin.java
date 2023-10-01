public class findMin {

    static int findminimum(int[] a){
        int n = a.length;
        int st = 0 ;
        int end = n - 1;
        int ans = -1;
        while(st <= end){
            int mid = st + (end-st)/2;

            if(a[mid] <= a[n-1]){
                ans = mid;
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        return ans;

    }

    static int rotated(int[] a , int target){
        int n = a.length - 1;
        int st = 0;
        int end = n-1;
        int ans = -1;

        while(st <= end){
            int mid = st + (end-st)/2;
            if(a[mid] == target){
                return mid;
            }else if(a[mid] < a[end]){
                if(target > a[mid] && target <= a[end]){
                    st = mid+1;
                }else{
                    end = mid-1;
                }
            }else{
                if(target > a[st] && target < a[mid]){
                    end = mid-1;
                }else{
                    st = mid+1;
                }
            }
    }
    return -1;
}

    public static void main(String[] args) {
        int[] a = {3 , 4 , 5 , 1 , 2};
        int target = 5;
        System.out.println(rotated(a, target));
        System.out.println(findminimum(a));
        
    }
    
}

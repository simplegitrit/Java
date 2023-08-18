public class Problems {

    // static void zero(int[] a){

        // PROBLEM 1
        
    //     int n = a.length;
    //     for(int i = 0 ; i < n-1 ; i++){
    //         for(int j = 0 ; j < n-i-1 ; j++){
    //             if(a[j] == 0 && a[j+1] != 0 ){
    //                 int temp = a[j];
    //                 a[j] = a[j+1];
    //                 a[j+1] = temp;
    //             }
    //         }
    //     }
    // }

// PROBLEM 2

    static void sortfruits(String[] fruits){
        int n = fruits.length;

        for(int i = 0 ; i < n-1 ; i++){
            int min_index = i;
            for(int j = i+1 ; j < n ; j++){
                if(fruits[j].compareTo(fruits[min_index]) < 0){
                    min_index = j;
                }
            }

            String temp = fruits[i];
            fruits[i] = fruits[min_index];
            fruits[min_index] = temp;
        }
    }


    

    public static void main(String[] args) {

        // PROBLEM 1

        // int[] a = {0 , 5 , 3 , 0 , 42};
        // zero(a);
        // for (int i : a) {
        //     System.out.print(i + " ");
            
        // }

        // PROBLEM 2

        String[] fruits = {"kiwi" , "apple" , "mango" , "banana"};
        sortfruits(fruits);
        for (String val : fruits) {
            System.out.print(val + " ");
            
        }

            
        }
    }
    


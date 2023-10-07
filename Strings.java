import java.util.*;
public class Strings {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        String str = "HARSHITA";
        System.out.println(str);

        String s = sc.next();
        System.out.println(s);
        String gtr = "ARYAN";
        System.out.println(str.compareTo(gtr));

        for(int j = 2 ; j < 4 ; j++){
            System.out.println(str.substring(j));
        }

        String s = "abcd";

        for(int i = 0 ; i <= 3 ; i++){
            for(int j = i+1 ; j <= 4 ; j++){
                System.out.println(s.substring(i, j) + " ");
            }
        }
    }
    
}

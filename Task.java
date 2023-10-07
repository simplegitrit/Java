import java.util.*;
public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);

        for(int i = 0 ; i < str.length() ; i++){
            boolean flag = true;
            char ch = str.charAt(i);
            int asci = (int)ch;
            if(asci >= 97) flag = false;
            if(flag == true){
                asci += 32;
                char dh = (char)asci;
                str.setCharAt(i, dh);
            }else{
                asci -= 32;
                char dh = (char)asci;
                str.setCharAt(i, dh);
            }
        }

        System.out.println(str);



        String str = "I am an online educator";
        String ans = " ";
        StringBuilder sb = new StringBuilder("");
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            if(ch !=' '){
                sb.append(ch);
            }else{
                sb.reverse();
                ans += sb;
                ans += " ";
                sb = new StringBuilder(" ");
            }
        }
        sb.reverse();
        ans += sb;
        System.out.println(ans);

        
    }
    
}

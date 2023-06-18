import java.util.*;
public class ReverseWords {
    public static void main(String[] args) {
        String s = "This is a new place";
        s += " ";
        Stack<String> st = new Stack<String>();
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' '){
                st.push(str);
                str = "";
            }
            else
            str += s.charAt(i);
        }
        String ans = "";
        while(st.size() != 1){
            ans += st.peek() + " ";
            st.pop();
        }
        ans += st.peek();
        System.out.println(ans);
    }
}

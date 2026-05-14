import java.util.Scanner;


class Solution{
    public int reverseNum(int n ){
        String s = Integer.toString(n);
        StringBuilder st= new StringBuilder(s);
        int i=0;
        int j =s.length()-1;
        while(i<j){
            char temp= s.charAt(i);
            st.setCharAt(i, s.charAt(j));
            st.setCharAt(j, temp);
            i++;
            j--;
        }
        return Integer.parseInt(st.toString());
    }
}



public class StrBUILDreversenum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = input.nextInt();
        Solution numb = new Solution();
        System.out.println(numb.reverseNum(n));
    }
}

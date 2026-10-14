package _1000;

import java.util.Scanner;

public class _01_SwapAndDelete {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            String s = sc.next();

            int zero = 0;
            int one = 0;

            for(char ch : s.toCharArray()){
                if(ch == '0'){
                    zero++;
                }
                else{
                    one++;
                }
            }

            int idx = 0;

            while(idx < s.length()){
                if(s.charAt(idx) == '0'){
                    if(one == 0){
                        break;
                    }
                    else{
                        one--;
                    }
                }
                else{
                    if(zero == 0){
                        break;
                    }
                    else{
                        zero--;
                    }
                }

                idx++;
            }

            System.out.println(s.length() - idx);
        }
    }
}

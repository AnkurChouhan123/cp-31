package _800;

import java.util.Scanner;

public class _3_CoverInWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int dots = 0;

            int ans = 0;

            boolean isThreeDots = false;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '.') {
                    dots++;
                }
                else{
                    if(dots >= 3){
                        isThreeDots = true;
                        break;
                    }
                    else{
                        ans += dots;
                    }

                    dots = 0;
                }
            }

           if(isThreeDots || dots >= 3){
               System.out.println(2);
           }
           else{
               ans += dots;
               System.out.println(ans);
           }
        }
    }
}

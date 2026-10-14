package _1000;

import java.util.*;

public class _05_Monster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();


            List<int[]> list = new ArrayList<>();

            StringBuilder ans = new StringBuilder();

            for(int i = 0; i < n; i++){
                int digit = sc.nextInt();
                if(digit % k == 0){
                    ans.append(i + 1).append(" ");
                }
                else{
                    list.add(new int[]{i + 1, digit % k});
                }
            }

            Collections.sort(list, (a, b) -> {
                if(b[1] == a[1]){
                    return a[0] - b[0];
                }

                return b[1] - a[1];
            });


            for(int i = 0; i < list.size(); i++){
                ans.append(list.get(i)[0]).append(" ");
            }

            System.out.println(ans.toString().trim());

        }
    }
}

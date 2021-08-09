import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String s = sc.nextLine();
            String r = new StringBuilder(s).reverse().toString();
            char sArr[] = s.toCharArray();
            char rArr[] = r.toCharArray();
            int j = 1;
            int k = s.length();
            int flag = 1;
            while(j < k){
                if(Math.abs(sArr[j]-sArr[j-1]) != Math.abs(rArr[j]-rArr[j-1])){
                    System.out.println("Not Funny");
                    flag = 0;
                    break;
                }
                ++j;
            }
            if(flag == 1){
            System.out.println("Funny");
            }
        }
    }
}

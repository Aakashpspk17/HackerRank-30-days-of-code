import java.io.*;
import java.util.Scanner;
public class Solution {
public static final Scanner sc= new Scanner(System.in);
   
    static int factorial(int n) {
        if(n<=1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    public static void main(String agrs[]){
        int a=sc.nextInt();
        System.out.println(factorial(a));
    }
}

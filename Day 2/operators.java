import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Arithmetic {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
double mealCost = scan.nextDouble(); // original meal price
int tipPercent = scan.nextInt(); // tip percentage
int taxPercent = scan.nextInt(); // tax percentage
scan.close();

// Write your calculation code here.
double tip = mealCost * ((double)tipPercent / 100);
double tax = mealCost * ((double)taxPercent / 100);
double tot = mealCost + tip + tax;
// cast the result of the rounding operation to an int and save it as totalCost
int totalCost = (int) Math.round(tot);

// Print your result
System.out.println(βThe total meal cost is β + totalCost + β dollars.β);
}
}

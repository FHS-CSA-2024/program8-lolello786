import java.util.Scanner;
//Your code here
public class calc{
    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);
        System.out.println("What's your first number?");
        String numba1 = myObj.nextLine();
        System.out.println("#1 = "+ numba1);
        System.out.println("What's your second number?");
        String numba2 = myObj.nextLine();
        System.out.println("#2 = "+ numba2);
        
        int n1 = Integer.valueOf(numba1);       
        int n2 = Integer.valueOf(numba2);
        
        int sum = n1 + n2;
        System.out.println("Sum: " + sum);
        
        int dif = n1 - n2;
        System.out.println("Difference: " + dif);
        
        int Prod = n1 * n2;
        System.out.println("Product: " + Prod);
        
        double avg = (double)(n1 + n2)/2;
        System.out.println("Average: " + avg);
        
        int abs = Math.abs (n1 - n2);
        System.out.println("Absolute Value: " + abs);
        
        int max;
        if(n1 > n2){
             max = n1;
        }
        else{
             max = n2;
        }
        System.out.println("Maximum: " + max);
        
        int min;
        if(n1 < n2){
            min = n1;
        }
        else{
            min = n2;
        }
        System.out.println("Minimum: " + min);
    
    
    }
    }
    
/*
What's your first number?
13
#1 = 13
What's your second number?
20
#2 = 20
Sum: 33
Difference: -7
Product: 260
Average: 16.5
Absolute Value: 7
Maximum: 20
Minimum: 13
*/

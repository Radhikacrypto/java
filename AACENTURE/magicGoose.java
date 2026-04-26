package AACENTURE;

import java.util.Scanner;

public class magicGoose {
    public static void main(String ar[]){
         Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the day");
        int day = sc.nextInt();
        
        if (day <= 0 || day > 30) {
            System.out.println(day + " is invalid day");
        } else {
            long p0 = 0, p1 = 1, p2 = 0;
            
            if (day == 1) {
                System.out.println("Number of eggs in 1th day is 1");
            } else if (day == 2) {
                System.out.println("Number of eggs in 2th day is 2");
            } else {
                for (int i = 2; i <= day; i++) {
                    p2 = 2 * p1 + p0;
                    p0 = p1;
                    p1 = p2;
                }
                System.out.println("Number of eggs in " + day + "th day is " + p1);
            }
        }
        sc.close();
    }
}

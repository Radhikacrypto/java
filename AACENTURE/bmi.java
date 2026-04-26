/*
The formula for calculating BMI is weight/(height/100)^2.

Display the bmi with respect to 2 decimal points.

If bmi is greater than or equal to 25, print "You are overweight" and then print the BMI units to be reduced to become fit as "Reduce <<BMI units>>to be fit".

If bmi is less than 25 and greater than or equal to 18.5, print "You are fit and healthy".

If bmi is less than 18.5, print "You are underweight" and then print the BMI units to be gained to become fit as "Gain <<BMI units>> to be fit".

Sample Input 1:

Enter weight in kg

108

Enter height in cm

168

Sample Output 1:

Your BMI is 38.27. You are overweight

Reduce 13.27 to be fit

Sample Input 2:

Enter weight in kg

68

Enter height in cm

172

Sample Output 2:

Your BMI is 22.99. You are fit and healthy

Sample Input 3:

Enter weight in kg

42.7

Enter height in cm

158

Sample Output 3:

Your BMI is 17.10. You are underweight

Gain 1.40 to be fit




Sample Input 4:

Enter weight in kg

105

Enter height in cm

170

Sample Output 1:

Your BMI is 36.33. You are overweight

Reduce 11.33 to be fit

Sample Input 5:

Enter weight in kg

60

Enter height in cm

164

Sample Output 5:

Your BMI is 22.31. You are fit and healthy

Sample Input 6:

Enter weight in kg

45.5

Enter height in cm

174

Sample Output 6:

Your BMI is 15.03. You are underweight

Gain 3.47 to be fit

 */

package AACENTURE;

import java.util.Scanner;

public class bmi {
    public static void main(String ar[]){
       Scanner sc = new Scanner(System.in);

        System.out.println("Enter weight in kg");
        double weight = sc.nextDouble();

        System.out.println("Enter height in cm");
        double height = sc.nextDouble();

        // BMI calculation
        double bmi = weight / Math.pow((height / 100), 2);

        if (bmi >= 25) {
            System.out.printf("Your BMI is %.2f. You are overweight\n", bmi);
            System.out.printf("Reduce %.2f to be fit", (bmi - 25));
        }
        else if (bmi >= 18.5) {
            System.out.printf("Your BMI is %.2f. You are fit and healthy", bmi);
        }
        else {
            System.out.printf("Your BMI is %.2f. You are underweight\n", bmi);
            System.out.printf("Gain %.2f to be fit", (18.5 - bmi));
        }
      sc.close();
    }
}

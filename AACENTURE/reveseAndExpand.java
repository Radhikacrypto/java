package AACENTURE;

import java.util.Scanner;

public class reveseAndExpand {
    public static void main(String ar[]){
        //NOTE EXPANDING LOGIC HERE WE WERE NOT ABLE TO DECODE THAT PART 

               Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        // Check 4-digit number
        if (num < 1000 || num > 9999) {
            System.out.println(num + " is an invalid number");
            sc.close();
            return;
        }

        // Reverse number
        //int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reversed number is " + reversed);

        // Expansion logic
        int temp = reversed;
        int divisor = 1;

        // find highest place value
        while (temp >= 10) {
            temp = temp / 10;
            divisor *= 10;
        }

        // print expanded form
        while (divisor > 0) {
            int digit = reversed / divisor;

            if (digit != 0) {
                System.out.print(digit * divisor);
                if (divisor > 1) {
                    System.out.print("+");
                }
            }

            reversed = reversed % divisor;
            divisor = divisor / 10;
        }
        sc.close();

    }
}

/*Oliver and his friend are playing a number game. If Oliver says a 4-digit number, his friend should reverse the number and expand the number.

If the number is not a 4-digit number, then print '<<number>> is an invalid number'.

Note:

- In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by   

  the user and the rest of the text represents the output.

- Adhere to the code template, if provided. 

- Please don't use System.exit(0) to terminate the program.

Sample Input/Output 1:

Enter the number

456

456 is an invalid number

Sample Input/Output 2

Enter the number

5864

Reversed number is 4685

4000+600+80+5

Sample Input/Output 3

Enter the number

3400

Reversed number is 43

40+3 */
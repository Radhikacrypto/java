
/*
Thara is attending maths lecture, her professor asks students to swap two numbers using a bitwise operator. The professor finds it difficult to check the logic of 50 students. So, he decided to write a java program to get two numbers first and second from the user and swap the numbers. He is not good at programming. Help them by developing an application using your java skills.

Note:

Use bitwise operator.
Negative and zero are also accepted as inputs and numbers have to be swapped accordingly.
In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided.
Please ignore the warning message that appears during compilation in the compilation window.
Please do not use System.exit(0) to terminate the program.

Sample Input 1:

Enter the numbers

87

43

Sample Output 1:

Before swapping

first = 87, second = 43

After swapping

first = 43, second = 87
*/



package AACENTURE;

import java.util.*;


public class swapUsignBitwise {
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers");
        int first = sc.nextInt();
        int second = sc.nextInt();

        System.out.println("Before swapping");
        System.out.println("first = " + first + ", second = " + second);

        // Swapping using XOR
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;

        System.out.println("After swapping");
        System.out.println();
        System.out.println("first = " + first + ", second = " + second);



    }
}
/*Good question—this is where people usually get confused.
The nice thing is: XOR swap works perfectly even with negative numbers because Java stores integers in 2’s complement binary form.

🔹 Example with Negative Number
Let’s take:


first = -5  
second = 3
🔹 Step 0: Binary Representation (8-bit for simplicity)

5   = 00000101  
-5  = 11111011   (2’s complement)

3   = 00000011
🔹 Step 1
Java

first = first ^ second;

11111011  (-5)
00000011  ( 3)
-----------
11111000  = -8
Now:


first = -8  
second = 3
🔹 Step 2
Java

second = first ^ second;

11111000  (-8)
00000011  ( 3)
-----------
11111011  = -5
Now:


second = -5   ✅ (original first)
🔹 Step 3
Java

first = first ^ second;

11111000  (-8)
11111011  (-5)
-----------
00000011  = 3
Now:


first = 3   ✅ (original second)
🔹 Final Result

first = 3  
second = -5
✔️ Successfully swapped

🔥 Key Insight
XOR doesn’t care if number is positive or negative

It works on bits only

Since negative numbers are also stored in binary (2’s complement), it still works correctly

⚠️ One Edge Case (Rare but Important)
If both variables refer to the same memory location, XOR swap will break:

Java

a = a ^ a; // becomes 0
✅ Conclusion
Works for:

Positive numbers ✔️

Negative numbers ✔️

Zero ✔️

If you want, I can give you a super short trick to solve XOR questions mentally in exams (takes 5 seconds).







 */

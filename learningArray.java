
import java.util.*;

public class learningArray{
    public static void main(String ar[]){
        Scanner sc= new Scanner(System.in);
        // declaring array 
         int arr[]={2,3,4};
         int arr1[]= new int[4];
         arr1[0]=23;
         arr1[1]=34;
         arr1[2]=45;
         arr1[3]=67;

         for(int i=0; i<4; i++){
            System.out.printf("%d  ",arr1[i]);
         }

         //2d array

         int nums[][]= new int[3][4];

         for (int i =0; i<3; i++){
            for (int j=0; j<4; j++){
                System.out.printf("Enter the value of nums[%d][%d]", i,j); 
                int num =sc.nextInt();
                nums[i][j]=num;
            }
         }

         System.out.print(" printing 2d array");
         for(int i=0; i<3; i++){
            for(int j=0;j<4;j++){
                System.out.printf(" %d ",nums[i][j]);
            }
            System.out.print("/n");
         }

    }
}
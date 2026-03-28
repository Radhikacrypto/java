class calculator{
    public int add(int n1, int n2){
        return n1+n2;
    }

    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }

    public double add(double n1, double n2){
        return n1+n2;
    }
    
}
public class methodOverloading {
    public static void main(String ar[]){

        calculator obj= new calculator();
        int result1= obj.add(2,3);
        int result2= obj.add(3,4,5);
        double result = obj.add(23.443, 44.56);
        System.out.printf(" sum of two number %d  \n", result1);
         System.out.printf(" sum of three number %d  \n", result2);
          System.out.printf(" sum of double number %.3f  \n", result);

    }
}

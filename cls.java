class calculator{
    
     int add(int a, int b){
        int result= a+b;
        return result;
     }
     String getMePen(int cost ){
        return" here is your pen  of rs "+ cost;
     }
}

public class cls {
    public static void main(String ar[]){
        int a= 23;
        int b= 34;
        calculator calc = new calculator();
        int result = calc.add(a,b);
        System.out.print( result);



        String r=calc.getMePen(10);
        System.out.println(r);
    }
}

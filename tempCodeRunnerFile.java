public class String_buffer{
    public static void main(String ar[]){
        StringBuffer sb= new StringBuffer();
        System.out.printf(" the output of capacity when sb is empty is  "+ sb.capacity());
        StringBuffer sb1 = new StringBuffer(" Austin");
        System.out.printf(" the output of capacity when sb1 has austin is  "+ sb1.capacity());
        System.out.printf(" the lenght ofstring sb1 = austin is  "+ sb.length());
        //String str = sb1.toString();
        sb1.insert(6, " james ");
        System.out.printf(" after insettitng the ouput is "+ sb1);
    }
}
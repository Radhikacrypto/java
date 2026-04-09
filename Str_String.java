public class Str_String{
    public static void main(String ar[]){
        String a= "name";
        System.out.print("hello"+ a);
        a= a+" is austin"; // orginal a is no changed just the locaction of variable a i schanged and there stored new name is austin

        //below both these are actually having same loaction in heap 
        String s1= "james";
        String s2="james";
    }
}
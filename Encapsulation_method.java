class Student{
    private int age;
    private String roll_no;
    String name;

    public  void show(int a, String b){
        age=a;
        roll_no= b;
        System.out.printf(" the age is: "+age);
        System.out.printf(" \n Roll number is :"+ roll_no);

    }
}

class Encapsulated_method{
    public static void main(String ar[]){

        Student s1= new Student();
        // s1.age = something not allowed 
         

    }
}
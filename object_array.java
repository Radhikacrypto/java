class Student{
    String name; 
    int marks; 
    int roll_no;
}


public class object_array{
    public static void main(String a[]){

        // manual way of declaring 3 students 
        Student s1= new Student();
        s1.name="Raghav";
        s1.roll_no= 34;
        s1.marks=99;

        Student s2 = new Student();
        s2.name=" austin";
        s2.roll_no= 35;
        s2.marks= 89;

       
        // using aarray of objects 

        Student s[] = new Student[3];
        Student s3= new Student(); //manually you have to declare to be part of object 
        s[0]= s1;
        s[1]= s2;
        s[2]= s3;

        s3.name= "third";

        System.out.print(s3.name + " ");

        for(Student stud: s){
            System.out.print( stud.name+ "   \n");
        }
    }
}
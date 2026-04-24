class A{
    public A(){
        //super()
        //this method alos has super keyword as there is no class explicitly extended therefore class extends object class
        //every class in java extensds object class and eveyr method has super method 

        System.out.println(" in A");
    }

    public A( int n){
        System.out.println(" in A with int");
    }
}

class B extends A
{

    // every method and constructoor of this class also has super mehtod 
    // b extend A therefore the super method of this class will call by default default constructor of the super class
    public B(){
        System.out.println(" in B");
    }

    public B( int n){
        System.out.println(" in B with int ");
    }
}


class C extends A{
    public C(){
        super(5);
        System.out.println(" in C");
        
    }

    public C( int n ){
        this();
        // it will call first default constructor of C but there is first super therefore order of print here will a---> c default ----> c parameterized 
        System.out.println(" in cwith int ");
    }
}



public class ThisandSuper {
    public static void main(String ar[]){

        System.out.println(" creating object of B with default constructor");

        B obj =new B();

        System.out.println("creating object using parameterizedd constructor ");
        B obj1 = new B(78);
ch
        System.out.println(" object with constructor having this ");
        C objC= new C(66);


        System.out.println(" object with parameterized super ");
        C objeC1 = new C();
    }
}

class phone {
    int year; 
    String name; 
    int price; 
    static String manufacturer_country;

    public void show(){
        System.out.printf(name +  ": " + year + ": " + price + " : ");
    }
}


public class Static_Var {
    public static void mian(String ar[]){
        phone ph1= new phone():
        ph1.name= "Apple ";
        ph1.year= 2012;
        ph1.price=50,000;
        ph1.manufacturer_country= " Seattle";

        System.out.printf(" the satic variable for ph1 manufacture country is : "+ ph1.manufacturer_country);

        phone ph2= new phone();
        ph2.manufacturer_country=" tokyo";

        System.out.printf(" the static variablw will be change now showing static variable for ph1"+ ph1.manufacturer_country); 
        System.out.printf(" the static variable for ph2 is : "+ph3.manufacturer_country);

    }
}
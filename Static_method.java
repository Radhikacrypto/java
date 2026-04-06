class phone {
    int year; 
    String name; 
    int price; 
    static String manufacturer_country;
    static String material_location;

    public void show(){
        System.out.printf(name +  ": " + year + ": " + price + " \n ");

    }

    public static void show1() {
        System.out.printf(" welcome to static method show 1 \n");
        System.out.printf(" we wil not be able to print non static object here like that of year , name snnd price\n but we can print manufacture_country " + manufacturer_country +"\n");
        
    }

    public static void Show2(phone obj){
        System.out.print(" using object refrerence to print non static variable \n");
        System.out.printf(" obj.name="+obj.name+"  obj.year="+ obj.year+"\n");
        System.out.printf(" material location="+ material_location+ "\n");

    }
}


class Static_method {
    public static void main(String ar[]){
        phone obj1= new phone();
        obj1.name= "Appple IPhone 17 pro max";
        obj1.year=2025;
        

        phone obj2=new phone();
        obj2.manufacturer_country= " usA";
        obj2.material_location=" China";

        System.out.print(" class calling a method\n");
        phone.show1();
        //phone.show() it is not allowed as sho is non static method 

        phone.Show2(obj1);
    }
}
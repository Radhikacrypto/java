class phone{
    int year;
    String name;
    int price;
    static String manufacturer_country;

    public phone(){
        System.out.print(" Constructor is being called \n");
        price= 200;
        name = "phone";
        year= 2000;

    }

    static {
        manufacturer_country=" USA";
        System.out.print(" static block has been called\n");
    }
}

class static_block{
    public static void main(String ar[]){

        phone ph1= new phone();
        phone ph2= new phone();

    }
}
public class Calc{
    int val1; 
    int val2;

    //constructor for default values
     public Calc(){

        val1= 0;
        val2 = 0;
    }
    
    public void setVal(int val1, int val2) {
        this.val1 = val1;
        this.val2=val2;
    }
   
    public int add() {
        int result = val1+val2;
        return result;
    }

    public int subtract() {
        int result= val1- val2;
        return result;
    }
    
}
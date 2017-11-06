
package Array_Concept;


public class ObjectTypeArray {
    
    public static void main(String[] args){
        System.out.println("This is a Example of Obj type Array.");
        
        Account accObjArr[] = new Account[2];
        accObjArr[0] = new Account(1, "Dhaka");
        accObjArr[1] = new Account(2,"Borisal");
        
        System.out.println("Array First Emement:");
         accObjArr[0].showData();
         
        System.out.println("Array Second Emement:");
         accObjArr[1].showData();
    }
    
}

class Account {

    int a;
    String b;

    public Account(int a, String b) {
        this.a = a;
        this.b = b;
    }
    
    public void showData(){
        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);
    }
    
    
    
}

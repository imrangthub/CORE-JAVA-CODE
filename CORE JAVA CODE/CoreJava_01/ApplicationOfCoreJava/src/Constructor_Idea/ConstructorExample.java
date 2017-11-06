
package Constructor_Idea;

class employee{
    int empId;
    String empName;
    
//    public employee(){
//        empId=9909;
//        empName = "BaBu";
//    }
     public employee(int empId, String empName){
        this.empId = empId;
        this.empName = empName;
    }
    
    
    void showData(){
        System.out.println("Emp Id: "+empId+" Emp Name: "+empName);
    }
}
class manager extends employee{
    String Dept;
    public manager(int empId, String empName, String deptName){
        super(202,"MD IMRAN HOSSAIN");
        this.Dept = deptName;
    }
    
    void showData(){
        System.out.println("Emp Id: "+empId+" Emp Name: "+empName+" Eept: "+Dept);
    }
    
}

public class ConstructorExample {
    
    
    public static void main(String[] args){
        
        manager manObj = new manager(1,"md babu", "CSE");
        manObj.showData();
        
        
    }
    
}

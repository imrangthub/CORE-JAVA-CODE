
package ToString_Method;

public class ToStringMethodCls {
    
    String s1,s2;
    
    public ToStringMethodCls(String st1, String st2){
        this.s1 = st1;
        this.s2 = st2;
    }

    @Override
    public String toString(){
        return "["+s1+" "+s2+"]";
    }
    
    public static void main(String[] args){
        ToStringMethodCls obj = new ToStringMethodCls("Hello", "MD IMRAN HOSSAIN");
        System.out.println(obj);
    }
    
    
    
}

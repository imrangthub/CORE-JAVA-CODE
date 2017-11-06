
package Generics;

import java.util.ArrayList;
import java.util.List;

class SuperCls{
    
}
class ChildCls extends SuperCls{
    
}
class GrandChildCls extends ChildCls{
    
}


public class GenericLowerBoundedWildcard2 {
    
    public static void addingSuperCls( List<? super GrandChildCls> superClsName){
       superClsName.add(new GrandChildCls());
       System.out.println(superClsName);
    }
    
    public static void main(String[] args){
        
        List<GrandChildCls> grandChildList = new ArrayList();
        grandChildList.add(new GrandChildCls());
        addingSuperCls(grandChildList);
        
        List<ChildCls> childClsList = new ArrayList();
        childClsList.add(new ChildCls());
        addingSuperCls(childClsList);
        
        List<SuperCls> superClsList = new ArrayList();
        superClsList.add(new SuperCls());
        addingSuperCls(superClsList);
        
    }
    
}

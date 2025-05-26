package Core_Java_Topics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Arrays;
public class CollectionEX 
{
    public static void main(String[] args) 
    {
        Collection<String> c=new ArrayList<>();
        c.add("Madhuri"); 
        c.add("Bannuuuu");
        //c.addAll(Collection);
        c.remove("I");
         System.out.println(c.size());
         // boolean changed = list1.removeAll(list2);
        
        Iterator<String> it=c.iterator();
       
        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }
        Object[] arr=c.toArray();
        System.out.println(Arrays.toString(arr));




        
    }
    
}

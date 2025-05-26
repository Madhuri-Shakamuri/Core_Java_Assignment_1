//42. Create a treeset of strings and sort them by length (use Comparator)
package Core_Java_Questions;

import java.util.Comparator;
import java.util.TreeSet;

public class Collections_Treeset_SortStr_length  implements Comparator<String>  
{
    public int compare(String str1,String str2)
    {
      int new_length=Integer.compare(str1.length(), str2.length());
      return (new_length!=0)?new_length:str1.compareTo(str2);
       
    }
    
  public static void main(String[] args) 
  {
    TreeSet<String> tree = new TreeSet<>(new Collections_Treeset_SortStr_length());
    tree.add("Hello");
    tree.add("Its");
    tree.add("Me");
    tree.add("Madhuri");
    

    System.out.println("Sort Strings by length using Treeset : \n"+tree);
  }  
}

//41. Create a class called Circle with x & y radius, Now create Hashset & insert circle objects with some duplicates, and also use treeset for the same for circle objects and see what happens.
package Core_Java_Questions;

import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;

class Circle  implements Comparable<Circle>
{
    int x;
    int y;
    public Circle(int x,int y)
    {
     this.x=x;
     this.y=y;
    }
    @Override
    public int compareTo(Circle c)
    {
      
      if(this.x!=c.x)  
        return Integer.compare(this.x, c.x);
      
      return Integer.compare(this.y, c.y);
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(x,y);
    }
    @Override
    public boolean equals(Object obj)
    {
      if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle circle = (Circle) obj;
        return x == circle.x && y == circle.y;
    }
    public String toString()
    {
      return "Circle( "+x+","+y+" )";
    }
    
    
}
public class  Collections_circle 
{
    public static void main(String[] args) 
    {
        
        HashSet<Circle> hashset= new HashSet<>();
        hashset.add(new Circle(2, 3));
        hashset.add(new Circle(5,6));
        hashset.add(new Circle(2, 3));

        System.out.println("Hashset : \n"+hashset);
        
        TreeSet<Circle>  treee= new  TreeSet<>();
        treee.add(new Circle(2, 3));
        treee.add(new Circle(5,6));
        treee.add(new Circle(2, 3));

        System.out.println("TreeSet : \n"+treee);
    }
    
}

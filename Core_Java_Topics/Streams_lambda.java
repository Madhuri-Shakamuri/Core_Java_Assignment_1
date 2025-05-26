package Core_Java_Topics;
import java.util.stream.Stream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Arrays;
public class Streams_lambda
{
    public static void main(String[] args) 
    {
        //Creating streams

        //Collections
        List<String> names=Arrays.asList("Madhuri","Shakamuri","Vijaya","Lakshmi");
        //Creating stream - terminal-forEach()
        names.stream().forEach(System.out::println); //method reference
        

        //Arrays
        int[] arr={56,78,43};
        Arrays.stream(arr).forEach(System.out::println);

        //Streamof
        Stream.of("Madhu","BTech").forEach(System.out::println);


        //Intermediate Operations

        //Filter (Predicate) - Filtering names that start with "M"
        List<String> names1=Arrays.asList("Madhuri","Madam","Shakamuri");
        List<String> filtered_names=names1.stream().filter(name->name.startsWith("M")).collect(Collectors.toList());
        System.out.println(filtered_names);

        //Map - Squaring each number 
        List<Integer> nums=Arrays.asList(1,2,3,4,5);
        List<Integer>  map_nums=nums.stream().map(num->num*num).collect(Collectors.toList());
        System.out.println(map_nums);

        //Sorted 
        names.stream().sorted().forEach(System.out::println);

        //collect.Collectors
       List<String> map_UppperCase= names.stream()
       .map(String::toUpperCase).collect(Collectors.toList());
       System.out.println(map_UppperCase);

       //reduce
       int sum=nums.stream().reduce(0,(a,b)->a+b);
       System.out.println(sum);
        
    }
    
}

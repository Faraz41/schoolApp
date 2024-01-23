import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        //Store an ordered collection of elements
        //ArrayList : Dynamic array
        names.add("Java");
        names.add("JavaScript");
        System.out.println(names.size()); // it will print only 2 above
        names.remove("Java");
        names.add("Python");
        System.out.println(names);

        // Integer : this "Integer"  called unboxing
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(10);
        System.out.println(names.isEmpty()); // isEmpty brings to Boolean True or false

    }
}

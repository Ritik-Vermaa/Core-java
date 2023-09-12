import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set{
    public static void main(String[] args) {
        
        //set = ?
        //uniqe value are print double value not print

        //Hashset
        Set<Integer> set = new HashSet<Integer>();
        set.add(30);
        set.add(50);
        set.add(60);
        set.add(60);
        System.out.println("HashSet = " + set);

        //linkedHashSet

        LinkedHashSet<Integer> linkedList = new LinkedHashSet<>();
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(2);
        linkedList.add(5);
        System.out.println("LinkedHashSet = " +linkedList);
        boolean bl = linkedList.contains(2);
        System.out.println(bl);

        //treeSet
         
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(8);
        treeSet.add(5);
        treeSet.add(9);
        treeSet.add(9);
        System.out.println("TreeSet =" +treeSet); //tree set is sorted set

    }
}
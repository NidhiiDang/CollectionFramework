import java.util.List;
import java.util.ArrayList;


public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        //adding elements to list
        list.add(10);
        list.add(20);
        list.add(30);

        // var can be written it can automatically get the type
        // of the data don't need to specify datatype

        for(var i : list){                      //iterate over list
            System.out.println(i);
        }

        System.out.println(list);

        //get value at particular index
        System.out.println(list.get(1));

        //add at particular index
        list.add(2,40);
        System.out.println(list);

        //remove element at particular index
        list.remove(3);
        System.out.println(list);

        //contains() check if element is present or not return boolean
        System.out.println(list.contains(40));

        //check if the list is empty or not
        System.out.println(list.isEmpty());

        //add element at starting index
        list.addFirst(5);
        System.out.println(list);

        //add element in last of the list
        list.addLast(50);
        System.out.println(list);

    }
}

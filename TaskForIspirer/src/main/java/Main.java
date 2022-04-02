import Box.Box;
import List.MyArrayList;
import List.MyList;

public class Main {
    public static void main(String[] args){
        System.out.println("First TASK...");
        Box box1 = new Box();
        Box box2 = new Box();
        Box box4 = new Box(1,2,3);

        System.out.println(Box.getCountInstance());

        System.out.println("\nSecond TASK...\n");
        MyList<String> strings = new MyArrayList<>();

        strings.add("first");
        strings.add("second");
        strings.add("third");

        strings.delete(1);
        System.out.println("Get: " + strings.get(1)+"\n"+
                "Size: "+ strings.size());
    }
}

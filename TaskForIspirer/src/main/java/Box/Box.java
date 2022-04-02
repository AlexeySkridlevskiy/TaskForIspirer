package Box;

public class Box {

    private double length;
    private double weight;
    private double height;
    private static int countInstance;

    public Box(){
        countInstance++;
    }

    public Box(int length, int weight, int height){
        this();
        this.length = length;
        this.weight = weight;
        this.height = height;
    }

    public static int getCountInstance(){
        return countInstance;
    }
}

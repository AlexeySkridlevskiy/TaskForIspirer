package List;

public class ActionChanged implements ChangedInterface {

    @Override
    public void Changed(String s) {
        System.out.println("Resizing in " + s + " method...");
    }
}

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> prims = new ArrayList();

        prims.add(3);
        prims.add("String");
        prims.add(true);

        System.out.println(prims.get(2).getClass());
    }




}
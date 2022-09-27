package Items;

import java.util.HashMap;
import java.util.Map;

public class Product {

    private static int ids=0;
    private static final HashMap<Integer,String> names= new HashMap<>();
    {
        names.put(1,"Juicier");
        names.put(2,"Televisor");
        names.put(3,"Fan");
        names.put(4,"DishWasher");
        names.put(5,"Radiator");
    }
    private static final HashMap<Integer,String> postfix= new HashMap<>();
    {
        postfix.put(1,"Samsung");
        postfix.put(2,"Bork");
        postfix.put(3,"Phillips");
        postfix.put(4,"Dyson");
        postfix.put(5,"Sony");
    }

    private int id;
    private String name;
    private int cost;

    public Product(String name, int cost) {
        this.id=ids;
        this.name = name;
        this.cost = cost;
        ids++;
    }

    public Product() {
        id=ids;
        String prName = names.get((int)(1+Math.random()*4))+" "+postfix.get((int)(1+Math.random()*4));
        name=prName;
        cost=(int)(Math.random()*20000);
        ids++;
    }



    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name +
                ", cost=" + cost;
    }
}

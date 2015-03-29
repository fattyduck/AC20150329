package nyc.c4q.fattyduck;
import java.util.HashMap;
import java.util.ArrayList;
public class Main {



    public static HashMap<String, Integer> getLengths(ArrayList<String> strings) {
        HashMap<String, Integer> Lengths =new HashMap<String, Integer>();
        for (int i=0;i<strings.size();i++) {
            Lengths.put(strings.get(i), strings.get(i).length());
        }
        return Lengths;
    }
    public static void main(String[] args) {

        ArrayList<String> strings=new ArrayList<String>();
        strings.add("Broccoli");
        strings.add("Corn");
        strings.add("Tomato");
        strings.add("Pepper");
        strings.add("Onion");

        System.out.println(getLengths(strings).get("Corn"));
	// write your code here
    }
}

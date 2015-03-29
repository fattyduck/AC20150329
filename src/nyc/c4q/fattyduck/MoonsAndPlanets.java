package nyc.c4q.fattyduck;

import java.util.HashMap;

/**
 * Created by fattyduck on 3/29/15.
 */
public class MoonsAndPlanets {

    public static HashMap<String, Integer> numberOfMoons (){
        HashMap<String, Integer> numberOfMoons = new HashMap<String, Integer>();
        numberOfMoons.put("Mercury", 0);
        numberOfMoons.put("Venus", 0);
        numberOfMoons.put("Mars", 2);
        numberOfMoons.put("Earth", 1);
        numberOfMoons.put("Jupiter", 67);
        numberOfMoons.put("Saturn", 62);
        numberOfMoons.put("Uranus", 27);
        numberOfMoons.put("Neptune", 14);
        return numberOfMoons;

    }
    public static Integer getMoons(String planet){
        Integer i=numberOfMoons().get(planet);
        return i;
    }

    public static boolean isPlanet(String name){
        boolean isPlanet=false;
        if(numberOfMoons().containsKey(name)){
            isPlanet=true;
        }
        return isPlanet;
    }

    public static void main(String[] args) {

        System.out.println(getMoons("cow"));



    }
}

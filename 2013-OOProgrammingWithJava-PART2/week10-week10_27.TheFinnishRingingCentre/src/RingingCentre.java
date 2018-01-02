
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nathan
 */
public class RingingCentre {
    private Map<Bird, List<String>> sightings;

    public RingingCentre() {
        sightings = new HashMap<Bird, List<String>>();
    }
    
    public void observe(Bird bird, String place){
        if (sightings.containsKey(bird)){
            sightings.get(bird).add(place);
        } else{
            sightings.put(bird, new ArrayList<String>());
            sightings.get(bird).add(place);
        }
    }
    
    public void observations(Bird bird){
        if (sightings.containsKey(bird)){
            System.out.println(bird + " observations: " + sightings.get(bird).size());
            sightings.get(bird).forEach(n -> System.out.println(n));
        } else{
            System.out.println(bird + " observations: 0");
        }
    }
}

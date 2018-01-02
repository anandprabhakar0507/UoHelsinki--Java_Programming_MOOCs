/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

/**
 *
 * @author nathan
 */
public class FilmComparator implements Comparator<Film>{
    private Map<Film, List<Rating>> filmToRatings;
    
    public FilmComparator(Map<Film, List<Rating>> ratings){
        this.filmToRatings = ratings;
    }

    @Override
    public int compare(Film o1, Film o2) {
        double a1 = average(this.filmToRatings.get(o1));
        double a2 = average(this.filmToRatings.get(o2));
        return (int)(a2-a1);
    }
    
    private double average(List<Rating> ratings){
        double sum = 0.0;
        for (Rating r : ratings)
            sum += r.getValue();
        double average = sum/ratings.size();
        return sum/ratings.size();
    }
}

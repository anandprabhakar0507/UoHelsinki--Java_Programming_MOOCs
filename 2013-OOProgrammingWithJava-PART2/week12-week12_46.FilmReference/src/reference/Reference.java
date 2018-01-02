/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import reference.comparator.FilmComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author nathan
 */
public class Reference {
    private RatingRegister register;

    public Reference(RatingRegister register) {
        this.register = register;
    }
    
    public Film recommendFilm(Person person){
        Set<Film> seen = register.getPersonalRatings(person).keySet();
        if (seen.isEmpty())
            return recommendFilmBasedOnHighestAverageRating();
        return recommendFilmBasedOnSimilarRatings(person);
    }
    
    public Film recommendFilmBasedOnSimilarRatings(Person person){
        //set of films seen by person
        Set<Film> seen = register.getPersonalRatings(person).keySet();
        
        //Map for storing similarity scores
        Map<Person, Integer> similarityScores = new HashMap<Person, Integer>();
        
        //Map containing everybody's ratings
        Map<Person, Map<Film, Rating>> personalRegisters = register.getPersonalRegisters();
        
        int maxSimilarityScore = -1000000;
        Person maxPerson = null;
        
        for (Person p : personalRegisters.keySet()){
            
            if (p.equals(person))
                continue;
            Map<Film, List<Rating>> filmRatings = register.getFilmRatings();
            int similarityScore = 0;
            
            for (Film f : filmRatings.keySet()){
                similarityScore += register.getRating(person, f).getValue() 
                                 * register.getRating(p,      f).getValue();
            }
            
            if (similarityScore > maxSimilarityScore){
                maxSimilarityScore = similarityScore;
                maxPerson = p;
            }
            
        }
        
        //should probably put this into its own method...
        Film bestChoice = null;
        int maxRating = -10;
        Map<Film, Rating> maxPersonRatings = register.getPersonalRatings(maxPerson);
        
        //for each film  in maxPerson's film ratings
        for (Film f : maxPersonRatings.keySet())
        
            //if film is not in person's seen list
            if (!seen.contains(f))
                
                //if film rating is largest
                if (maxPersonRatings.get(f).getValue() > maxRating){
                    
                    //set corresponding film as the current best choice
                    bestChoice = f;
                    maxRating = maxPersonRatings.get(f).getValue();
                }
        
        //if best choice has positive rating and maxPerson exists
        if (maxRating > 0 && maxPerson != null)
            
            //return best choice
            return bestChoice;
        
        return null;
    }
    
    public Film recommendFilmBasedOnHighestAverageRating(){
        Map<Film, List<Rating>> filmRatings = register.filmRatings();
        List<Film> films = new ArrayList<Film>(filmRatings.keySet());
        Collections.sort(films, new FilmComparator(filmRatings));
        return films.get(0);
    }
    
    
}

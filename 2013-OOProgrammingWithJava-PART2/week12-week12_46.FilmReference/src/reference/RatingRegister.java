/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author nathan
 */
public class RatingRegister {
    private Map<Film, List<Rating>> filmRatings;
    private Map<Person, Map<Film, Rating>> personalRegisters;
    
    public RatingRegister(){
        this.filmRatings = new HashMap<Film, List<Rating>>();
        this.personalRegisters = new HashMap<Person, Map<Film, Rating>>();
    }
    
    public Map<Person, Map<Film, Rating>> getPersonalRegisters() {
        return personalRegisters;
    }

    public Map<Film, List<Rating>> getFilmRatings() {
        return filmRatings;
    }
    
    public void addRating(Film film, Rating rating){
        if (filmRatings.containsKey(film))
            filmRatings.get(film).add(rating);
        else{
            filmRatings.put(film, new ArrayList<Rating>());
            filmRatings.get(film).add(rating);
        }
    }
    
    public List<Rating> getRatings(Film film){
        return filmRatings.get(film);
    }
    
    public Map<Film, List<Rating>> filmRatings(){
        return this.filmRatings;
    }
    
    public void addRating(Person person, Film film, Rating rating){
        if (personalRegisters.containsKey(person)){
            this.personalRegisters.get(person).put(film, rating);
            addRating(film, rating);
        } else{
            this.personalRegisters.put(person, new HashMap<Film, Rating>());
            this.personalRegisters.get(person).put(film, rating);
            addRating(film, rating);
        }
    }
    
    public Rating getRating(Person person, Film film){
        Rating rating = this.personalRegisters.get(person).get(film);
        if (rating != null)
            return rating;
        else
            return Rating.NOT_WATCHED;
    }
    
    public Map<Film, Rating> getPersonalRatings(Person person){
        Map<Film, Rating> personalRatings = this.personalRegisters.get(person);
        if (personalRatings != null)
            return personalRatings;
        else{
            personalRatings = new HashMap<Film, Rating>();
            this.personalRegisters.put(person, personalRatings);
            return personalRatings;
        }
            
    }
    
    public List<Person> reviewers(){
        return new ArrayList<Person>(this.personalRegisters.keySet());
    }
    
}


public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }

    @Override
    public int hashCode() {
        return this.latinName.hashCode() + this.ringingYear;
    }

    public boolean equals(Object obj) {
        if (obj.getClass() == this.getClass()){
            Bird obj2 = (Bird)obj;
            return this.latinName.equals(obj2.latinName) && this.ringingYear == obj2.ringingYear;
        } else
            return false;
        
    }
    
    
}



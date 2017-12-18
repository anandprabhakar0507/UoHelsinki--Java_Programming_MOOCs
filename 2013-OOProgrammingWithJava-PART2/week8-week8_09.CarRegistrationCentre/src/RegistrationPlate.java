
public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    public String getRegCode() {
        return regCode;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass())
            return false;
        
        RegistrationPlate plate = (RegistrationPlate) obj;
        
        if (plate.getCountry() == this.getCountry() && plate.getRegCode() == this.getRegCode())
            return true;
        
        return false;
    }

    @Override
    public int hashCode() {
        if (this.country == null)
            return this.regCode.hashCode() + 7;
        if (this.regCode == null)
            return this.country.hashCode() + 13;
        return this.country.hashCode() + this.regCode.hashCode();
    }
    
    
    

}
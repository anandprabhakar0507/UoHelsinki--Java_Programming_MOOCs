package boxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {
        if (weight < 0){
            throw new IllegalArgumentException("Thing Weight Must Be >=0");
        }
        this.name = name;
        this.weight = weight;
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() == this.getClass())
            return this.name.equals(((Thing)obj).getName());
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
    
    
    
    
    
    

}

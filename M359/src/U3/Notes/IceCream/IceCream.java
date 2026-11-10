package U3.Notes.IceCream;

public class IceCream {
    private String flavor;
    private int numScoops;
    private boolean inCone;

    public IceCream(String flavor, int numScoops, boolean inCone) {
        this.flavor = flavor;
        this.numScoops = numScoops;
        this.inCone = inCone;
    }

    // two IceCream objects are equal if ALL variables are the same
    public boolean equals(IceCream other) {
        return(this.flavor.equals(other.flavor) && this.numScoops == other.numScoops && this.inCone == other.inCone);
    }


    // Sample String returned:
    // Rocky Road cone with 3 scoops
    // Strawberry Bowl with 2 scoops
    public String toString() {
        if(inCone){
            return flavor + " cone with " + numScoops + " scoops";
        }
        else{
            return flavor + " bowl with " + numScoops + " scoops";
        }
    }
}


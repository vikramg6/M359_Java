package U3.Notes.IceCream;


public class IceCreamTester {
    public static void main(String[] args) {
        IceCream bob = new IceCream("Rocky Road", 3, true);
        IceCream shannon = new IceCream("Mint Chip", 2, false);
        IceCream aubrey = new IceCream("Mint Chip", 2, false);
        IceCream riley = bob;

        // How many variable references have I made?
        //3
        // How many objects have I instantiated?
        //4
        // Write in comments what you think the output would be THEN run
        //false
        //true
        //true
        //false
        //true
        //Rocky Road cone with 3 scoops
        //Mint Chip bowl with 2 scoops
        //Mint Chip bowl with 2 scoops
        //Rocky Road cone with 3 scoops
        // the code to see if you are correct
        System.out.println(bob.equals(shannon ));        //
        System.out.println(aubrey.equals(shannon ));     //
        System.out.println(bob.equals(riley));      	  //
        System.out.println(aubrey == shannon );          //
        System.out.println(riley == bob);           	  //

        System.out.println(bob);			//
        System.out.println(shannon);			//
        System.out.println(aubrey);			//
        System.out.println(riley);			//
    }
}


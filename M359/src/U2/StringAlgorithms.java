package U2;

public class StringAlgorithms {
    public static void main(String[] args) {

        // PART I
        String mySchool = "Fremd Vikings";

        // print every other character of mySchool on the same line
        for(int i = 0; i < mySchool.length(); i+=2){
            System.out.print(mySchool.charAt(i));
        }
        System.out.println();

        // print the String mySchool in reverse (all characters on the same line)
        for(int n = mySchool.length(); n > 0; n--){
            System.out.print(mySchool.charAt(n-1));
        }




         /* PART II
           Given the String animal, print the output such that the first line shows
           the first character, the second line shows the second character, and so on

           Ex:  If animal = "monkey" then the output would be:
               m
               mo
               mon
               monk
               monke
               monkey
        */
        String animal = "monkey";
        for (int y = 0; y <= animal.length(); y++){
            for (int z = 0; z < y; z++){
                System.out.print (animal.substring(z,z+1));
            }
            System.out.println();
        }





        // PART III
        String phrase = "Mary had a little lamb, little lamb, little lamb";
        phrase += " Mary had a little lamb, its fleece was white as snow";
        String word = "little";
        int num = 0;
        // Print the amount of times the word "little" appears within phrase?
        for (int i = 0; i + word.length() <= phrase.length(); i++){
            String a = phrase.substring(i, i + word.length());
            if (a.equals(word)){
                num++;
            }
        }
        System.out.println(num);

        String newPhrase = phrase;
        // create a new String, or modify the existing String, that removes
        // the word "little" entirely
        while (phrase.indexOf(word) != -1) {
            int indexLittle = phrase.indexOf(word);
            newPhrase = phrase.substring(0, indexLittle);
            newPhrase += phrase.substring(indexLittle + word.length());
            phrase = newPhrase;
        }
        System.out.println(newPhrase);





        // create a new String (based on phrase), or modify the existing String,
        // that replaces the word "little" with the word "BIG"
        String rePhrase = "Mary had a little lamb, little lamb, little lamb";
        rePhrase += " Mary had a little lamb, its fleece was white as snow";
        while (rePhrase.indexOf(word) != -1) {
            int indexLittle = rePhrase.indexOf(word);
            newPhrase = rePhrase.substring(0, indexLittle);
            newPhrase += "BIG";
            newPhrase += rePhrase.substring(indexLittle + word.length());
            rePhrase = newPhrase;

        }
        System.out.println(newPhrase);

    }
}

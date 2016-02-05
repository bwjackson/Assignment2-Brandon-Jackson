/**
 * Created by Brandon on 2/4/2016.
 */

public class BeerSong {

    public static void main(String[] args) {
        Ninety_Nine_Bottles_of_Beer();
    }

    public static void Ninety_Nine_Bottles_of_Beer() {
        for(int i = 99; i > 2; i--) {
            System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer");
            System.out.println("take one down, pass it around, " + Integer.toString(i-1) + " bottles of beer on the wall.");
        }
        System.out.println("2 bottles of beer on the wall, 2 bottles of beer");
        System.out.println("take one down, pass it around, 1 bottle of beer on the wall.");
        System.out.println("1 bottle of beer on the wall, 1 bottle of beer");
        System.out.println("take one down, pass it around, no more bottles of beer on the wall.");
    }
}

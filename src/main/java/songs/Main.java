package songs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Song> myLibrary;// created a reference to a list of objects
        myLibrary = new ArrayList<>();// instantiating the list



        myLibrary.add(new Song("gerry", "aaello", 9.9));

        myLibrary.add(new Song("aesha", "bDk", 2.30));

        Song song1 = new Song("zohn", "aaaello", 2.09);// new instance of an object
        myLibrary.add(song1);// added song1 to myLibrary


        // System.out.println(myLibrary);

       Collections.sort(myLibrary);
        System.out.println("------------");
        System.out.println("Sort by Length");
        for(Song s : myLibrary){
            System.out.println(s);
        }

        System.out.println("------------");
        System.out.println("Sort by Artist");

        ArtistComparator artistComparator = new ArtistComparator();
        Collections.sort(myLibrary, artistComparator);

        for(Song s : myLibrary){
            System.out.println(s);
        }

        System.out.println("------------");
        System.out.println("Sort by Title");

        TitleComparator titleComparator = new TitleComparator();
        Collections.sort(myLibrary, titleComparator);

        for(Song s : myLibrary){
            System.out.println(s);
        }

    }
}

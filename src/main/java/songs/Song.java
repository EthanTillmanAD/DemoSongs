package songs;

import java.util.Comparator;

public class Song implements Comparable<Song>{
    private String artist;
    private String title;
    private double length;


    public Song(String artist, String title, double length) {
        this.artist = artist;
        this.title = title;
        this.length = length;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Song{" +
                "artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                ", length=" + length +
                '}';
    }

    @Override
    public int compareTo(Song o) {//sort by length
        if(this.length > o.length){
            return 1;
        } else if (this.length < o.length) {
            return -1;
        }else{
            return 0;
        }
    }


//    @Override
//    public int compareTo(Song o) {//sort by artist
//        return this.artist.compareTo(o.artist);
//    }


//    @Override
//    public int compareTo(Song o) {//sort by title
//        return this.title.compareTo(o.getTitle());
//    }


}

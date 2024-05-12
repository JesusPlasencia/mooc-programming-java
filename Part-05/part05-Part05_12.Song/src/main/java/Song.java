
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }
    
    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    @Override
    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) return true;
        
        // Returns false if the parameter is not of type Song
        if (!(compared instanceof Song)) return false;
        
        // Create Song
        Song comparedSong = (Song) compared;
        
        // Check all attributes from a song
        if (this.name.equals(comparedSong.getName()) && 
            this.artist.equals(comparedSong.getArtist()) &&
            this.durationInSeconds == comparedSong.getDurationInSeconds()) {
            return true;
        }
        
        return false; // otherwise the titles are not the same are not equal
    }

}

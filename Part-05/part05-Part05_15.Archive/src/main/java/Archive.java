public class Archive {

    private String identifier;
    private String name;

    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Archive)) {
            return false;
        }

        Archive comparedArchive = (Archive) obj;

        if (this.identifier.equals(comparedArchive.getIdentifier())) {
            return true;
        }
        return false; 
    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.name; 
    }
    
}

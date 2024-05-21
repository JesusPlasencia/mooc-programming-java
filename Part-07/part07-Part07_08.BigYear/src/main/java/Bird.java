public class Bird {
    
    private String name;
    private String latin;
    private int observationCounter;

    public Bird(String name, String latin) {
        this.name = name;
        this.latin = latin;
        this.observationCounter = 0;
    }

    public String getName() {
        return name;
    }

    public String getLatin() {
        return latin;
    }

    public int getObservationCounter() {
        return observationCounter;
    }

    public void setObservationCounter() {
        this.observationCounter ++;
    }

}

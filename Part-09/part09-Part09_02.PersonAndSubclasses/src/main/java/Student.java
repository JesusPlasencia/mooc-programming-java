public class Student extends Person {

    private int credits;

    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }

    protected int credits() {
        return credits;
    }
//    public int credits() {
//        return credits;
//    }
    
    public void study () {
        this.credits ++;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  " + "Study credits " + this.credits; //To change body of generated methods, choose Tools | Templates.
    }
    
}

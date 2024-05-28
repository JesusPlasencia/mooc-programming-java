public enum Education {
    
    PHD("Doctoral degree"),
    MA("Masters degree"),
    BA("Bachelors degree"),
    HS("High School diploma");
    
    private String grade;
    
    private Education (String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return this.grade;
    }
    
}

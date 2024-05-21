
import java.util.ArrayList;

public class Point {

    private ArrayList<Integer> list;

    public Point() {
        list = new ArrayList<>();
    }

    public void add(int amount) {
        if (amount < 0 || amount > 100) {
            return;
        }
        list.add(amount);
    }

    public void averageAll() {
        int sum = 0;
        for (int num : list) {
            sum = sum + num;
        }
        double average = 1.0 * sum / list.size();
        System.out.println("Point average (all): " + average);
    }

    public void averagePassing() {
        int sum = 0;
        int counter = 0;
        for (int num : list) {
            if (num >= 50 && num <= 100) {
                sum = sum + num;
                counter++;
            }
        }
        if (sum == 0) {
            System.out.println("Point average (passing): -");
        } else {
            double average = 1.0 * sum / counter;
            System.out.println("Point average (passing): " + average);
        }
    }
    
    public void passPercentage () {
        int counter = 0;
        for (int num : list) {
            if (num >= 50) {
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("Pass percentage: 0.0");
        } else {
            double percentage = 1.0 * 100 * counter / list.size();
            System.out.println("Pass percentage: " + percentage);
        }
    }
    
    public void gradeDistribution () {
        System.out.println("Grade distribution:");
        int grade = 5;
        while (grade >= 0) {
            System.out.print(grade + ": ");
            for (int num : list) {
                if (grade == gradeByPoint(num)) {
                    System.out.print("*");
                }
            }
            System.out.println("");
            grade --;
        }
    }
    
    private int gradeByPoint (int point) {
        if (point < 50) {
            return 0;
        }
        else if (point < 60) {
            return 1;
        }
        else if (point < 70) {
            return 2;
        }
        else if (point < 80) {
            return 3;
        }
        else if (point < 90) {
            return 4;
        } else {
            return 5;
        }
    }
}

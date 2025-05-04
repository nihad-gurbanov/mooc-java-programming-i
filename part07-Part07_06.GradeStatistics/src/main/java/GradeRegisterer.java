
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nihad
 */
public class GradeRegisterer {

    private ArrayList<Integer> points = new ArrayList<>();
    private ArrayList<Integer> grades = new ArrayList<>();

    public void addPoint(int point) {
        if (point >= 0 && point <= 100) {
            points.add(point);
        }
    }

    public double averagePoint() {
        int sum = 0;
        for (Integer point : points) {
            sum += point;
        }
        return sum / (double) points.size();
    }

    public double averagePointPassing() {
        int sum = 0;
        int count = 0;

        for (Integer point : points) {
            if (point >= 50) {
                sum += point;
                count += 1;
            }
        }
        return sum / (double) count;
    }

    public double passPercentage() {
        int passing = 0;

        for (Integer point : points) {
            if (point >= 50) {
                passing += 1;
            }
        }
        return 100 * passing / (double) points.size();
    }

    public void gradeGenerator() {
        grades.clear();
        for (Integer point : points) {
            if (point < 50) {
                grades.add(0);
            } else if (point < 60) {
                grades.add(1);
            } else if (point < 70) {
                grades.add(2);
            } else if (point < 80) {
                grades.add(3);
            } else if (point < 90) {
                grades.add(4);
            } else if (point <= 100) {
                grades.add(5);
            }
        }
    }

    public void gradeDistributer() {
        gradeGenerator();
        for (int i = 5; i >= 0; i--) {
            int count = 0;
            for (int grade : grades) {
                if (grade == i) {
                    count++;
                }
            }
            System.out.print(i + ": ");
            for (int j = 0; j < count; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

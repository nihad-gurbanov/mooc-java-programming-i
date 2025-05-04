
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nihad
 */
public class UserInterface {
    private Scanner scanner;
    private GradeRegisterer registerer;
    
    public UserInterface(Scanner scanner, GradeRegisterer registerer) {
        this.scanner = scanner;
        this.registerer = registerer;
    }
    
    public void start() {
        while (true) {
            System.out.println("Enter point totals, -1 stops:");
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                break;
            }
            if (input >= 0 && input <= 100) {
                registerer.addPoint(input);
            }
        }
        System.out.println("Point average (all): " + registerer.averagePoint());
        System.out.println("Point average (passing): " + registerer.averagePointPassing());
        System.out.println("Pass percentage: " + registerer.passPercentage());
        System.out.println("Grade distribution:");
        registerer.gradeDistributer();
    }
    
    
}

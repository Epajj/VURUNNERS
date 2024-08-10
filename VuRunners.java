/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package course.coursework;

/**
 *
 * @author ebepa
 */
import java.util.*;

class Runner {
    String name;
    int timeInMinutes;

    public Runner(String name, int timeInMinutes) {
        this.name = name;
        this.timeInMinutes = timeInMinutes;
    }
}

public class VuRunners {
    public static void main(String[] args) {
        List<Runner> runners = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter runner's name (or 'done' to finish): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Enter " + name + "'s time in minutes: ");
            int time = Integer.parseInt(scanner.nextLine());

            runners.add(new Runner(name, time));
        }

        if (runners.size() < 2) {
            System.out.println("Please enter at least two runners.");
            return;
        }

        // Sort runners by time (fastest first)
        runners.sort(Comparator.comparingInt(r -> r.timeInMinutes));

        // Print fastest runner
        Runner fastest = runners.get(0);
        System.out.println("Fastest runner: " + fastest.name + " (Time: " + fastest.timeInMinutes + " minutes)");

        // Print second fastest runner
        Runner secondFastest = runners.get(1);
        System.out.println("Second fastest runner: " + secondFastest.name + " (Time: " + secondFastest.timeInMinutes + " minutes)");

        scanner.close();
    }
}
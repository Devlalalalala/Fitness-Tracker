import java.util.Scanner;
import java.util.Arrays;
public class FitnessTracker {


public class User {
    private String name;
    private int age;
    private int steps;
    private double distance;
    private int count;
    private String[] exercises;

    public User(String name, int age, int maxExercises) {
        this.name = name;
        this.age = age;
        this.steps = 0;
        this.distance = 0.0;
        this.count = 0;
        this.exercises = new String[maxExercises];
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSteps() {
        return steps;
    }

    public double getDistance() {
        return distance;
    }

    public String[] getExercises() {
        return exercises;
    }

    public void addExercise(String exercise) {
        if (count < exercises.length) {
            exercises[count++] = exercise;
        } else {
            System.out.println("Exercise list is full.");
        }
    }

    public void addSteps(int steps) {
        this.steps += steps;
        updateDistance();
    }

    private void updateDistance() {
        this.distance = this.steps * 0.00078;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + ", steps=" + steps + ", distance=" + distance + " km, exercises=" + Arrays.toString(exercises) + "}";
    }
}

    private User user;
    private Scanner scanner;

    public FitnessTracker() {
        scanner = new Scanner(System.in);
        initializeUser();
    }

    private void initializeUser() {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter the maximum number of exercises you plan to add: ");
        int maxExercises = scanner.nextInt();
        user = new User(name, age, maxExercises);
    }

    public void startTracking() {
        while (true) {
            System.out.println("\n1. Add Steps");
            System.out.println("2. View Stats");
            System.out.println("3. Add Exercise");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addSteps();
                    break;
                case 2:
                    viewStats();
                    break;
                case 3:
                    addExercise();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();  
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addSteps() {
        System.out.print("Enter number of steps: ");
        int steps = scanner.nextInt();
        user.addSteps(steps);
        System.out.println("Steps added successfully.");
    }

    private void viewStats() {
        System.out.println(user);
    }

    private void addExercise() {
        System.out.print("Enter number of exercises: ");
        int count = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < count; i++) {
            System.out.print("Enter exercise " + (i + 1) + ": ");
            String exercise = scanner.nextLine();
            user.addExercise(exercise);
        }
        System.out.println("Exercises added successfully.");
    }

    public static void main(String[] args) {
        FitnessTracker tracker = new FitnessTracker();
        tracker.startTracking();
    }
}

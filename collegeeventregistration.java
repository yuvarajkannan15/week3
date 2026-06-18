import java.util.HashSet;
import java.util.Scanner;
public class collegeeventregistration {
    public static void main(String[] args) {
        HashSet<String> students = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n---- College Event Registration ---- ");
            System.out.println("1. Register Student");
            System.out.println("2. Display Registered Students");
            System.out.println("3. Check Student Registration");
            System.out.println("4. Remove Registration");
            System.out.println("5. Display Total Participants");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    if (students.add(name)) {
                        System.out.println(name + " registered successfully.");
                    } else {
                        System.out.println("Duplicate registration not allowed!");
                    }
                    break;
                case 2:
                    System.out.println("\nRegistered Students:");
                    if (students.isEmpty()) {
                        System.out.println("No students registered.");
                    } else {
                        for (String student : students) {
                            System.out.println(student);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter student name to check: ");
                    String checkName = sc.nextLine();

                    if (students.contains(checkName)) {
                        System.out.println(checkName + " is registered.");
                    } else {
                        System.out.println(checkName + " is not registered.");
                    }
                    break;
                case 4:
                    System.out.print("Enter student name to remove: ");
                    String removeName = sc.nextLine();
                    if (students.remove(removeName)) {
                        System.out.println(removeName + " registration removed.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 5:
                    System.out.println("Total Participants: " + students.size());
                    break;
                case 6:
                    System.out.println("Exiting program.....");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}

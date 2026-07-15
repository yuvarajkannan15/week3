import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeePromotionAnalysis {

    public static void main(String[] args) {

        // 1. Create ArrayList<Integer>
        ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(
                75, 85, 90, 60, 95, 82, 78, 88, 91, 70
        ));

        // Display all scores
        System.out.println("Employee Performance Scores:");
        System.out.println(scores);

        // 2 & 3. Display employees scoring above 80
        System.out.println("\nEmployees scoring above 80:");
        scores.stream()
                .filter(score -> score > 80)
                .forEach(System.out::println);

        // 4. Count eligible employees
        long count = scores.stream()
                .filter(score -> score > 80)
                .count();

        System.out.println("\nNumber of Eligible Employees: " + count);

        // 5. Display first eligible employee
        scores.stream()
                .filter(score -> score > 80)
                .findFirst()
                .ifPresent(score ->
                        System.out.println("\nFirst Eligible Employee Score: " + score));
        List<Integer> eligibleEmployees = scores.stream()
                .filter(score -> score > 80)
                .collect(Collectors.toList());

        System.out.println("\nEligible Employee Scores:");
        System.out.println(eligibleEmployees);
    }


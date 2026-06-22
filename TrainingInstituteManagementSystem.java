import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
class Course {
    private int courseId;
    private String courseName;
    private String trainerName;
    private double courseFee;
    public Course(int courseId, String courseName, String trainerName, double courseFee) {
        if (courseFee <= 0) {
            throw new IllegalArgumentException("Invalid Course Fee");
        }
        this.courseId = courseId;
        this.courseName = courseName;
        this.trainerName = trainerName;
        this.courseFee = courseFee;
    }
    public int getCourseId() {
        return courseId;
    }
    public void display() {
        System.out.println("Course ID : " + courseId);
        System.out.println("Course Name : " + courseName);
        System.out.println("Trainer Name : " + trainerName);
        System.out.println("Course Fee : " + courseFee);
        System.out.println();
    }
}
public class TrainingInstituteManagementSystem {
    public static void main(String[] args) {
        ArrayList<Course> courseList = new ArrayList<>();
        try {
            courseList.add(new Course(111, "Java", "Yuvaraj", 5000));
            courseList.add(new Course(112, "Python", "Ram", 4500));
            courseList.add(new Course(113, "Spring Boot", "Siva", 6000));
            courseList.add(new Course(114, "Css", "Ravi", 5500));
            courseList.add(new Course(115, "SQL", "Arun", 4000));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("===== ALL COURSES =====");
        for (Course c : courseList) {
            c.display();
        }
        HashMap<Integer, Course> courseMap = new HashMap<>();

        for (Course c : courseList) {
            courseMap.put(c.getCourseId(), c);
        }
        int searchId = 101;
        if (courseMap.containsKey(searchId)) {
            System.out.println("Course Found");
            courseMap.get(searchId).display();
        } else {
            System.out.println("Course Not Found");
        }
        courseMap.remove(115);
        HashSet<String> technologies = new HashSet<>();
        technologies.add("Java");
        technologies.add("Python");
        technologies.add("Java");
        technologies.add("Spring Boot");
        technologies.add("Python");
        technologies.add("Sql");
        System.out.println("Technologies");
        for (String tech : technologies) {
            System.out.print(tech + " ");
        }
        technologies.remove("Python");
        System.out.println("\nTotal Technologies : " + technologies.size());
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(85);
        scores.add(90);
        scores.add(78);
        scores.add(95);
        scores.add(88);
        int total = 0;
        System.out.println("\nStudent Scores");
        for (Integer score : scores) {
            System.out.print(score + " ");
            total += score;
        }
        double average = (double) total / scores.size();
        int highest = Collections.max(scores);
        int lowest = Collections.min(scores);
        System.out.println("\nTotal Score : " + total);
        System.out.println("Average Score : " + average);
        System.out.println("Highest Score : " + highest);
        System.out.println("Lowest Score : " + lowest);
        try {
            Course invalidCourse = new Course(116, "Advanced Java", "Suresh", -2000);
        } catch (IllegalArgumentException e) {
            System.out.println("\n" + e.getMessage());
        }
    }
}
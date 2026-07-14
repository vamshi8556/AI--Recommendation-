import java.util.*;

public class RecommendationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your interest:");
        String interest = sc.nextLine().toLowerCase();

        Map<String, List<String>> map = new HashMap<>();

        map.put("java", Arrays.asList("Spring Boot", "Hibernate", "Microservices"));
        map.put("python", Arrays.asList("Django", "Flask", "Machine Learning"));
        map.put("ai", Arrays.asList("TensorFlow", "OpenCV", "Deep Learning"));
        map.put("web", Arrays.asList("HTML", "CSS", "JavaScript"));

        if (map.containsKey(interest)) {
            System.out.println("Recommended Technologies:");
            for (String s : map.get(interest)) {
                System.out.println(s);
            }
        } else {
            System.out.println("No recommendations available.");
        }

        sc.close();
    }
}

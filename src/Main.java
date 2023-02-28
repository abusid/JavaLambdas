import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Print only odd numbers
        List<Integer> numbers = List.of(1,4,5,8,10,22,45);
        numbers.stream()
                .filter(number -> number%2 != 0 )
                .map(number -> number.toString().concat(", "))
                .forEach(System.out::print);

        System.out.println();
        System.out.println(numbers.stream().reduce(0, (x , y) -> x + y));

        //print all courses
        System.out.println();
        List<String> course = List.of("Spring AWS", "Spring boot", "Spring Cloud", "JPA", "Hibernate", "Docker", "AWS");
        course.stream()
                .map(courses -> courses.concat(", "))
                .forEach(System.out::print);

        //print only spring courses
        System.out.println();
        List<String> spring = course.stream()
                .filter(courses -> courses.contains("Spring"))
                .map(courses -> courses.concat(", "))
                .collect(Collectors.toList());

        String replace = spring.get(spring.toArray().length - 1).replace(", ", "");
        spring.remove(spring.size()-1);
        spring.add(replace);
        spring.stream().forEach(System.out::print);


        //print only spring courses
        System.out.println();
        course.stream()
                .filter(courses -> courses.length()<=4)
                .map(courses -> courses.concat(", "))
                .forEach(System.out::print);

    }
}
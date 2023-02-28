import java.util.*;

public class CompareObjects {

    public static void main(String... args){
        Employee emp = new Employee("Abu", 31, 101);
        Employee emp2 = new Employee("Asma", 27, 102);
        Employee emp3 = new Employee("Saleem", 29, 103);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp);
        employeeList.add(emp2);
        employeeList.add(emp3);


// age sorter
        employeeList.stream()
                .sorted((em, em2) -> {
                    if(em2.getAge()== em.getAge())
                        return 0;
                    if(em2.getAge() > em.getAge())
                        return 1;
                    else
                        return -1;
                })
                .forEach(System.out::println);

        // name sorter
        employeeList.stream()
                .sorted((em, em2) -> em2.getName().compareTo(em.getName()))
                .forEach(System.out::println);


    }
}

class Employee {
    String name;
    int age;
    int id;


    public Employee(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", id=" + id +
                '}';
    }
}



import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SampleTestApp {
    public static void test(){
        Employee employee1 = new Employee(15,"sravani",50000D);
        Employee employee2 = new Employee(13,"vani",80000D);
        Employee employee3 = new Employee(12,"sani",40000D);
        List<Employee> employees = Arrays.asList(employee1,employee2,employee3);
        employees.stream().filter(employee->employee.geteName().startsWith("s")).forEach(System.out::println);
       employees.stream().sorted(Comparator.comparingDouble(Employee::geteSal).reversed()).forEach(System.out::println);

        List<Integer> nums = Arrays.asList(5,14,3,1,7,9,3,2,8,11);
        //Collections.sort(nums);
        System.out.println(nums);
     //   nums.stream().sorted(Comparator.comparingInt(nums)).collect(Collectors.toSet());
        System.out.println(nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toSet()));
        System.out.println(nums.stream().sorted().collect(Collectors.toSet()));
        // System.out.println(nums.stream().filter(n->n%2==0).sorted().collect(Collectors.toSet()));
       /* System.out.println(nums.stream().map(n->{int res=n * n ;
        return res;}).
                collect(Collectors.toList()));*/
        /*for(int n:nums){
            System.out.println("double the number  "+ n*n);
        }*/

    }
    public static void main(String[] args) {
        System.out.println("hello");
        test();
    }
}

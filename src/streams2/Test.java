package streams2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
  public static void main(String[] args) {

    List<Customer> customers = new ArrayList<>();
    customers.add(new Customer(1, "Jan", "Kowalski", 1234.00));
    customers.add(new Customer(2, "Maria", "Jan", 2222.00));
    customers.add(new Customer(3, "Stefan", "Oko", 3333.00));
    customers.add(new Customer(4, "Adam", "Nowak", 1000.00));
    customers.add(new Customer(5, "Joanna", "Lipnicka", 2000.00));
    customers.add(new Customer(6, "Adaś", "Miauczyński", 5000.00));
    customers.add(new Customer(7, "Jan", "Drzewo", 12000.00));

    //    Map<String, List<Customer>> customersByCity =
    //        customers.stream().collect(Collectors.groupingBy(Customer::getCity));
    //
    //    List<Customer> customersFromWroclaw = customersByCity.get("Wrocław");
    //    customersFromWroclaw.forEach(System.out::println);

    //    customers.forEach(System.out::println);

    //      List<Double> salaries = customers.stream().map(Customer::getSalary).filter(s -> s >
    // 3000.00).collect(Collectors.toList());
    //      salaries.forEach(System.out::println);

    //    Optional<Double> first =
    //        customers.stream().map(Customer::getSalary).filter(s -> s > 2000.00).findFirst();
    //    first.ifPresentOrElse(System.out::println, () -> System.out.println("nie ma"));

    //      Double[] doubles = customers.stream().map(Customer::getSalary).filter(s -> s >
    //              3000.00).toArray(Double[]::new);
    //      for(Double current : doubles){
    //      System.out.println(current);
    //      }

    //    long count =
    //        customers.stream().filter(c -> c.getSalary() >=
    // 3000).peek(System.out::println).count();
    //    System.out.println(count);

    //    customers.stream().skip(2).limit(2).forEach(System.out::println);

    //    customers.stream()
    //        .sorted((el1, el2) -> el1.getFirstName().compareTo(el2.getFirstName()))
    //        .forEach(System.out::println);

    //    System.out.println(customers.stream().min(Comparator.comparing(Customer::getSalary)));
    //    System.out.println(customers.stream().max(Comparator.comparing(Customer::getSalary)));

    //    List<Integer> allEven = Arrays.asList(2, 4, 6, 8, 10);
    //    List<Integer> oneEven = Arrays.asList(2, 5, 7, 9, 11);
    //
    //    System.out.println(allEven.stream().allMatch(s -> s % 2 == 0));
    //    System.out.println(oneEven.stream().allMatch(s -> s % 2 == 0));


      IntStream.range(1, 100).forEach(System.out::println);



  }
}

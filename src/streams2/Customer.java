package streams2;

class Customer {
  private int id;
  private String firstName;
  private String lastName;
  private double salary;

  public Customer(int id, String firstName, String lastName, double salary) {

    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public double getSalary() {
    return salary;
  }

  @Override
  public String toString() {
    return "{" + id + " " + firstName + " " + lastName + " " + salary + "}";
  }
}

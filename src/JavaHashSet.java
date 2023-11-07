import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Customer {
    private long id;
    private String name;

    public Customer(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;
        return id == customer.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
         return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class JavaHashSet {
    public static void main(String[] args) {
        Set<Customer> customers = new HashSet<>();
        
        customers.add(new Customer(101, "Rajeev"));
        customers.add(new Customer(102, "Sachin"));
        customers.add(new Customer(103, "Chris"));

        customers.add(new Customer(104, "Rajeev"));

        System.out.println(customers);
      
    }
}

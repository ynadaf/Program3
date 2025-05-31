public class Employee {
    String name;
    int id;
    double salary;
    int phone;
    String department;
    String designation;
    String email;
    String address;

    public Employee(String name, int id, double salary, int phone, String department, String designation, String email, String address) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.phone = phone;
        this.department = department;
        this.designation = designation;
        this.email = email;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("Phone Number: " + phone);
        System.out.println("Department: " + department);
        System.out.println("Designation: " + designation);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        // Creating an employee object with extended details
        Employee emp1 = new Employee(
            "Saniya", 
            101, 
            50000.0, 
            891766353, 
            "IT", 
            "Software Engineer", 
            "saniya@example.com", 
            "123 Main Street, Bangalore"
        );

        emp1.displayInfo();
    }
}

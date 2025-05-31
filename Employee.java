public class Employee {
String name;
int id;
double salary;
int phone;
public Employee(String name,int id,double salary,int phone){
    this.name = name;
    this.id = id;
    this.salary = salary;
    this.phone = phone;
}
public void displayInfo(){
    System.out.println("Employee ID:"+id);
    System.out.println("Employee Name:"+name);
    System.out.println("Salary:$"+salary);
    System.out.println("Phone Number:"+phone);
}
public static void main(String[] args) {
    //creating an object of employee
    Employee emp1 = new Employee("saniya",101,50000.0,891766353);
    emp1.displayInfo();
}
}


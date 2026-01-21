package core.java.classAndObjects;

class Employee{
    private String name;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if(salary > 0){
            this.salary = salary;
        }else{
            System.out.println("Salary is negative please pass positive salary!");
        }

    }

}
public class EncapsulationDemo {
    public static void main ( String[] args ) {
        Employee emp = new Employee();
        emp.setName("Roshan");
        emp.setSalary(-50);

        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
    }
}

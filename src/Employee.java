public class Employee {
    private String fullName;
    private short department;
    private int id;
    private int salary;

    public static int count = 0;

    public Employee(String fullName, short department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.id = count + 1;
        this.salary = salary;
        count++;
    }

    public String getFullName() {

        return fullName;
    }

    public short getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(short department) {

        this.department = department;
    }

    public void setSalary(int salary) {

        this.salary = salary;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        if (employee.salary == salary) {
            return true;
        }
        return false;

    }


    @Override
    public String toString() {
        return "Ф.И.О - " + fullName + ", отдел - " + department + ", зарплата - " + salary;
    }

    public String printShortInfo() {
        return "Ф.И.О - " + fullName + ", зарплата - " + salary;
    }


}

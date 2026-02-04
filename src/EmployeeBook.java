import java.util.Arrays;

public class EmployeeBook {

    private Employee[] employees;

    public EmployeeBook() {
        this.employees = new Employee[10];

    }

//    Получить список всех сотрудников со всеми данными о них, вывести в консоль значения всех полей, кроме
//    Null. Использовать for each и toString

    public void getAllEmployers() {
        for (Employee emp : employees) {
            if (emp != null) {
                System.out.println(emp.toString());
            }
        }
    }

    public float getAverageSalary() {
        int count = 0;
        int totalSalary = 0;
        for (Employee emp : employees) {
            if (emp == null) {
                break;
            } else {
                count++;
                totalSalary += emp.getSalary();
            }
        }
        if (count == 0) {
            return 0f;
        }
        return (float) (totalSalary / count);

    }

    public float[] getTax(String typeTax) {
        float[] taxes = new float[employees.length];
        int i = 0;
        for (Employee emp : employees) {
            if (i == 10 || emp == null) {
                break;
            }
            switch (typeTax) {
                case "PROPORTIONAL":
                    taxes[i] = emp.getSalary() * 0.13f;
                    i++;
                    break;
                case "PROGRESSIVE":
                    if (emp.getSalary() < 150000) {
                        taxes[i] = emp.getSalary() * 0.13f;
                        i++;
                    } else if (emp.getSalary() < 350000) {
                        taxes[i] = emp.getSalary() * 0.17f;
                        i++;
                        break;
                    } else {
                        taxes[i] = emp.getSalary() * 0.21f;
                        i++;
                        break;
                    }
            }

        }
        return taxes;
    }


    public void setIndexation(short department, float procent) {
        for (Employee emp : employees) {

            if (emp.getDepartment() != department) {
                continue;
            } else {
                System.out.println(emp.getSalary());
                float index = emp.getSalary() * (1 + procent / 100);
                emp.setSalary((int) index);
                System.out.println(emp.getSalary());
            }
        }
    }

    public void printBiggestSalary(short department, int salary) {

        for (int j = 0; j < employees.length; j++) {
            if (employees[j] == null) {
                break;
            }
            if (employees[j].getDepartment() == department && employees[j].getSalary() > salary) {
                System.out.println(employees[j].printShortInfo() + " порядковый номер - " + j);
                break;
            }
        }
    }

    public void printSmalestSalary(int wage, int employeeNumber) {
        int i = 0;
        int a = 0;
        while (a < employeeNumber || i < employees.length) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].getSalary() < wage) {
                System.out.println(employees[i].printShortInfo());
                a++;
                i++;
            } else {
                i++;
            }
        }

    }

    public boolean isInMassive(Employee emp) {
        for (Employee employee : employees) {
            if (emp != null) {
                return emp.equals(employee);

            }
        }
        return false;
    }

    public boolean addIfEmpty(Employee newEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                return true;
            }
        }
        return false;
    }


    public void printById(int id) {
        for (Employee emp : employees) {
            if (id == emp.getId()) {
                System.out.println(emp.toString());
            }
        }
    }
}




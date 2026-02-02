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
            } else break;
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
        return totalSalary / count;

    }

    public void getTax(String typeTax) {
       float [] taxes = new float[employees.length];
        int i = 0;
        for (Employee emp : employees) {
            if (i == 10) {
                break;
            }
            switch (typeTax) {
                case "PROPORTIONAL":
                    taxes[i] = emp.getSalary() * 0.13f;
                    i++;
                case "PROGRESSIVE":
                    if (emp.getSalary() < 150000) {
                        taxes[i] = emp.getSalary() * 0.13f;
                        i++;
                    } else if (emp.getSalary() < 350000) {
                        taxes[i] = emp.getSalary() * 0.17f;
                        i++;
                    } else {
                        taxes[i] = emp.getSalary() * 0.21f;
                        i++;
                    }
            }

        }
        System.out.println(Arrays.toString(taxes));
    }


    public void setIndexation(short department) {
        for (Employee emp : employees) {

            if (emp.getDepartment() != department) {
                continue;
            } else {
                System.out.println(emp.getSalary());
                float index = emp.getSalary() * (1 + ((float) department) / 100);
                emp.setSalary((int) index);
                System.out.println(emp.getSalary());
            }
        }
    }

    public void printBiggestSalary(short department, int salary) {
        int i = 0;
        for (Employee emp : employees) {
            if (emp.getDepartment() == department && emp.getSalary() > salary) {
                i++;
                System.out.println(emp.printShortInfo() + " поряжклвый номер - " + i);
                break;

            }
            i++;
        }

    }

    public void printSmalestSalary(int wage, int employeeNumber) {
        int i = 0;
        int a = 0;
        while (true) {
            if (a == employeeNumber) {
                break;
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
            if (emp.equals(employee)) {
                return true;
            }
        }
        return false;
    }

    public boolean addIfEmpty(Employee newEmployee) {
        int i = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                employees[i] = newEmployee;
                return true;
            } else {
                i++;
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





void main() {

//    Проинициализируйте в main объект класса EmployeeBook и наполните его через метод добавления
//    нового сотрудника — вызовите метод 11 раз, выведите результат исполнения метода на экран.
    EmployeeBook book = new EmployeeBook();
    Employee employee1 = new Employee("Васильев Васильевич Васильев", (short) 1, 500000);
    Employee employee2 = new Employee("Александров Александр Александрович", (short) 2, 75000);
    Employee employee3 = new Employee("Иванов Иван Иванович", (short) 3, 75000);
    Employee employee4 = new Employee("Дмитриев Дмитрий Дмитриевич", (short) 4, 400000);
    Employee employee5 = new Employee("Фиов Фио Фиович", (short) 5, 30000);
    Employee employee6 = new Employee("Алеев Алексей Алексеевич", (short) 1, 100000);
    Employee employee7 = new Employee("Андреев Андрей Андреевич", (short) 2, 90000);
    Employee employee8 = new Employee("Амиров Амир Амирович", (short) 3, 15000);
    Employee employee9 = new Employee("Сотрудников Сотрудник Сотрудничеевич", (short) 5, 50500);
    Employee employee10 = new Employee("Фантазеров Конец Полнеевич", (short) 4, 45000);
    Employee employee11 = new Employee("Последний Сотрудник Чеевич", (short) 2, 105000);
    Employee[] empArray = new Employee[]{employee1, employee2, employee3, employee4, employee5, employee6, employee7, employee8, employee9, employee10, employee11};

    for (int i = 0; i < 11; i++) {
        book.addIfEmpty(empArray[i]);
        //System.out.println(empArray[i].toString());
    }
    // Проверка Получить список всех сотрудников со всеми данными о них, вывести в консоль значения всех полей, кроме Null
    book.getAllEmployers();


    // Проверка переопределения метода toString и короткого  представления printShortinfo

    System.out.println(employee3);
    System.out.println(employee3.printShortInfo());

    // Проверка Подсчитать среднее значение зарплат.

    System.out.println(book.getAverageSalary());

    // Проверка Вывести значения налогов.

    book.getTax("PROGRESSIVE");
    book.getTax("PROPORTIONAL");



    // проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра

    book.setIndexation((short) 5);

    // Получить в качестве параметра номер отдела (1–5) и цифру зарплаты и вывести первого сотрудника этого отдела с зарплатой больше указанной вместе с порядковым номером в списке.

    book.printBiggestSalary((short) 2, 80000);

    //Получить в качестве параметра цифру зарплаты wage и число сотруднико employeeNumber и вывести первые employeeNumber сотрудников с зарплатой меньше wage.

    book.printSmalestSalary(60000, 2);

    // Получить в качестве параметра объект сотрудника и вернуть
    //boolean
    //, есть ли такой сотрудник в массиве с точки зрения бухгалтерского учета (по зарплате) или нет.


    System.out.println(book.isInMassive(employee1));
    System.out.println(book.isInMassive(employee11));


    //Добавьте метод для получения сотрудника по
    //id

    book.printById(7);


}

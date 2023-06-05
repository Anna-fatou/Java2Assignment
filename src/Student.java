class Student {
    String studentName;
    double hourly_wage;
    double hours_work;

    Double amount;

    Paycheck paycheck;

    Student(String studentName, double hourly_wage, double hours_worked) {
        this.hourly_wage = hourly_wage;
        this.hours_work = hours_worked;
        this.studentName = studentName;
        paycheck = new Paycheck(hourly_wage, hours_work, studentName);
    }

    void printPaycheck() {
        paycheck.printResults();
    }
}

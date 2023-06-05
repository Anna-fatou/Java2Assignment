class Paycheck {
    double hourly_wage;
    double hours_worked;
    double wage;
    double wage_after_tax;
    String studentName;
    double ss_tax = 2.5;
    double federal_tax = 3.5;

    Paycheck(double hourly_wage, double hours_worked, String studentName) {
        this.hours_worked = hours_worked;
        this.hourly_wage = hourly_wage;
        this.wage = this.calculatePaycheck();
        this.wage_after_tax = this.wage - (this.calculateFederalTax() + this.calculateSocialSecurityTax());
        this.studentName = studentName;
    }

    double calculatePaycheck() {
        return hours_worked * hourly_wage;
    }

    //    calculates the tax of this paycheck object
    double calculateFederalTax() {
        double paycheck = calculatePaycheck();
       return  (paycheck / 100) * federal_tax; // 5% federal
    }

    double calculateSocialSecurityTax() {
        double paycheck = calculatePaycheck();
        return (paycheck / 100) * ss_tax; // 7% social security tax
    }

    void printResults() {
        System.out.println("---------------------------------------------------------");
        System.out.println("-----------------------Paycheck For " + studentName + "--------------------");
        System.out.println("Student Fullname: " + studentName);
        System.out.println("Hourly Wage: " + hourly_wage);
        System.out.println("Hours Worked: " + hours_worked);
        System.out.println("Federal Tax: " + federal_tax);
        System.out.println("Social Security Tax: " + ss_tax);
        System.out.println("TOTAL wage before tax: " + wage);
        System.out.println("TOTAL wage after Tax: " + wage_after_tax);
        System.out.println("---------------------------------------------------------");
    }
}

import by.gsu.pms.conventer;
import by.gsu.pms.employee;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee[] employees = {
                new employee("Nikita", 11, 12),
                new employee("Stanislav", 20, 30),
                null,
                new employee("Zhenya", 15, 10),
                new employee("Boris", 7, 15),
                new employee("Alexandr", 8, 2),
                new employee()
        };
        for (employee emp: employees) {
            if(emp != null){
                System.out.println(emp.show());
            }

	   }
        employees[employees.length - 1].setExpenses(5);
    	
        System.out.println("Duration = " + employees[1].getDay() * 2);

        for (employee emp: employees) {
            if(emp != null){
                System.out.println(emp.toString());
            }
        }

        int summ = 0;
        for (employee emp: employees) {
            if(emp != null){
                summ += emp.getExpenses();
            }
        }
        System.out.println("Sum of total expenses = " + summ);

        int maxExpenses = 0;
        employee employeeWithMaxExpenses = new employee();
        for (employee emp: employees) {
            if(emp != null){
                if(emp.getExpenses() > maxExpenses){
                    employeeWithMaxExpenses = emp;
                    maxExpenses = emp.getExpenses();
                }
            }
        }
        System.out.println("Name " + employeeWithMaxExpenses.getAccount());

    }

}

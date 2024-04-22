/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class BT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Employee> listEmployee = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Employee Employee = new Employee(i + 1, "Kien", 24, "aaa", "5555", "5555");
            listEmployee.add(Employee);
            System.out.println(Employee.toString());
        }
        Employee newEmployee = new Employee();
        newEmployee.setId(listEmployee.size() + 1);
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Add new Employee: ");
        System.out.print("Name: ");
        newEmployee.setName(Scanner.nextLine());
        System.out.print("Age: ");
        newEmployee.setAge(Scanner.nextInt());
        System.out.print("Department");
        Scanner.nextLine();
        newEmployee.setDepartment(Scanner.nextLine());
        System.out.println("Code");
        newEmployee.setCode(Scanner.nextLine());
        System.out.println("Salary Rate");
        newEmployee.setSalaryRate(Scanner.nextLine());
        listEmployee.add(newEmployee);
        for (Employee employee : listEmployee) {
            System.out.println(employee.toString());
        }
        System.out.println("Delete Employee");
        System.out.println("Name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Iterator<Employee> iterator = listEmployee.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getName().equals(name)) {
                iterator.remove();
                System.out.println("Employee " + name + " has been removed.");
            }
        }
        for (Employee employee : listEmployee) {
            System.out.println(employee.toString());
        }
    }

}

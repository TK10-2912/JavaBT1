/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt1;

/**
 *
 * @author ASUS
 */
public class Employee {

    private int Id;
    private String Name;
    private int Age;
    private String Department;
    private String Code;
    private String SalaryRate;	

    public Employee() {
    }

    public Employee(int Id, String Name, int Age, String Department, String Code, String SalaryRate) {
        this.Id = Id;
        this.Name = Name;
        this.Age = Age;
        this.Department = Department;
        this.Code = Code;
        this.SalaryRate = SalaryRate;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getSalaryRate() {
        return SalaryRate;
    }

    public void setSalaryRate(String SalaryRate) {
        this.SalaryRate = SalaryRate;
    }

    @Override
    public String toString() {
        return "Employee{" + "Id=" + Id + ", Name=" + Name + ", Age=" + Age + ", Department=" + Department + ", Code=" + Code + ", SalaryRate=" + SalaryRate + '}';
    }
    

}

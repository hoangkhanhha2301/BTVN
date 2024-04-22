import java.util.Scanner;

public class Employee{
    private int id;
    private String name;
    private int age;
    private String department;
    private String code;
    private double salary;
    public Nhanvien(){}

    public Nhanvien(int id, String name, int age, String department, String code, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.code = code;
        this.salary = salary;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDepartment() {
        return this.department;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getCode() {
        return this.ode;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return this.salary;
    }

    //Nhap tt tu ban phim
    public void display(){
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("New id: ");
        setId(scanner.nextInt());
        System.out.println("New name: ");
        setName(scanner.nextString());
        System.out.println("New age: ");
        setAge(scanner.nextInt());
        System.out.println("New department: ");
        setDepartment(scanner.nextString());
        System.out.println("New code: ");
        setCode(scanner.nextString());
        System.out.println("New salary: ");
        setSalary(scanner.nextDouble());
    }

    //Xuat tt ra man hinh
    public void output(){
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Department: " + getDepartment());
        System.out.println("Code: " + getCode());
        System.out.println("Salary: " + getSalary());
    }
}
public class Employee
{
    private String Name;
    private String JobTitle;
    private double Salary;

    //Constructor for Employee
    //throws IllegalArgumentException if name or jobTitle is null, or salary is negative
    public Employee(String name, String jobTitle, double salary) {
        if (name == null || name.isEmpty() || jobTitle == null || jobTitle.isEmpty()) {
            throw new IllegalArgumentException("Name and Job Title cannot be null or empty");
        }
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        Name = name;
        JobTitle = jobTitle;
        Salary = salary;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getJobTitle() {
        return this.JobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.JobTitle = jobTitle;
    }

    public double getSalary() {
        return this.Salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.Salary = salary;
    }

    //Introduces the employee
    public String introduce()
    {
        return "Hi! My name is " + getName() + " and I work as a " + getJobTitle() + '.';
    }

    //Gives a raise to the employee by a percentage
    public void giveRaise(double percentage)
    {
        if (percentage < 0.0) {
            throw new IllegalArgumentException("Percentage cannot be negative");
        }
        this.Salary += (this.Salary * (percentage / 100));
    }

    @Override
    public String toString() {
        return "Employee{Name='" + Name + "', JobTitle='" + JobTitle + "', Salary=" + Salary + "}";
    }
}

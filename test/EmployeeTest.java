import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    private Employee employee;

    @BeforeEach
    void setUp() {
        employee = new Employee("Otto","Programmer", 4000.0);
    }

    @AfterEach
    void tearDown() {
        employee = null;
    }

    @Test
    void constructor_invalidSalary() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> {Employee employee1 = new Employee("Dave","Architect", -4000.0);});
        assertEquals("Salary cannot be negative", e.getMessage());
    }

    @Test
    void introduce() {
        assertEquals("Hi! My name is Otto and I work as a Programmer.", employee.introduce());
    }

    @Test
    void giveRaise() {
        employee.giveRaise(0);
        assertEquals(4000, employee.getSalary());
        employee.giveRaise(20);
        assertEquals(4800,employee.getSalary());
    }

    @Test
    void giveRaisePercentage_invalid() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> {employee.giveRaise(-20);});
        assertEquals("Percentage cannot be negative", e.getMessage());
    }
}
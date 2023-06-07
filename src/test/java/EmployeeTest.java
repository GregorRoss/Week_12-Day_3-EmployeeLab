import main.management.Director;
import main.management.Manager;
import main.techStaff.DatabaseAdmin;
import main.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Manager manager;
    Developer developer;
    DatabaseAdmin databaseAdmin;
    Director director;

    @Before
    public void before(){
        manager = new Manager("Fred", 1234,20000,"Finance");
        developer = new Developer("Wilma", 1234,10000);
        databaseAdmin = new DatabaseAdmin("Stanley", 1234,10000);
        director = new Director("Barney", 1432, 100000, "Finance", 5000000);
    }

    @Test
    public void managerCanIncreaseSalary(){
        manager.raiseSalary(2000);
        assertEquals(22000,manager.getSalary(),0.0);
    }

    @Test
    public void managerCanGetPayBonus(){
        assertEquals(200, manager.payBonus(),0.0);
    }

    @Test
    public void developerCanIncreaseSalary(){
        developer.raiseSalary(1000);
        assertEquals(11000,developer.getSalary(),0.0);
    }

    @Test
    public void developerCanGetPayBonus(){
        assertEquals(100, developer.payBonus(),0.0);
    }

    @Test
    public void databaseAdminCanIncreaseSalary(){
        databaseAdmin.raiseSalary(1000);
        assertEquals(11000,databaseAdmin.getSalary(),0.0);
    }

    @Test
    public void databaseAdminCanGetPayBonus(){
        assertEquals(100, databaseAdmin.payBonus(),0.0);
    }

    @Test
    public void directorCanIncreaseSalary(){
        director.raiseSalary(10000);
        assertEquals(110000,director.getSalary(),0.0);
    }

    @Test
    public void directorCanGetPayBonus(){
        assertEquals(2000, director.payBonus(),0.0);
    }

    @Test
    public void directorFailNegativeIncrease(){
        director.raiseSalary(-1000);
        assertEquals(100000,director.getSalary(),0.0);
    }

    @Test
    public void directorFailNullnameValue(){
        director.setName("");
        assertEquals("Barney",director.getName());
    }
    @Test
    public void directorChangeName(){
        director.setName("Steve");
        assertEquals("Steve",director.getName());
    }


}

package ariefbelajarteknologi.spring.creational.prototype;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class PrototypeApplication {

    @Bean
    @Scope("prototype")
    public Employee employeeStaff(){
        Employee staff = new Employee();
        staff.setPosition(Position.STAFF);
        staff.setSalary(10_000_000L);
        return staff;
    }

    @Bean
    @Scope("prototype")
    public Employee employeeManager(){
        Employee manager = new Employee();
        manager.setPosition(Position.MANAGER);
        manager.setSalary(20_000_000L);
        return manager;
    }

    @Bean
    @Scope("prototype")
    public Employee employeeVicePresident(){
        Employee vicePresident = new Employee();
        vicePresident.setPosition(Position.VICE_PRESIDENT);
        vicePresident.setSalary(30_000_000L);
        return vicePresident;
    }

    @Bean
    @Scope("prototype")
    public Employee employeeCLEVEL(){
        Employee cLevel = new Employee();
        cLevel.setPosition(Position.C_LEVEL);
        cLevel.setSalary(40_000_000L);
        return cLevel;
    }
}

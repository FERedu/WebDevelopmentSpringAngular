package hr.eestec.feredu.crm.controllers;

import hr.eestec.feredu.crm.models.Employee;
import hr.eestec.feredu.crm.services.DatabaseService;
import hr.eestec.feredu.crm.services.InMemoryDatabaseService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    private DatabaseService databaseService =
            new InMemoryDatabaseService();

    @PostMapping("/employees")
    public void createNewEmployee(@RequestBody Employee employee) {
        databaseService.createNewEmployee(employee);
    }

    @GetMapping("/employees/{oib}")
    public Employee getEmployee(@PathVariable String oib) {
        return databaseService.getEmployeeByOib(oib);
    }

    @DeleteMapping("/employees/{oib}")
    public boolean deleteEmployee(@PathVariable String oib) {
        databaseService.deleteEmployee(oib);
        return true;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return databaseService.getAllEmployees();
    }

}

package hr.eestec.feredu.crm.services;

import hr.eestec.feredu.crm.models.Employee;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
public class InMemoryDatabaseService implements DatabaseService {

    private List<Employee> employees = new LinkedList<>();

    @Override
    public Employee createNewEmployee(Employee employee) {
        employees.add(employee);
        return employee;
    }

    @Override
    public Employee getEmployeeByOib(String oib) {
        if (oib == null) {
            throw new IllegalArgumentException("Parameter cannot be null");
        }

        Optional<Employee> employeeOptional = employees.stream()
                .filter(e -> oib.equals(e.getOib()))
                .findAny();

        return employeeOptional.orElse(null);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @Override
    public void deleteEmployee(String oib) {
        Employee employee = getEmployeeByOib(oib);
        employees.remove(employee);
    }

}

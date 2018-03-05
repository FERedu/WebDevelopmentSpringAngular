package hr.eestec.feredu.crm.services;

import hr.eestec.feredu.crm.models.Employee;

import java.util.List;

public interface DatabaseService {

    Employee createNewEmployee(Employee employee);

    Employee getEmployeeByOib(String oib);

    List<Employee> getAllEmployees();

    void deleteEmployee(String oib);

}

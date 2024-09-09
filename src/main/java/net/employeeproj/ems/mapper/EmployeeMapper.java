package net.employeeproj.ems.mapper;

import net.employeeproj.ems.dto.EmployeeDto;
import net.employeeproj.ems.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

//    public static Employee mapToEmployee(EmployeeDto employeeDto){
//        return new Employee(
//                employeeDto.getId(),
//                employeeDto.getFirstName(),
//                employeeDto.getLastName(),
//                employeeDto.getEmail()
//        );
//    }


    public static Employee mapToEmployee(EmployeeDto employeeDto){
        // Handle null id scenario
        Long id = (employeeDto.getId() != null) ? employeeDto.getId() : 0L;
        return new Employee(
                id,
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }



}

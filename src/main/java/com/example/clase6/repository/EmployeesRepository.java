package com.example.clase6.repository;

import com.example.clase6.Dto.EmployeeDepartmentDto;
import com.example.clase6.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees,Integer> {

    @Query(nativeQuery = true, value = "SELECT e.employee_id  ,e.first_name, e.last_name, j.job_title, e.salary FROM hr.employees e inner join jobs j on e.job_id = j.job_id where department_id = ?1")
    List<EmployeeDepartmentDto> listarEmpleadoDepartamento(int idDepartment);




}

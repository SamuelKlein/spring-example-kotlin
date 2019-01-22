package br.example.Example.mvc.repository

import br.example.Example.mvc.entity.Employee
import org.springframework.data.jpa.repository.JpaRepository

interface EmployeeRepository : JpaRepository<Employee, Long> {

}

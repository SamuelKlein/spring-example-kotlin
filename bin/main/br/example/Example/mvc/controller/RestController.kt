package br.example.Example.mvc.controller

import br.example.Example.mvc.entity.Employee
import br.example.Example.mvc.repository.EmployeeRepository
import org.springframework.web.bind.annotation.*


@RestController
class EmployeeController(private val repository: EmployeeRepository) {

    @GetMapping("/employees")
    fun all(): List<Employee> {
        return repository.findAll()
    }

    @PostMapping("/employees")
    fun newEmployee(@RequestBody newEmployee: Employee): Employee {
        return repository.save(newEmployee)
    }

    @GetMapping("/employees/{id}")
    fun one(@PathVariable id: Long?): Employee {
        return repository.findById(id!!)
                .orElseThrow { Exception("" + id) }
    }

    @PutMapping("/employees/{id}")
    fun replaceEmployee(@RequestBody newEmployee: Employee, @PathVariable id: Long?): Employee {

        return repository.findById(id!!)
                .map { employee ->
                    employee.name = newEmployee.name
                    employee.role = newEmployee.role
                    repository.save(employee)
                }
                .orElseGet {
                    newEmployee.id = id
                    repository.save(newEmployee)
                }
    }

    @DeleteMapping("/employees/{id}")
    fun deleteEmployee(@PathVariable id: Long?) {
        repository.deleteById(id!!)
    }
}
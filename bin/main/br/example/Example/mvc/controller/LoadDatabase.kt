package br.example.Example.mvc.controller

import br.example.Example.mvc.entity.Employee
import br.example.Example.mvc.repository.EmployeeRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class LoadDatabase {
    @Bean
    fun initDatabase(repository: EmployeeRepository): CommandLineRunner {
        return CommandLineRunner { args ->
            run {
                print("LoadDatabase....")
                     repository.save(Employee(name = "Bilbo Baggins", role = "burglar"))
                repository.save(Employee(name = "Frodo Baggins", role = "thief"))
            }
        }
    }
}

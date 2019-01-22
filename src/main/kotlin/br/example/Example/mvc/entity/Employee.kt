package br.example.Example.mvc.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Employee (@Id
                     @GeneratedValue
                     var  id: Long? = null,
                     var name: String? = null,
                     var role: String? = null){
}

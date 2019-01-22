package br.example.Example.mvc.entity

import javax.persistence.*

@Entity
class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null

    @Column(name = "titulo", nullable = false)
    var titulo: String? = null

    @Column(name = "isbn", nullable = false, unique = true)
    var isbn: String? = null

    @Column(name = "autor", nullable = false)
    var autor: String? = null

    @Column(name = "description", nullable = true)
    var description: String? = null

}

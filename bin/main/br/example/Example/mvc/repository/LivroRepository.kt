package br.example.Example.mvc.repository

import br.example.Example.mvc.entity.Livro
import org.springframework.data.jpa.repository.JpaRepository

interface LivroRepository : JpaRepository<Livro, Long> {

    fun findByAutor(autor: String): List<Livro>

    fun findByTitulo(titulo: String): List<Livro>

    fun findByIsbn(isbn: String): Livro

}

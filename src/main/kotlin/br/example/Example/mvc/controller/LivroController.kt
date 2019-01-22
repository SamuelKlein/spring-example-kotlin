package br.example.Example.mvc.controller

import br.example.Example.mvc.entity.Livro
import br.example.Example.mvc.repository.LivroRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
@RequestMapping("/livros")
class LivroController @Autowired
constructor(private val livroRepository: LivroRepository) {

    @RequestMapping(value = ["/{autor}"], method = arrayOf(RequestMethod.GET))
    fun listaLivros(@PathVariable("autor") autor: String, model: Model): String {
        val listaLivros = livroRepository.findByAutor(autor)
        model.addAttribute("livros", listaLivros)
        return "listaLivros"
    }

    @RequestMapping(value = ["/{autor}"], method = arrayOf(RequestMethod.POST))
    fun adicionaLivroAutor(@PathVariable("autor") autor: String, livro: Livro): String {
        livro.autor = autor
        livroRepository.save(livro)
        return "redirect:/livros/{autor}"
    }
}


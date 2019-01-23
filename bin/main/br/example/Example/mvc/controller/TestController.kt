package br.example.Example

import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class TestController {
    @GetMapping("/")
    fun home(): String {
        return "Spring boot is working!"
    }
}

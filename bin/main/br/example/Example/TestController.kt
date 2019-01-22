package br.example.Example

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {
    @RequestMapping("/teste")
    fun home(): String {
        return "Spring boot is working!"
    }
}

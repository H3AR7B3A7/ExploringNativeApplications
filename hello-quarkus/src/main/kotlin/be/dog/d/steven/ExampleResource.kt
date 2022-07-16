package be.dog.d.steven

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
class ExampleResource {

    @GetMapping
    fun hello() = "Hello Quarkus!"
}
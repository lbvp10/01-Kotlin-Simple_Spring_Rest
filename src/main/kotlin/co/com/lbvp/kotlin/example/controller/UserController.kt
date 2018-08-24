package co.com.lbvp.kotlin.jpa.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("user")
class UserController {

    @GetMapping("/service")
    fun findUser() = "Hello world"

}


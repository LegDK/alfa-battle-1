package ru.maltsev.alfabattleapp.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import reactor.kotlin.core.publisher.toMono

@RestController
class TestController () {

    @GetMapping
    fun test() : Mono<String> = "test".toMono()
}

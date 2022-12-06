package ru.sber.docker_app


import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class DockerAppApplication

fun main(args: Array<String>) {
    runApplication<DockerAppApplication>(*args)
}

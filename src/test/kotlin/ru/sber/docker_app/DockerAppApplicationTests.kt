package ru.sber.docker_app

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.ComponentScan

@SpringBootTest
@ComponentScan("ru.sber.docker_app")
class DockerAppApplicationTests {

    @Test
    fun contextLoads() {
    }

}

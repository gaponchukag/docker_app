package ru.sber.docker_app.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.sber.docker_app.service.DockerService


@RestController
@RequestMapping("/")
class DocketController @Autowired constructor(var dockerService: DockerService) {

    @GetMapping("/get-profile")
    fun getProfile(): String? = dockerService.getProfile()

    @GetMapping("set-profile/{profileName}")
    fun setProfile(@PathVariable("profileName") profileName: String): String =
        dockerService.setProfile(profileName)
}
package ru.sber.docker_app.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.env.ConfigurableEnvironment
import org.springframework.stereotype.Service


@Service
class DockerService {

    @Autowired
    private val env: ConfigurableEnvironment? = null

    fun getProfile() : String? {

        return  when (env?.activeProfiles?.get(0)) {
            "QA!" -> "QA!"
            "PRODUCTION!" -> "PRODUCTION!"
            "" -> "Active profile is Empty"
            else -> env?.activeProfiles?.get(0)
        }
    }

    fun setProfile(profileName : String) : String {
        env?.setActiveProfiles(profileName)
        return "profile set's to $profileName"
    }
}
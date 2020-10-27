package com.github.nataliaalehina.annotationtotestrail.services

import com.intellij.openapi.project.Project
import com.github.nataliaalehina.annotationtotestrail.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

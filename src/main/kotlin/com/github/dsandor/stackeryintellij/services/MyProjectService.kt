package com.github.dsandor.stackeryintellij.services

import com.github.dsandor.stackeryintellij.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

package com.github.elect86.dslmandatoryidea.services

import com.intellij.openapi.project.Project
import com.github.elect86.dslmandatoryidea.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

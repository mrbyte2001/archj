package com.github.mrbyte2001.archj.services

import com.intellij.openapi.project.Project
import com.github.mrbyte2001.archj.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

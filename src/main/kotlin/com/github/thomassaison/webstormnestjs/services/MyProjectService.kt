package com.github.thomassaison.webstormnestjs.services

import com.intellij.openapi.project.Project
import com.github.thomassaison.webstormnestjs.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

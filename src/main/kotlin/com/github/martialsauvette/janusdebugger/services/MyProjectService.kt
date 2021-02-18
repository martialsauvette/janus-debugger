package com.github.martialsauvette.janusdebugger.services

import com.github.martialsauvette.janusdebugger.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

package com.github.freefinal.editorwriting.services

import com.intellij.openapi.project.Project
import com.github.freefinal.editorwriting.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

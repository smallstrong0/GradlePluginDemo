package com.smallstrong.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

public class MyPlugin implements Plugin<Project>{

    void apply(Project project) {
        project.task('testTask') << {
            println "Hello gradle plugin"
        }
    }

}
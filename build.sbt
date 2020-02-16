lazy val apackage = project

lazy val use = project.dependsOn(apackage)

organization in ThisBuild := "com.github.izhangzhihao"

name := "issues/10306"

version := "1.0"

scalaVersion := "2.11.12"
        
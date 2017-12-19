pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh '''git pull
mvn clean install -Dmaven.test.skip=true'''
      }
    }
  }
}
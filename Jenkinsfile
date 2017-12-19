// Declarative //
pipeline {
    agent any

    stages {

        stage('Build'){
            steps {
                echo 'build'
            }
        }

        stage('Test'){
            steps {
                echo 'Test'
            }
        }

        stage('Deploy'){
            steps {
                echo 'Deploy'
            }
        }

    }

}

// Script //
node {
    stage('build'){
        echo 'build'
    }

    stage('Test'){
        echo 'Test'
    }

    stage('deploy'){
        def username = 'Jenkins'
        echo 'Hello Mr. ${username}'
        echo "I said, Hello Mr. ${username}"
    }
}
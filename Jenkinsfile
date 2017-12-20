// Script //
node {
    stage('build'){
        echo 'build start'
        sh 'mvn clean package -Dmaven.test.skip=true'
    }

    stage('Test'){
        echo 'Test skiped'
    }

    stage('deploy'){
        echo 'start deploy'
        sh 'cp target/demo-0.0.1-SNAPSHOT.jar /usr/workspace/deploy'
        sh 'cd /usr/workspace/deploy'
        sh 'chmod 777 /usr/workspace/deploy/*'
        sh 'java -jar /usr/workspace/deploy/demo-0.0.1-SNAPSHOT.jar'
    }
}
#!groovy
pipeline{
    agent{
        dockerfile true
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -v'
            }
        }
    }
}

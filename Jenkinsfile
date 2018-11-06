#!groovy
pipeline{
    agent none
    stages{
        stage("Build"){
          agent {label 'Slave-1'}
            steps{
              checkout scm;
            }
        }
        stage("Slave-1"){
            agent {label 'Slave-1'}
            steps{
                echo 'Hello World on Slave-1'
            }
        }
        stage("Slave-2"){
            agent {label 'Slave-2'}
            steps{
                echo 'Hello World on Slave-2'
            }
        }
    }
}

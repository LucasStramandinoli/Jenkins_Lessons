#!groovy
pipeline{
    agent none
    stages{
        stage("Checkout"){
          agent any;
            steps{
              checkout scm;
            }
        }
        stage("Docker"){
            agent{
                dockerfile true
            }
            steps {
              echo "docker working"
            }
        }
    }
}

#!groovy
pipeline{
    agent any
    stages{
        stage("Checkout"){
            steps{
              checkout scm;
            }
        }
        stage("Docker"){
            steps{
                dockerfile true
            }
        }
    }
}

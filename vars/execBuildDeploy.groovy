#!groovy
def call(String command){
  if (command == "build"){
    pipeline {
      agent any
        stages {
          stage('Build') {
            steps {
              echo "Building app"
            }
          }
        }
      }
    }
  }
  else if (command == "deploy"){
    pipeline {
      agent any
      stages {
        stage('Deploy') {
          steps {
            echo "Deploying app"
          }
        }
      }
    }
  }
  else{
    pipeline {
      agent any
      stages {
        stage('CommandFail') {
          steps {
            echo "Command not found.."
          }
        }
      }
    }
  }
}

#!groovy
def call(String command){
  if (command == "build"){
    stages {
      stage('Build') {
        steps {
          echo "Building app"
        }
      }
    }
  }
  else if (command == "deploy"){
    stages {
      stage('Deploy') {
        steps {
          echo "Deploying app"
        }
      }
    }
  }
  else{
    stages {
      stage('CommandFail') {
        steps {
          echo "Command not found.."
        }
      }
    }
  }
}

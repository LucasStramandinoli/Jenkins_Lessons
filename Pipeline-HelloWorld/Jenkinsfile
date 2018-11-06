pipeline{
    agent none
    stages{
        stage("parallel"){
            parallel{
                stage("Build"){
                    agent {label 'Slave-1'}
                    steps{
                        echo 'Hello World on Slave-1'
                    }
                }
                stage("Test"){
                    agent {label 'Slave-2'}
                    steps{
                        echo 'Hello World on Slave-2'
                    }
                }
            }
        }
    }
}



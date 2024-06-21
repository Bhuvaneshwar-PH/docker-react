@Library("my-shared-library") _
pipeline {
    agent any
  
    stages {
        stage('git') {
            steps {
                gitCalls()
            }
        }
        
       
        stage('docker-login') {
            steps {
               dockerLogin()
                }
            
        }
          stage('docker build') {
            steps {
               dockerBuild()
            }
        }
        stage('docker push') {
            steps {
               dockerPush()
            }
        }
    }
}

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
               dockerBuild '172.17.0.3:5000/node_app:2.0'
            }
        }
        stage('docker push') {
            steps {
               dockerPush '172.17.0.3:5000/node_app:2.0'
            }
        }
    }
}

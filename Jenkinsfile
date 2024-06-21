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
                sh "docker build -t 172.17.0.3:5000/node_app:1.0 ."
            }
        }
        stage('docker push') {
            steps {
                sh "docker push 172.17.0.3:5000/node_app:1.0"
            }
        }
    }
}

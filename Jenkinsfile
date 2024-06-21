@Library("my-shared-library") _
pipeline {
    agent any
  
    stages {
        stage('git') {
            steps {
                gitCall()
            }
        }
        
       
        stage('docker-login') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'nexus-cred', passwordVariable: 'passwd', usernameVariable: 'username')]) {
                    sh "docker login -u $username -p $passwd 172.17.0.3:5000"
                }
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

@Library("my-shared-library") _   // only used ( _ ) when there is no def mention in next line of @Library
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
                script {
                    // we can change the cred info here only it will work fine
                    def credentialsId = 'nexus-cred'
                    def usernameVar = 'username'
                    def passwordVar = 'passwd'
                    def dockerRegistry = '172.17.0.3:5000'
                    
                    // call dockerLogin.groovy from VARS folder
                    dockerLogin(credentialsId,usernameVar,passwordVar,dockerRegistry)
                }
                }
            
        }
          stage('docker build') {
            steps {
                // 
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

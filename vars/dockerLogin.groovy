def call() {
  withCredentials([usernamePassword(credentialsId: 'nexus-cred', passwordVariable: 'passwd', usernameVariable: 'username')]) {
  sh "docker login -u $username -p $passwd 172.17.0.3:5000"
}

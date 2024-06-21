def call(String credentialsId, String usernameVar, String passwordVar, String dockerRegistry) {
  withCredentials([usernamePassword(credentialsId: credentialsId, passwordVariable: passwordVar, usernameVariable: usernameVar)]) {
   // use provided parameter here.. 
  sh "docker login -u ${env[usernameVar]} -p ${env[passwordVar]} $dockerRegistry"
}
}


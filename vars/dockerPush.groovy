def call(string imageName) {
  sh "docker push ${imageName} "
}

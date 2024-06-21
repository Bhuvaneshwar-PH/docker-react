def call(string imageName) {
 sh "docker build -t ${imageName} ."
}


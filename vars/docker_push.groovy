def call (String ProjectName, String ImageTag, String DockerHubUser Sting DockerHubPass){
  echo "this is pushing the image to dockerhub"
  withCredentials([usernamePassword(credentialsId: "dockerHubCred", passwordVariable: "dockerHubPass", usernameVariable: "dockerHubUsername")]){
    sh "docker login -u ${DockerHubUser} -p ${DockerHubPass}"
  }
  sh "docker push ${DockerHubUser}/${ProjectName}:${ImageTag}"
}

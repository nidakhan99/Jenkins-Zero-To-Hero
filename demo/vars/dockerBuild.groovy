import org.company.devops.DockerHelper

def call(Map config = [:]) {
    String projectDir = config.projectDir ?: error("projectDir is required")
    String dockerImage = config.dockerImage ?: error("dockerImage is required")
    String credentialsId = config.credentialsId ?: 'docker-cred'

    def dockerHelper = new DockerHelper(this)
    dockerHelper.buildAndPush(projectDir, dockerImage, credentialsId)
}

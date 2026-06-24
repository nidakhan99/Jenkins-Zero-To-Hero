import org.company.devops.DockerHelper

def call(Map config = [:]) {
    String projectDir = config.projectDir ?: error("projectDir is required")
    String DOCKER_IMAGE = config.sonarUrl ?: error("DockerImage is required")
    String REGISTRY_CREDENTIALS = config.REGISTRY_CREDENTIALS ?: 'docker-cred'

def call{
        def docker = new DockerHelper(this)
        docker.build(projectDir, DOCKER_IMAGE, docker-cred)
    }
}


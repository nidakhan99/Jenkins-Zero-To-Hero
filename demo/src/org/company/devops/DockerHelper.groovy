package org.company.devops

class DockerHelper implements Serializable{

   

    def steps

    DockerHelper(steps) {
        this.steps = steps
    }

    void scan(String projectDir, String DOCKER_IMAGE, String docker-cred) {
        steps.sh """
            cd ${projectDir} && docker build -t ${DOCKER_IMAGE} .'
            def dockerImage = docker.image("${DOCKER_IMAGE}")
            docker.withRegistry('https://index.docker.io/v1/', "docker-cred") {
                dockerImage.push()
        """
    }
}

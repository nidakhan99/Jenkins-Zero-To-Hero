package org.company.devops

class DockerHelper implements Serializable {

    def script

    DockerHelper(script) {
        this.script = script
    }

    void buildAndPush(String projectDir, String dockerImage, String credentialsId) {

        script.sh """
            cd ${projectDir}
            docker build -t ${dockerImage} .
        """

        def image = script.docker.image(dockerImage)

        script.docker.withRegistry('https://index.docker.io/v1/', credentialsId) {
            image.push()
        }
    }
}

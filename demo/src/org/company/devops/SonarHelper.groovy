package org.company.devops

class SonarHelper implements Serializable {

    def steps

    SonarHelper(steps) {
        this.steps = steps
    }

    void scan(String projectDir, String sonarUrl) {
        steps.sh """
            cd ${projectDir}
            mvn sonar:sonar \
              -Dsonar.login=\$SONAR_AUTH_TOKEN \
              -Dsonar.host.url=${sonarUrl}
        """
    }
}

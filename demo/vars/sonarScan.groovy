import org.company.devops.SonarHelper


def call(Map config = [:]) {
    String sonarUrl = config.sonarUrl
    String credentialsId = config.credentialsId ?: 'sonarqube'

    withCredentials([string(credentialsId: credentialsId, variable: 'SONAR_AUTH_TOKEN')]) {
        def scanner = new sonarScan(this)
        scanner.run(sonarUrl)
    }
}

import org.company.devops.SonarHelper

def call(Map config = [:]) {
    String projectDir = config.projectDir ?: error("projectDir is required")
    String sonarUrl = config.sonarUrl ?: error("sonarUrl is required")
    String credentialsId = config.credentialsId ?: 'sonarqube'

    withCredentials([string(credentialsId: credentialsId, variable: 'SONAR_AUTH_TOKEN')]) {
        def sonar = new sonarScan(this)
        sonar.scan(projectDir, sonarUrl)
    }
}

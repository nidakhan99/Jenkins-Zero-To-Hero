package org.company.devops

class SonarHelper implements Serializable{

    def script

    SonarHelper(def script) {
        this.script = script
    }

    def staticCodeanalysis() {
        script.echo "Running Static code analysis tests using sonar"
        script.sh "cd java-maven-sonar-argocd-helm-k8s/spring-boot-app && mvn sonar:sonar -Dsonar.login=$SONAR_AUTH_TOKEN -Dsonar.host.url=${SONAR_URL}"
    
}


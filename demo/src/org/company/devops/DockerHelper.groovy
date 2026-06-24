package org.company.devops

class DockerHelper implements Serializable{

    def script

    MavenHelper(def script) {
        this.script = script
    }

    def cleanPackage() {
        script.echo "Running Maven clean package"
        script.sh "cd java-maven-sonar-argocd-helm-k8s/spring-boot-app && mvn clean package"
    }

    def cleanInstall() {
        script.echo "Running Maven clean install"
        script.sh "cd java-maven-sonar-argocd-helm-k8s/spring-boot-app && mvn clean install"
    }

    def test() {
        script.echo "Running Maven tests"
        script.sh "cd java-maven-sonar-argocd-helm-k8s/spring-boot-app && mvn test"
    }
}

package org.company.devops

class MavenHelper implements Serializable{

    def script

    MavenHelper(def script) {
        this.script = script
    }

    def cleanPackage() {
        script.echo "Running Maven clean package"
        script.sh "mvn clean package"
    }

    def cleanInstall() {
        script.echo "Running Maven clean install"
        script.sh "mvn clean install"
    }

    def test() {
        script.echo "Running Maven tests"
        script.sh "mvn test"
    }
}

//def call()
//{
//sh 'echo Maven Building the code'
//sh 'cd java-maven-sonar-argocd-helm-k8s/spring-boot-app && mvn clean package -DskipTests'


//}


import org.comapany.devops.MavenHelper

def call(String command = "package") {
    def maven = new MavenHelper(this)

    if (command == "package") {
        maven.cleanPackage()
    } else if (command == "install") {
        maven.cleanInstall()
    } else if (command == "test") {
        maven.test()
    } else {
        error "Unsupported Maven command: ${command}"
    }
}

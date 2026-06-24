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

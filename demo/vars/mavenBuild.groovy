def call()
{
sh 'echo Maven Building the code'
sh 'cd java-maven-sonar-argocd-helm-k8s/spring-boot-app && mvn clean package -DskipTests'


}

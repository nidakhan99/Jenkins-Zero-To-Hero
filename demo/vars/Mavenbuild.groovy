def call()
{
sh 'echo Maven Building the code'
sh 'mvn clean package -DskipTests'

}

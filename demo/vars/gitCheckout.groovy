def call() {

sh 'echo checking out to the repo with the specified branch'
git branch: 'main2', credentialsId: 'git_creds', url: 'https://github.com/nidakhan99/Jenkins-Zero-To-Hero.git'
sh 'echo Hurray!!!! you have successfully checkout to the repo'
}

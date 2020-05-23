pipeline{
    agent any
    stages {
        stage('Execução testes funcional') {
            steps{
            sh "mvn package"
            sh "mvn clean verify"
            }
        }
    }
}
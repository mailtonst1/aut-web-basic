pipeline{
    agent any
    stages {
        stage('Execução testes funcional') {
            steps{
            sh "mvn clean"
            sh "mvn verify"
            }
        }
    }
}
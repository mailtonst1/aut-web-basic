pipeline{
    agent{
        docker{
            image 'openjdk:8'
        }
    }
    stages {
        stage('Execução testes funcional') {
            steps{
            sh "mvn clean verify"
            }
        }
    }
}
pipeline{
    agent any
    tools { 
        maven 'Maven 3.3.9' 
        jdk 'jdk8' 
    }
    stages {
        stage('Verificar versão Java'){
            sh "java -version"
        }
        stage('Execução testes funcional') {
            steps{
                script{
                    try{
                        sh "mvn package clean verify"
                        currentBuild.result = 'SUUCESS' 
                    }catch (Exception e){
                        currentBuild.result = 'FAILURE'
                    }
                }
            }
        }
    }
}
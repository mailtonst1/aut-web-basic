pipeline{
    agent any
    tools { 
        maven "MAVEN_LOCAL" 
        jdk "JAVA_LOCAL" 
    }
    stages {
        stage('Verificar versão Java'){
        steps{
            sh "java -version"   
        }
        }
        stage('Execução testes funcional') {
        steps{
            script{
                try{
                    sh "mvn package clean verify"
                    currentBuild.result = 'SUCCESS' 
                }catch (Exception e){
                    currentBuild.result = 'FAILURE'
                }
            }
        }
        }
    }
}
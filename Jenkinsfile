pipeline {
    agent any
    
    stages {
    
       stage('clean') {
           stages {
                sh 'mvn clean'
                }
           }
       stage('compile') {
           stages {
                sh 'mvn compile'
                }
           }
           
        stage('test') {
           stages {
                sh 'mvn test'
                }
           }   
        stage('jar') {
           stages {
                sh 'mvn package -DskipTests=true'
           }
         }  
    }
}     
           
                
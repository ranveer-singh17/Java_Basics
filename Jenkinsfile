pipeline {
    agent any


    stages {
                 stage('Code Checkout') {
            steps {
                checkout([
                    $class: 'GitSCM', 
                    branches: [[name: '*/main']], 
                    userRemoteConfigs: [[url: 'https://github.com/ranveer-singh17/Java_Basics.git']]
                ])
            }
        }
        stage ('Build') {
            when {
                branch 'main'
            }
            steps {
                bat 'javac test.java'
                bat 'test.java'
            }
        }
        stage('Testing'){
            steps{
                bat'echo running unit test cases'
            }
        }
        stage('Code_analysis'){
            steps{
                def mvn = tool 'mvn';
                withSonarQubeEnv() {
            bat '${mvn}/bin/mvn clean verify sonar:sonar -Dsonar.projectKey=Java_jenkins'
                }
            }
  }

                
            }
    post{
        always{
            mail to: "ranveersingh7600454082@gmail.com",
            subject: "Test Email",
            body: "Test"
        }
}
}



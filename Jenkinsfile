pipeline {
    agent any

    stages {
        stage ('Build') {
            steps {
                powershell 'javac test.java'
                powershell 'test' 
            }
        }
    }
}

pipeline {
    agent any

    stages {
        stage ('Build') {
            steps {
                bat 'javac test.java'
                bat 'test'
            }
        }
    }
}

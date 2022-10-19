pipeline {
    agent any

    stages {
        stage ('Build') {
            steps {
                bat 'javac test.java'
                bat 'test.java'
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

pipeline {
    agent any

    tools {
        // This must match the name you gave in Manage Jenkins -> Tools
        maven 'Maven3' 
    }

    stages {
        stage('Build & Test') {
            steps {
                // This runs your JUnit tests from the assignment
                sh 'mvn clean test'
            }
        }

        stage('Package') {
            steps {
                // This creates the JAR file needed for Docker
                sh 'mvn package -DskipTests'
            }
        }
    }

    post {
        success {
            // This captures the test results for your marks
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
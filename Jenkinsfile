pipeline {
    agent any

    tools {
        maven 'M398' // Replace with your Maven tool name in Jenkins
        jdk 'Java17' // Optional: if you have a named JDK configured in Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Run') {
            steps {
                sh 'mvn exec:java -Dexec.mainClass="com.example.HelloWorld"'
            }
        }
    }
}

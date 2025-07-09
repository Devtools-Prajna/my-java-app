pipeline {
    agent any

    tools {
        maven 'M398' // Make sure 'M398' is defined under Jenkins Global Tools
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

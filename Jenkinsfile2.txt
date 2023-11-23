pipeline {
    agent { docker {image 'python:latest'} }

    stages {
        stage('clone') {
            steps {
                echo 'checkout...'
            }
        }
        
        stage('build') {
            steps{
                echo 'Building...'
                sh "ls -la"
            }
        }
        
        stage('testing'){
            steps{
                echo 'testing...'
                sh """
                echo "Line1"
                echo "Line2"
                """
                sh "python --version"
            }
        }
    }
}

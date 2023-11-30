pipeline {
    agent { docker {image 'python:latest'} }
    parameters {
        string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')

        text(name: 'BIOGRAPHY', defaultValue: '', description: 'Enter some information about the person')

        booleanParam(name: 'TOGGLE', defaultValue: true, description: 'Toggle this value')

        choice(name: 'CHOICE', choices: ['One', 'Two', 'Three'], description: 'Pick something')

        password(name: 'PASSWORD', defaultValue: 'SECRET', description: 'Enter a password')
    }
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

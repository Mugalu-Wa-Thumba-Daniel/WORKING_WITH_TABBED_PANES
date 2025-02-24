pipeline {
    agent any  // Run on any available Jenkins machine

    environment {
        BUTLER_PATH = "C:\\butler\\butler.exe"  // Update with actual Butler path
    }

    stages {
        stage('Checkout Code') {
            steps {
                git 'https://github.com/Mugalu-Wa-Thumba-Daniel/WORKING_WITH_TABBED_PANES.git'  // Clone the code from GitHub
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package'  // Compile the Java project using Maven
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarTest') {  // Run code analysis using SonarQube
                    bat 'mvn sonar:sonar'
                }
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'  // Run unit tests
            }
        }

        stage('Deploy to Itch.io') {
            steps {
                withCredentials([string(credentialsId: 'itch.io', variable: 'ITCH_API_KEY')]) {
                    bat 'set BUTLER_API_KEY=%ITCH_API_KEY% && echo %BUTLER_API_KEY% && "%BUTLER_PATH%" push target/*.jar emma-nam/fasto:windows'
                }
            }
        }
    } // <-- This was missing: closes the `stages` block

    post {
        success {
            echo 'Build, Tests, SonarQube analysis, and Deployment to Itch.io completed successfully!'
        }
        failure {
            echo 'Pipeline failed. Check logs for details.'
        }
    }
}

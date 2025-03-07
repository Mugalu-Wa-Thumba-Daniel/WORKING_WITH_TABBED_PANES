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


        stage('Deploy to Itch.io') {  
    steps {  
        withCredentials([string(credentialsId: 'itch.io', variable: 'ITCH_API_KEY')]) {  
            bat '"C:\\butler\\butler.exe" push target/WORKING_WITH_TABBED_PANES-1.0-SNAPSHOT.jar emma-nam/fasto:win"'
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

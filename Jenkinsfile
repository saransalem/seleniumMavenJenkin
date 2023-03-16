pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Build App'
		    bat 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                echo 'Test App'
		    bat 'mvn test'
            }
        }
        stage('Package') {
            steps {
                echo 'Package App'
		    bat 'mvn package'
            }
        }
	    
	    
        stage('Artifacts') {
            steps {
                echo 'Artifacts App'
		archiveArtifacts artifacts: '**/target/*.jar', followSymlinks: false
            }
        }
	    
        stage('Deploy') {
            steps {
                echo 'Deploy App'
		    }
        }
		
		}
		post
		{
			failure
			{
				emailext body: 'Your pipeline script aborted !!', subject: 'Pipeline script is failed', to: 'saransalem30@gmail.com'			
			}
			always
			{
				emailext body: 'Your pipeline script aborted !!', subject: 'Pipeline script is failed', to: 'saransalem30@gmail.com'			
			}
		}
}

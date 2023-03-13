pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Build App'
            }
        }
        stage('Test') {
            steps {
                echo 'Test App'
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

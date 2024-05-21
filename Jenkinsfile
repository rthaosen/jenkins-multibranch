pipeline {
    agent any
    
    environment{
        NAME="ABC"
        AGE=26
    }

    stages {
        stage('build') {
            steps {
                sh '''
                 echo Building
                 echo application
                 echo $NAME
                 echo $AGE
                '''
                // retry(2){
                //   sh 'echo trying'
                // }
                // timeout(time:5, unit: 'SECONDS'){
                //     sh 'sleep 30'
                // }
            }
        }
        stage('test') {
            steps {
                echo 'Testing application'
            }
        }
        stage('deploy') {
            steps {
                echo 'Deploying application'
            }
        }
    }
}

pipeline {
    agent any
    
    environment{
        NAME="ABC"
        AGE=26
    }
    parameters {
        string(name: 'TEST', defaultValue: '', description: 'teststring')
        choice(name: 'VERSION', choices: ['1.1.0','1.2.0'])
        booleanParam(name: 'executeTests', defaultValue: true)
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
            when {
                expression {
                    params.executeTests
                }
            }
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

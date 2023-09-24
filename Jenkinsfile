pipeline {
    agent any
    environment {
        CI = 'false'
    }
    tools {
        jdk 'jdk-17.0.7+7'
        nodejs 'NodeJS 18.18.0 LTS'
    }
    stages {
        stage('Checkout') {
            steps {
                // Get some code from a GitHub repository
                git branch: 'main', url: 'https://github.com/MrPancetita/neomemorizer'
            }
        }
        stage('NPM install') {
            steps {
                sh 'npm install ./frontend'
            }
        }   
        stage('SonarQube Analysis') {
            steps {
                script {
                    def mvn = tool 'Default Maven';
                    withSonarQubeEnv('Local SonarQube') {
                    sh "${mvn}/bin/mvn clean verify sonar:sonar -Dsonar.projectKey=neomemorizer -Dsonar.projectName='neomemorizer' -Dsonar.host.url=http://172.17.0.2:9000 -Dsonar.token=sqp_3eb0b085c2541e19928bb5f542d0a01a168d525d"
                    }
                }
             }
        }
        stage('Build') {
            steps {
                sh 'chmod 744 ./mvnw'
                sh './mvnw clean package'
            }
            post {
                always {
                    sh 'echo DUMMY - TODO: Desplegando a staging...'
                }
                success {
                    sh 'echo creando peticion de cambio'
                    jiraSendDeploymentInfo (
                            environmentId: 'en-prod-1',
                            environmentName: 'en-prod-1',
                            environmentType: 'production',
                            serviceIds: [
                                    'b:YXJpOmNsb3VkOmdyYXBoOjpzZXJ2aWNlL2Y3ZmE1NDJhLTgwYWEtNDA3Zi1iMTY1LTU1ZDBiOTdjNTA1NS8yNTg4MTUxZS1hNjBjLTExZWQtYTk1Yi0xMjhiNDI4MTk0MjQ='
                            ],
                            site: 'serconlo.atlassian.net',
                            state: 'in_progress'
                    )
                }
            }
        }
        stage('Despliegue Prod') {
            steps {
                input message: 'Please confirm the status of the change associated to this build number. Click Approved only if the change is already approved', ok: 'Approved'
            }
            post {
                success {
                    sh 'echo DUMMY: Desplegando en produccion...'
                    jiraSendDeploymentInfo (
                            environmentId: 'en-prod-1',
                            environmentName: 'en-prod-1',
                            environmentType: 'production',
                            serviceIds: [
                                    'b:YXJpOmNsb3VkOmdyYXBoOjpzZXJ2aWNlL2Y3ZmE1NDJhLTgwYWEtNDA3Zi1iMTY1LTU1ZDBiOTdjNTA1NS8yNTg4MTUxZS1hNjBjLTExZWQtYTk1Yi0xMjhiNDI4MTk0MjQ='
                            ],
                            site: 'serconlo.atlassian.net',
                            state: 'successful'
                    )
                }
            }
        }
    }
    post {
        always {
            junit '**/target/surefire-reports/TEST-*.xml'
            archiveArtifacts 'target/*.war'
            sh 'gzip -r frontend.zip frontend/build'
            archiveArtifacts 'frontend.zip'
        }
    }
}

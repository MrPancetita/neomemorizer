pipeline {
    agent any
    tools {
        jdk 'jdk-17.0.7+7'
    }
    stages {
        stage('Checkout') {
            steps {
                // Get some code from a GitHub repository
                git branch: 'main', url: 'https://github.com/MrPancetita/neomemorizer'
            }
        }
        stage('SonarQube Analysis') {
            steps {
                script {
                    def mvn = tool 'Default Maven';
                    withSonarQubeEnv('Local SonarQube') {
                    sh "${mvn}/bin/mvn clean verify sonar:sonar -Dsonar.projectKey=neomemorizer -Dsonar.projectName='neomemorizer' -Dsonar.host.url=http://localhost:9000 -Dsonar.token=sqp_0bdec9fe1dc2f8e304bca42c39f75f3b5befc8f8"
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
        }
    }
}

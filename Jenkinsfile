pipeline{
    agent any
    tools{
            maven 'maven home'
        }
        stages{
            stage('Build maven'){
                steps{
                    checkout scmGit(branches: [[name: '*/jenkinsprinbootdockerupdated']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/rohitaggarwal88/ratingservi.git']])
                    bat 'mvn clean install'
                }
            }
            stage('Build docker image'){
                steps{
                    script{
                        bat 'docker build -t rohitaggarwal88/jenkinspringbootnew1q .'
                    }
                    checkout scmGit(branches: [[name: '*/jenkinsprinbootdockerupdated']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/rohitaggarwal88/ratingservi.git']])
                    bat 'mvn clean install'
                }
            }
            stage('Push image to hub'){
                steps{
                    script{
                        withCredentials([string(credentialsId: 'dockerhubpwd1', variable: 'dockerhubpwd2')]) {
                            bat 'docker login -u rohitaggarwal88 -p Poojagarg@88'
                            bat 'docker push rohitaggarwal88/jenkinspringbootnew1q'
                            // some block
                            }
                    }
                }
            }
            stage('Deploy to K8S'){
                steps{
                    script{
                        kubernetesDeploy (configs: 'deploymentservice.yaml' ,kubeconfigId: 'k8sconfpwd')
                    }
                }
            }
        }
}
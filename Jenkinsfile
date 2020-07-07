pipeline {
  agent any
  stages {
    stage('checkout') {
      steps {
        git(url: 'https://github.com/thaleshXor/July1-2020', branch: 'master')
      }
    }

    stage('compile') {
      steps {
        //---------Windows---
        bat 'mvn clean'
        bat 'mvn compile'
        //--------linux------
        //sh 'mvn clean'
        //sh 'mvn compile'
      }
    }

    stage('build') {
      steps {
        bat 'mvn test'
        //sh 'mvn test'
      }
    }

  }
}

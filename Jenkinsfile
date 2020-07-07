pipeline {
  agent any
  stages {
    stage('checkout') {
      steps {
        git(url: 'https://github.com/thaleshXor/July2-2020', branch: 'dev')
      }
    }

    stage('build') {
      steps {
        bat 'mvn test'
      }
    }

  }
}
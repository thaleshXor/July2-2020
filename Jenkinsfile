pipeline {
  environment{
    workspace=WORKSPACE
  }
  agent {
  	label 'ubuntu'
  }
  stages {
    stage('checkout') {
      steps {
        git(url: 'https://github.com/thaleshXor/July2-2020', branch: 'master')
      }
    }
    stage('compile') {
      steps {
        echo ">>>>>>>>>>>>>>>>>>>>>"
        echo "chmod 777 ${workspace}/jenkins"
        //sh "chmod 777 ${workspace}/jenkins"
        
      }
    }


  }
}

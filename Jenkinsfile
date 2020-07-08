def String m1(){
  
  println(">>>>>><<<<<<<<<<<<")
  return "sharma"
  
}


pipeline {
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
        echo ">>>>>>>>>>>>>"
        echo "$HOME"
        echo "thalesh ${m1()}"
      }
    }


  }
}

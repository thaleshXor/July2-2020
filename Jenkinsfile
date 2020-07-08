def welcome(){
  println("I am inside method : welcome()")
}

def String m1(){
  println("I am inside method m1(), and will return a string")
  return "sharma"
}

pipeline {
  agent {
  	label 'ubuntu'
  }
  stages {
    stage('checkout') {
      steps {
        welcome()
        git(url: 'https://github.com/thaleshXor/July2-2020', branch: 'master')
      }
    }
    stage('compile') {
      steps {
        echo "thalesh ${m1()}"
        script{
          def myName = "thalesh " + m1()
          echo "echo : My name is : $myName"
          println "println: My name is : " + myName
        }
        
        def name2="Garima " + m1()
        echo "echo : My name is : $myName"
        println "println: My name is : " + myName
        
      }
    }


  }
}

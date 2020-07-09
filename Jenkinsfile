pipeline {
  environment{
    FIRSTNAME='thalesh'
    SURNAME='sharma'
    
  }
  agent {
  	label 'ubuntu'
  }
  stages{
    stage('HelloWorld_Pipeline') {
      steps {
        echo "-------------TEST STARTS-----------------"
        echo "${env.FIRSTNAME} ${env.SURNAME}"
        sh 'mvn test'
        echo "-------------TEST ENDS-----------------"
      }//steps ends
    }//stage ends
  }//stages ends
}//pipeline ends

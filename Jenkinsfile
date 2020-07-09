pipeline {
  agent none
  environment{
    BROWSER='none' 
  }
 
  stages{
    stage('STAGE GROUP NAME'){

    parallel{
      //------------------------------Stage1------------------------------
        stage('Stage1:Testing on Windows-chrome') {
          agent{
            label 'master'
          }
          environment{
            BROWSER='chrome'
          }
          steps {
            echo "-------------TEST STARTS-----------------"
            echo "ECHO : Test running on ${env.BROWSER}"
            sh 'mvn test'
          }//steps ends
        }//stage1 ends------------------------------------------------
      
      //---------------------------------Stage2----------------------------
        stage('Stage2:Testing on Ubuntu-firefox') {
          agent{
            label 'ubuntu'
          }
          environment{
            BROWSER='firefox'
          }
          steps {
            echo "-------------TEST STARTS-----------------"
            echo "ECHO : Test running on ${env.BROWSER}"
            sh 'mvn test'
          }//steps ends
        }//stage2 ends------------------------------------------------      
      
    }//prallel block ends here 
    
  }//stage group ends here
      
  }//stages ends
}//pipeline ends

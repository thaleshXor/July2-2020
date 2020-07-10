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
            echo "ECHO inside Windows BEFORE JAVAHOMEPATH setup , value of JAVA_HOME is : $JAVA_HOME"
            BROWSER='chrome'
            JAVA_HOME='C:/Program Files/Java/jdk1.8.0_231'
          }
          steps {
            echo "-------------jenkinsFile-Hardcoded messgae:::TEST STARTS On Windows Chrome -----------------"
            echo "ECHO inside Windows AFTER JAVAHOMEPATH setup , value of JAVA_HOME is : $JAVA_HOME"
            echo "ECHO : Test running on ${env.BROWSER}"
            bat 'mvn test'
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
            echo "-------------jenkinsFile-Hardcoded messgae:::TEST STARTS on ubuntu Firefox-----------------"
            echo "ECHO : Test running on ${env.BROWSER}"
            sh 'mvn test -e'
          }//steps ends
        }//stage2 ends------------------------------------------------      
      
    }//prallel block ends here 
    
  }//stage group ends here
      
  }//stages ends
}//pipeline ends

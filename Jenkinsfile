//------------variables----------
def index=1
def conditionMatch=false
def myName=""
//------------pipeline------------
pipeline {
  agent {
  	label 'ubuntu'
  }
  stages{
    stage('LearningPipeline') {
      steps {
        script{
            for(int i=1;i<=5;i++){
              
              if(index==3){
                println "index reached to 3 ...more to come silently"
                conditionMatch=true
              }
              
              if(conditionMatch){
                println("condition wasmatched : true. because index reached to 3")
                myName="Garima Koushik"
              }

              index++
               conditionMatch=false;
            } //for ends
          
        }//script ends
        
        echo "echo : Thalesh Loves $myName"
        println "println : Thalesh Loves " + myName
        /*
        for(int iteration=1;iteration<5;iteration++){
          echo "I am counting. And number is : $iteration"
         */
        }
      }//steps ends
    }//stage ends


  }//stages ends
}//pipeline ends

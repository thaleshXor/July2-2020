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
        
      }//steps ends
    }//stage ends


  }//stages ends
}//pipeline ends

//------------variables----------
def index=1
def conditionMatch=false
def myName=""
//---------------method---------
def String m1(){
  println("I am inside method m1(), and will return a string")
  return "sharma"
}
//------------pipeline------------
pipeline {
  agent {
  	label 'ubuntu'
  }
  stages{
    stage('LearningPipeline') {
      steps {
        echo "thalesh ${m1()}"
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

pipeline{
    agents any{
 stages{
     stage('init'){
     
     steps {

         "echo testing....."
         }
     }  
      stage('Build'){
     
     steps {

         "echo testing....."
         }
      }   
         stage('Deploy'){
     
     steps {

         "echo testing....."
         } 
     }
 }
    }

}

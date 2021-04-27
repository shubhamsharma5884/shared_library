pipeline{
    agent {
	  label 'master'
	  }
	  stages {
          stage('build') { 
             steps { 
			   echo  'jdk '
        }
	}
	}	
	  stages {
          stage('test') {
             steps { 
			     echo  'test completed'
            }
        }
	   }
	  stages {
          stage('deployed') {
			 steps {
			     echo  'deploy'
                
            }
        }
     } 
}	 
	 
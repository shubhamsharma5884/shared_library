pipeline{
     agent {
	    label 'master'
		}
		stages{
           stage('Demo') {
		      steps{
              echo 'Hello world'
	 }
	 }
            }
}
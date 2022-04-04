pipeline {
agent any

 stages {

   stage('Check out') {
      steps {
        echo 'Checking out'
   }
 }
stage('Package') {
 steps {
 bat 'mvn clean package'
 }
}
  stage('sonar analysis') {
  steps {
  jacoco()
  }
stage('JaCoCo Report') {
  steps {
  jacoco()
  }
}
}
}

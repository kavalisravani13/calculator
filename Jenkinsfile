pipeline{
   agent any
      stages{
        stage('clone ){
        steps{ 
            git branch:'main'.url:'https://github.com/kavalisravani13/calculator.git';
}
}
stgae('compile'){
steps{
 sh 'javac Calculator.java'
}
}
stage('build'){
steps{
sh 'javacCalculator 25 5'
}
}
stgae('test'){
steps{
 sh 'javac Calculator 30 -5'
}
}
stage('Deploy'){
steps{
echo 'Deployment completed'
}
}
}
}

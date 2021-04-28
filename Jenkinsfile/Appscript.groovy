pipeline {
agent any
stages {
stage ('build') {
steps{
echo 'line 1'
}
}
stage ('test: integration-&-quality') {
steps{
echo 'line 2'
}
}
stage ('test: functional') {
steps{
echo 'line 3'
}
}
stage ('test: load-&-security') {
steps{
echo 'line 4'
}
}
stage ('approval') {
steps{
echo 'line 5'
}
}
stage ('deploy:prod') {
steps{
echo 'line 6'
}
}
}
}
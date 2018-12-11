@Library('helper') _

node('master') {
	myLib.git("jjb-pipeline-example.git", "master")
	sh 'ls'
	sh "ping ${url} -c 5"
}
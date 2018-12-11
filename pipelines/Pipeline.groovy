node('master') {
	MyLib.git("jjb-pipeline-example.git", "master")
	sh 'ls'
	sh "ping ${url} -c 5"
}
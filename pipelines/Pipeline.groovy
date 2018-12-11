node('master') {
	sh "ping ${url} -c 5"
}
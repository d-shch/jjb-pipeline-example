def git(repo, branch) {
	git(url: "https://github.com/d-shch/${repo}",
			credentialsId: "379268d2-8b01-42a1-bfa3-47eeee193be6",
			branch: "${branch}")
}
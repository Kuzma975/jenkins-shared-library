#!groovy

call (def parameters) {
    sh(script: "ls ${parameters}", returnStdout: true)
}
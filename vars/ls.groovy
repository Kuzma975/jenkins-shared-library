#!groovy

def call (def parameters) {
    sh(script: "ls ${parameters}", returnStdout: true)
}
#!grooyv

def call() {}

def lsall() {
    sh(script: "ls -al", returnStdout: true)
}

def ls() {
    sh(script: "ls", returnStdout: true)
}

def ex() {
    throw new Exception("Some error is happen")
}
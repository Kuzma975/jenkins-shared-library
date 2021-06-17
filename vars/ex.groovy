#!groovy

def call() {}


def someFunction() {
    try {
        ls.ex()
    } catch(Exception ex) {
        println(ex.printStackTrace)
        throw ex
    }
}
#!groovy

def call() {
    println("Hello, I'm EX")
}


def someFunction() {
    try {
        ls.ex()
    } catch(Exception ex) {
        println(ex.printStackTrace())
        throw ex
    }
}
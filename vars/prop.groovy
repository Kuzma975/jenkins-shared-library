#!groovy

def call() {

}

def choiceOfLibraryBranch() {
    def parameter = string(name: 'pipelineSharedLibrary', defaultValue: 'feature-1', description: 'Optional - Git branch for jenkins-shared-library', trim: true)
    return parameter
}
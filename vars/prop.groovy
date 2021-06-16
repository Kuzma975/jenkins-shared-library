#!groovy

call() {

}

choiceOfLibraryBranch() {
    def parameter = string(name: 'pipelineSharedLibrary', defaultValue: 'master', description: 'Optional - Git branch for jenkins-shared-library', trim: true)
    return parameter
}
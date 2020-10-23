package nam.tran.composite1

class Folder constructor(fileFolder: List<FileComponent>) : FileComponent {

    private val fileComponents = mutableListOf<FileComponent>()

    init {
        fileComponents.addAll(fileFolder)
    }

    override fun showProperty() {
        fileComponents.forEach {
            it.showProperty()
        }
    }

    override fun totalSize(): Long {
        var total = 0L
        fileComponents.forEach {
            total += it.totalSize()
        }
        return total
    }
}
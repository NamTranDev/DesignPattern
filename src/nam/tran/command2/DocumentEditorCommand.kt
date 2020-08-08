package nam.tran.command2

class DocumentEditorCommand constructor(private val document: Document, private val text: String) : CommandText {

    init {
        document.write(text)
    }

    override fun undo() {
        document.eraseLast()
    }

    override fun redo() {
        document.write(text)
    }

}
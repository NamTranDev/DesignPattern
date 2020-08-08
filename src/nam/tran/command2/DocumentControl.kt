package nam.tran.command2

import java.util.*


class DocumentControl {
    private val undoCommands = Stack<CommandText>()
    private val redoCommands = Stack<CommandText>()
    private val document = Document()

    fun undo() {
        if (!undoCommands.isEmpty()) {
            val cmd = undoCommands.pop()
            cmd.undo()
            redoCommands.push(cmd)
        } else {
            println("Nothing to undo")
        }
    }

    fun redo() {
        if (!redoCommands.isEmpty()) {
            val cmd = redoCommands.pop()
            cmd.redo()
            undoCommands.push(cmd)
        } else {
            println("Nothing to redo")
        }
    }

    fun write(text: String) {
        val cmd = DocumentEditorCommand(document, text)
        undoCommands.push(cmd)
        redoCommands.clear()
    }

    fun read() {
        document.read()
    }
}
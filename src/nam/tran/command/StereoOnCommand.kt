package nam.tran.command

class StereoOnCommand constructor(val stereo: Stereo) : Command {

    override fun excute() {
        stereo.on()
        stereo.setCD()
        stereo.setVolumn(11)
    }

    override fun undo() {

    }
}
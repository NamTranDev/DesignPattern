package nam.tran.command

class StereoOffCommand constructor(val stereo: Stereo) : Command {

    override fun excute() {
        stereo.off()
    }

    override fun undo() {
        stereo.on()
        stereo.setCD()
        stereo.setVolumn(11)
    }
}
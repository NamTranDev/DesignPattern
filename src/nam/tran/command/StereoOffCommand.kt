package nam.tran.command

class StereoOffCommand constructor(val stereo: Stereo) : Command {

    override fun excute() {
        stereo.off()
    }
}
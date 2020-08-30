package nam.tran.facade

class HomeTheaterFacade constructor(private val amplifier: Amplifier, private val tuner: Tuner, private val dvdPlayer: DvdPlayer,
                                    private val cdPlayer: CdPlayer, private val projector: Projector, private val screen: Screen,
                                    private val lights: TheaterLights, private val popper: PopcornPopper) {

    fun watchMovie() {
        println("Get ready to watch a movie...")
        popper.on()
        popper.pop()
        lights.dim()
        screen.down()
        projector.on()
        projector.wideScreenMode()
        amplifier.on()
        amplifier.setDvd(dvdPlayer)
        amplifier.setSurroundSound()
        amplifier.setVolumn()
        dvdPlayer.on()
        dvdPlayer.play()
    }


    fun endMovie() {
        println("Shutting movie theater down...")
        popper.off()
        lights.on()
        screen.up()
        projector.off()
        amplifier.off()
        dvdPlayer.stop()
        dvdPlayer.eject()
        dvdPlayer.off()
    }
}
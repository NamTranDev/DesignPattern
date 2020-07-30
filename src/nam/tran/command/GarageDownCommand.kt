package nam.tran.command

class GarageDownCommand constructor(val garageDoor: GarageDoor) : Command{

    override fun excute() {
        garageDoor.down()
    }

    override fun undo() {

    }
}
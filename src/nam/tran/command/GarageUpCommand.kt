package nam.tran.command

class GarageUpCommand constructor(val garageDoor: GarageDoor) : Command{

    override fun excute() {
        garageDoor.up()
    }

    override fun undo() {

    }
}
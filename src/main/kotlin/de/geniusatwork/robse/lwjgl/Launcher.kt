package de.geniusatwork.robse.lwjgl

object Launcher {
    @JvmStatic fun main(arg: Array<String>) {
        val game = Game()
        game.run()
    }
}
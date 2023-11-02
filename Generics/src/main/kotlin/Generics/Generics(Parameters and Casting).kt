package Generics

open class Player(val name: String)

interface Listener

class CricketPlayer(name: String): Player(name)
class FootballPlayer(name: String): Player(name), Listener
open class GamesPlayer(name: String): Player(name)
class CounterStrikePlayer(name: String): GamesPlayer(name)



// Upper bound can be put in two ways in Generics...
// 1. Team<T: Class-name>() {}
// 2. using where T: className1, T: interface
// Note:- By default we can add only one upper bound with the Generics. But we can add 2 upper bounds indirectly using interfaces...
class Team<T>(val team: String, val players: MutableList<in T>) where T: Player, T: Listener {
    fun addPlayers(player: T) {
        if(players.contains(player)) {
            println("Player: ${player.name} already exists in the team ${this.team}")
        } else {
            players.add(player)
            println("Player: ${player.name} added to team ${this.team}")
        }
    }
}

// Applying upper bounds on methods...
fun <T> addPlayer(player: T) where T: Player, T: Listener {
    println("Player added")
}


fun main(args: Array<String>) {
    val cricketPlayer = CricketPlayer("MS Dhoni")
    val footballPlayer = FootballPlayer("Ronaldo")
    val gamesPlayer = GamesPlayer("Anupam")


//    val footballTeam = Team<FootballPlayer>("Barcelona", mutableListOf((footballPlayer), FootballPlayer("Messi")))
//    val cricketTeam = Team<CricketPlayer>("Chennai Super Kings", mutableListOf())
//    val gamesTeam = Team<GamesPlayer>("Dynamo", mutableListOf(gamesPlayer))

    // Covarience... mutualListOf<CricketPlayer> inheriting from Team<Player> (Top to Bottom) -> class Team<T>(val players: MutableList<out T>)
//    val cricketTeam = Team<Player>("Football", mutableListOf<CricketPlayer>(cricketPlayer, CricketPlayer("Virat Kohli")))

// Contravarience... Team<CounterStrikePlayer> inheriting from GamesTeam which further inherits from Player class... ( Bottom to Top ) -> class Team<T>(val players: MutableList<in T>)
    val gamesTeam = Team<FootballPlayer>("Games Team", mutableListOf<Player>(gamesPlayer, GamesPlayer("Player 2")))


    gamesTeam.addPlayers(FootballPlayer("Player 3"))
    gamesTeam.players.forEach {
        println(it)
    }

//    cricketTeam.addPlayers(cricketPlayer)

    addPlayer(FootballPlayer("Messi"))
}
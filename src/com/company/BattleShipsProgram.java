package com.company;


public class BattleShipsProgram {

    ComputerPlayer computerPlayer = new ComputerPlayer();
    HumanPlayer humanPlayer = new HumanPlayer();


    public BattleShipsProgram(){
        computerPlayer.placeShips();
        humanPlayer.placeShips();
    }

    public void start(){

        computerPlayer.renderMap();
        humanPlayer.renderMap();

        do {
            Position shotCoords = humanPlayer.getShotCoordinates();
            computerPlayer.shootAt(shotCoords);
            computerPlayer.renderMap();

            shotCoords = computerPlayer.getShotCoordinates();
            humanPlayer.shootAt(shotCoords);
            humanPlayer.renderMap();

        }while(computerPlayer.hasFloatingShips() && humanPlayer.hasFloatingShips());

        if ( humanPlayer.hasFloatingShips()) {
            System.out.println("You have won the game!");
        }
        else{
            System.out.println("You lost the game!");
        }

    }

}

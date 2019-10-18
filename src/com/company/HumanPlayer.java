package com.company;

import java.util.Scanner;

public class HumanPlayer extends Player {

    public HumanPlayer(){
        super("Human");
    }

    public Position getShotCoordinates(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x and y coordinates, e.g. 2,3");
        String coords = scanner.nextLine();
        String[] coordParts = coords.split(",");

        return new Position(
                Integer.parseInt(coordParts[0]),
                Integer.parseInt(coordParts[1]));
    }

}

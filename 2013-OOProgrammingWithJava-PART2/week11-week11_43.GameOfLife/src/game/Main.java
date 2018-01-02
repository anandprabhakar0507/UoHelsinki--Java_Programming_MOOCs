package game;

import gameoflife.Simulator;

public class Main {

    public static void main(String[] args) {
        PersonalBoard board = new PersonalBoard(50, 50);
        board.initiateRandomCells(1.0);

        Simulator simulator = new Simulator(board);
        simulator.simulate();
    }
}
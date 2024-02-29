package com.linkedin.javacodechallenges;
import java.util.Scanner;
import java.util.random.*;

import scala.util.Random;

public class DoubleOrNothing {
    public int points = 10;
    public Scanner scanner = new Scanner(System.in);
    public Random random = new Random();
    public int current = points;
    public boolean playing = true;
    public void playGame() {
        // TODO: Implement method
        System.out.println("Let's play Double or Nothing. We'll start you off with " + points + " points\n");
        Continue();
        while (this.playing) {
            System.out.println("Double the points");

            if (shouldDouble()) {
                doubleCurrent();
                System.out.println("Congrats! You now have " + this.current + " points \n");
                Continue();
            } else {
                System.out.println("You've lost. No points for you,");
                return;
            }
        }
    }
    
    public boolean shouldDouble() {
        return this.random.nextInt(2) == 0;
    }
    
    public void doubleCurrent() {
        this.current = this.current * 2;
    }
    public void Continue()
    {
        System.out.println("Would you like to continue ? Enter YES to continue");
        this. playing = this.scanner.nextLine().toUpperCase().equals("YES");
    }
    
    public boolean getIsStillPlaying() {
        return this.playing;
    }
}
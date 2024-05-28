package com.poly.polyapcsafinalproject23_24;

import com.poly.polyapcsafinalproject23_24.GameActivity;

import java.util.Scanner;

public class GameCruzAlejandro extends GameActivity {

    //instance variables
    //   variables you plan to use throughout the adventure
    private Scanner scan;
    private int numLives;
    //private Player player; (optional)


    public void run()
    {
        //initialize number of lives
        numLives = 5;
        //create a scanner object for user input
        scan = new Scanner(System.in);

        //create a player object (optional)
        //player = new Person(...)

        //display project title and description
        Util.clearConsole();
        String text = """
      Halloween mischeif
      For Halloween, you decide to be a complete savage and need to decide, where would you want to cause mischief?
      """;
        System.out.println(text);

        Util.pauseConsole();
        start();
    }

    private void start()
    {
        Util.clearConsole();
        //start adventure here
        String text = """
      You are trying to decide where you are going to go cause some chaos?
      Options
      1. Cemetary
      2. Carnival
      3. Neighborhood
      """;
        System.out.println(text);
        int option = Util.enterInt(1,3);

        if (option == 1)
        {
            goToCemetary();
        }
        else if (option == 2)
        {
            goToCarnival();
        }
        else if (option == 3)
        {
            goToNeighborhood();
        }
    }

    private void goToCemetary()
    {
        Util.clearConsole();
        String text = """
      Once you get there, you start to wonder if you want to keep walking around  or just leave.
      1. Walk around
      2. Leave
      """;
        System.out.println(text);
        int option = Util.enterInt(1,2);

        if (option == 1)
        {
            continueWalkingAround();
        }
        else if (option == 2)
        {
            decideToLeave();
        }
    }


    private void continueWalkingAround()
    {
        Util.clearConsole();
        String text = """
      You find an abandoned house and a shovel and you are trying to decide if you want to trespass and enter the run down home or dig up the tombstones, what will you choose?
      Options
      1. Abandoned home
      2. Dig up the tombstones
      """;
        System.out.println(text);
        int option = Util.enterInt(1,2);

        if (option == 1)
        {
            abandonedHome();
        }
        else if (option == 2)
        {
            digUpTombstones();
        }
    }

    private void digUpTombstones()
    {
        Util.clearConsole();
        String text = """
        Since you decided to dig up the tombstone, it turns out its the tombstone of a sorcerer, and since you disturbed his slumber, he sucks out your life force to replenish his own.Thanks to your insolent bahavior, he rises again and will cause havoc once again...
        
        YOU DIED! Try again!
        """;
        System.out.println(text);
        Util.pauseConsole();
        defeat();
    }

    private void decideToLeave()
    {
        Util.clearConsole();
        String text = """
      You decide to leave, but end up ecountering a person dressed up as a clown  that is holding a machete, what will you do?
      Options
      1. Fight the clown
      2. Submit to the clown
      """;
        System.out.println(text);
        int option = Util.enterInt(1,2);

        if (option == 1)
        {
            fightClown();
        }
        else if (option == 2)
        {
            submitToClown();
        }
    }

    private void fightClown()
    {
        Util.clearConsole();
        String text = """
      You choose to fight the clown, and he's pretty slow and fat, so you take the opportunity to kick him in the nuts, as the clown drops his machete, you   grab it and you stab him in the head, now that you took care of him, you begin to take off and run out of the cemetary, never returning.

      YOU WIN! Try again!
      """;
        System.out.println(text);
        Util.pauseConsole();
        start();
    }


    private void submitToClown()
    {
        Util.clearConsole();
        String text = """
      Why? You too scared to fight back or what, you let him get close.The clown  runs at you, tackles you to the ground, gets up and then slices your throat with the machete he had.Then he continuously stabs you in the chest until you black out.

      YOU DIED! Try again!
      """;
        System.out.println(text);
        Util.pauseConsole();
        defeat();
    }

    private void abandonedHome()
    {
        Util.clearConsole();

        String text = """
      You enter the building and its completely dark, so you try to start a fire with a pair of rocks and a pile of branches and you managed to succeed but due to the cold breeze the fire got bigger and will soon engulf the entire house in flames will you put out the fire or not?
      Options
      1. Put it out
      2. Let it be
      """;
        System.out.println(text);
        int option = Util.enterInt(1,2);

        if (option == 1)
        {
            putItOut();
        }
        else if (option == 2)
        {
            letItBe();
        }
    }

    private void putItOut()
    {
        Util.clearConsole();
        String text = """
      You want to try and put it out, but the fire has gotten too big and you try to leave, but its too late since the flames engulfed the entire house and you begin burning screaming for help, but no one hears you, you continue screaming for help until you are completely burnt to a crisp, meeting a gruesome end.

      YOU DIED! Try again!
      """;
        System.out.println(text);
        Util.pauseConsole();
        defeat();
    }

    private void letItBe()
    {
        Util.clearConsole();
        String text = """
      Instead of putting it out, you just let it be since its an old house, no one will care for an abandoned home, so you just run out of the cemetary with no regrets at all.Fortunately, You were never caught for burning the house.

      YOU WIN! Try again!
      """;
        System.out.println(text);
        Util.pauseConsole();
        start();
    }

    private void goToCarnival()
    {
        Util.clearConsole();
        String text = """
      Once you get there, you have a choice to just play games or make the people's day miserable, what will you choose?
      1. Play Games
      2. Cause chaos
      """;
        System.out.println(text);
        int option = Util.enterInt(1,2);

        if (option == 1)
        {
            playGames();
        }
        else if (option == 2)
        {
            causeChaos();
        }
    }

    private void playGames()
    {
        Util.clearConsole();
        String text = """
      Your trying to play basketball, but there's a long line, do you have the patience to wait in line or cut all the way to the front, which will you choose?
      1. Wait in line
      2. Cut 
      """;
        System.out.println(text);
        int option = Util.enterInt(1,2);

        if (option == 1)
        {
            waitPatiently();
        }
        else if (option == 2)
        {
            cutLine();
        }
    }

    private void cutLine()
    {
        Util.clearConsole();
        String text = """
      You cut to the front of the line, but you're stopped by an individual and pushes you to another person, but that other person punches you in the face, and the people watching you suddenly start jumping you until you go unconscious

      YOU LOSE! Try again!
      """;
        System.out.println(text);
        Util.pauseConsole();
        defeat();
    }

    private void waitPatiently()
    {
        Util.clearConsole();
        String text = """
      After an hour of waiting, its your turn to make a shot, you make a shot and    IT WENT INNNNN RAHHHHHH!!!!! Anyways the man in charge asks you if you want to double-or-nothing or accept your prize of candy?
      1. Double - or - nothing
      2. Accept your prize
      """;
        System.out.println(text);
        int option = Util.enterInt(1,2);

        if (option == 1)
        {
            doubleIt();
        }
        else if (option == 2)
        {
            takeTheWin();
        }
    }

    private void takeTheWin()
    {
        Util.clearConsole();
        String text = """
      Since you wanna be a goofy platooey loser and not take your chances and just go home with a portion of candy, your choices leads to you getting home and having a good amount of sleep.

      YOU WIN! Try again!
      """;
        System.out.println(text);
        Util.pauseConsole();
        start();
    }

    private void doubleIt()
    {

        Util.clearConsole();
        double rand = Math.random();
        if (rand < .30)
        {
            System.out.println("You WON and they give you a wagon full of candy and you eat the candy until you get diabetes, but you don't regret it since you got a W!!!                 YOU WIN! Try again");
        }
        else
        {
            System.out.println("You loss all your candy and the people laugh at you as you run home crying like a baby                               YOU LOSE! Try again");
        }
        System.out.println();
        Util.pauseConsole();
        start();
    }

    private void causeChaos()
    {
        Util.clearConsole();
        String text = """
      Since you want to cause some chaos you have a the option of throwing candy at other people or rekt the carnival stands, which is more of a dick move?
      1. Throw candy at people
      2. Destroy carnival stands
      """;
        System.out.println(text);
        int option = Util.enterInt(1,2);

        if (option == 1)
        {
            throwCandyAtPeople();
        }
        else if (option == 2)
        {
            destroyCarnivalStands();
        }
    }

    private void throwCandyAtPeople()
    {
        Util.clearConsole();
        String text = """
      You steal a bucket of candy from a little kid and start throwing it at people and they seem pretty annoyed about it.The kid you stole candy from starts crying and the parents come in and the dad punches you in the gut and calls security on you but before they kick you out, the dad gives you a beating for your disrespectful behavior.Security finally comes and kicks you out.You shamefully go home. 

      YOU LOSE! Try again!
      """;
        System.out.println(text);
        Util.pauseConsole();
        defeat();
    }

    private void destroyCarnivalStands()
    {
        Util.clearConsole();
        String text = """
      You charge at some carnival stands and you have no idea why the people are angry at you, but security jumps at you and pins you down to the ground and they call the cops on you and your on the ground until they arrive and take you away.You are taken to prison for misconduct behavior and since your there you might as well clean yourself, the guards give you a bar of soap and towel to use while showering, but your not alone, there are other inmates there too.Though its all normal and all until you drop the soap infront of the other inmates, they demand you to PICK UP THE SOAP

      Uh oh....

      You screwed up.. Try again
      """;
        System.out.println(text);
        Util.pauseConsole();
        defeat();
    }

    private void goToNeighborhood()
    {
        Util.clearConsole();
        String text = """
      Since you wanna be basic and be predictable, there's still some mischievous things you can do like breaking into someone's home or Trick-or-treat like a normal person, which is better?
      1. Trespass
      2. Trick-or-treat
      """;
        System.out.println(text);
        int option = Util.enterInt(1,2);

        if (option == 1)
        {
            trespassing();
        }
        else if (option == 2)
        {
            trickOrTreat();
        }
    }

    private void trespassing()
    {
        Util.clearConsole();
        String text = """
      Once you enter the home UNWELCOMED, you hardly can see anything, start looking around for any valuables, but then you suddenly hear footsteps, you begin panicking and are only left with two options go down to the basement or up into the attic, which is best?
      1. Basement
      2. Attic
      """;
        System.out.println(text);
        int option = Util.enterInt(1,2);

        if (option == 1)
        {
            goToBasement();
        }
        else if (option == 2)
        {
            goToAttic();
        }
    }

    private void goToBasement()
    {
        Util.clearConsole();
        String text = """
      Your inside the basement, and something's off, but you begin to find it hard to breathe, but you see a package of rotten fruits that stank up the whole basement since there's no ventilation.You fall to the ground as you suffocate to your demise. 

      YOU LOSE! Try again!
      """;
        System.out.println(text);
        Util.pauseConsole();
        defeat();
    }

    private void goToAttic()
    {
        Util.clearConsole();
        String text = """
      You instead go up into the attic and it's so dark can't see a single thing, and you try to find a light source, but before you can do that, you trip and end falling through the attic and onto the living room landing on your neck, ending you instantly. 

      YOU DIED! Try again!
      """;
        System.out.println(text);
        Util.pauseConsole();
        defeat();
    }

    private void trickOrTreat()
    {
        Util.clearConsole();
        String text = """
      You decide to be normal and trick-or-treat but after trick-or-treating for a while you stumble upon an ominous looking house with no lights on, but you go anyways so you knock on the door and surprisingly someone answers, a women dressed up like a witch, but instead of giving you candy, she gives you an invitation to enter, will you accept? 
      1. Accept
      2. Reject
      """;
        System.out.println(text);
        int option = Util.enterInt(1,2);

        if (option == 1)
        {
            acceptInvitation();
        }
        else if (option == 2)
        {
            goHome();
        }
    }

    private void goHome()
    {
        Util.clearConsole();
        String text = """
      You go home and feel exhausted, so you sleep, you then wake up in a suspicious neighborhood and see a figure across the streets he has a claw as a hand and burned skin, this person was none other than Freddy Krueger.You try to run, but Freddy immediately stops you and teleports you into his own dimension of hell, that's always on fire.You burn up and scream in agony, but you burn for eternity. 

      YOU LOSE! Try again!
      """;
        System.out.println(text);
        Util.pauseConsole();
        defeat();
    }

    private void acceptInvitation()
    {
        Util.clearConsole();
        String text = """
      You decide to enter a home of a stranger, ok why? Anyways when you enter you see nothing wrong, the lady even offers you cookies, you say yes and she brings the cookies and you know they look unedible, absolutely disgusting, will you still eat them?
      1. Yes
      2. No
      """;
        System.out.println(text);
        int option = Util.enterInt(1,2);

        if (option == 1)
        {
            eatFood();
        }
        else if (option == 2)
        {
            noEatFood();
        }
    }

    private void eatFood()
    {
        Util.clearConsole();
        String text = """
      Since your such a gentleman, you eat the cookies then after eating them, she begins telling you her stories, but while your listening, your stomache starts hurting like crazy, so you get up, but your so weaken that you fall to the ground, but the lady smiles at you, telling you that you have been poisoned, as you lay there helpless, she laughs at you for going inside a stranger's house, and calls you stupid as you lay there now dead. 

      YOU DIED! Try again!
      """;
        System.out.println(text);
        Util.pauseConsole();
        defeat();
    }

    private void noEatFood()
    {
        Util.clearConsole();
        String text = """
      After looking at her cookies, you tell her that it smells like shit, and you run off with your bucket of candy.Once you get home you eat the candy you collected by trick-or-treating, being satisfied with halloween this year.

      YOU WIN! Try again!
      """;
        System.out.println(text);
        Util.pauseConsole();
        start();
    }


    private void defeat()
    {
        //run method when defeated


        //lose a life
        numLives--;

        //clear console, display text, etc
        System.out.println("  ");

        //determine if player gets to play again
        if (numLives > 0)
        {
            //if you still have lives, return to start()
            start();
        }
        else
        {
            System.out.println("GAME OVER");
        }
        System.out.println("You loss all your candy and the people laugh at you as you run home crying like a baby             YOU LOSE! Try again");
    }
}
package com.poly.polyapcsafinalproject23_24;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.poly.polyapcsafinalproject23_24.GameActivity;

import java.util.Scanner;

public class GameCruzAlejandro extends GameActivity {

    //instance variables
    //   variables you plan to use throughout the adventure
    private TextView tvTitle, tvSubtitle, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3;
    private int numLives;
    //private Player player; (optional)


    public void run()
    {
        setContentView(R.layout.activity_game_3_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        //initialize number of lives
        numLives = 5;
        //create a scanner object for user input

        //create a player object (optional)
        //player = new Person(...)

        //display project title and description

        tvTitle.setText("Halloween Mischief");
        tvSubtitle.setVisibility(View.INVISIBLE);

        tvStoryText.setText("For Halloween, you decide to be a complete savage and need to decide, where would you want to cause mischief?");

        setAllBtnsVisible();

        btn1.setText("Continue");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start();
            }
        });



    }

    private void setAllBtnsVisible()
    {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
    }

    private void restart() {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn1.setText("Play again");
        btn2.setText("Quit");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GameCruzAlejandro.this, MainActivity.class));
            }
        });
    }

    private void start()
    {

        tvStoryText.setText("You are trying to decide where you are going to go cause some chaos?");

        setAllBtnsVisible();
        btn1.setText("Cemetary");
        btn2.setText("Carnival");
        btn3.setText("Neighborhood");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToCemetary();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToCarnival();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToNeighborhood();
            }
        });

    }

    private void goToCemetary()
    {

        tvStoryText.setText("Once you get there, you start to wonder if you want to keep walking around  or just leave.");

        setAllBtnsVisible();
        btn1.setText("Walk around");
        btn2.setText("Leave");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                continueWalkingAround();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                decideToLeave();
            }
        });

    }


    private void continueWalkingAround()
    {

        tvStoryText.setText("There's an abandoned house and a shovel and you have to choose if you want to enter or dig up the tombstones.");

        setAllBtnsVisible();
        btn1.setText("Abandoned home");
        btn2.setText("Dig up the tombstones");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abandonedHome();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                digUpTombstones();
            }
        });

    }

    private void digUpTombstones()
    {

        tvStoryText.setText("Since you decided to dig up the tombstone, you woke up an ancient sorcerer, and he sucked all your life essence. YOU DIED!");

        setAllBtnsVisible();
        btn1.setText("Try Again");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                defeat();
            }
        });


    }

    private void decideToLeave()
    {

        tvStoryText.setText("You decide to leave but you see a killer clown with a machete, you gonna fight it or not?.");

        setAllBtnsVisible();
        btn1.setText("Fight clown");
        btn2.setText("Submit to clown");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fightClown();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submitToClown();
            }
        });

    }

    private void fightClown()
    {

        tvStoryText.setText("Since the clown is fat, you tire him out and take his weapon and eliminate him, then you run off. YOU WIN!");

        setAllBtnsVisible();
        btn1.setText("Try Again");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { victory();}
        });


    }


    private void submitToClown()
    {

        tvStoryText.setText("Since your frozen in shock, you let him get too close and he slices you throat and you black out. YOU DIED!");

        setAllBtnsVisible();
        btn1.setText("Try Again");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { defeat();}
        });


    }


    private void abandonedHome()
    {

        tvStoryText.setText("You enter the home and it's dark so you start a fire, but it soon got bigger, choose to...");

        setAllBtnsVisible();
        btn1.setText("Put it out");
        btn2.setText("Let it be");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                putItOut();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letItBe();
            }
        });

    }


    private void putItOut()
    {

        tvStoryText.setText("You try to put it out, but the wind make it bigger and it was too late, you were engulfed in the flames. YOU DIED!");

        setAllBtnsVisible();
        btn1.setText("Try Again");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { defeat();}
        });


    }


    private void letItBe()
    {

        tvStoryText.setText("Instead, you let it burn since it's a old home and you were never caught. YOU WIN!");

        setAllBtnsVisible();
        btn1.setText("Try Again");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { victory();}
        });


    }


    private void goToCarnival() {

        tvStoryText.setText("When you get there, you play games or choose you ruin someone's days.");

        setAllBtnsVisible();
        btn1.setText("Play games");
        btn2.setText("Cause chaos");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playGames();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                causeChaos();
            }
        });


    }


    private void playGames() {

        tvStoryText.setText("When you try to play basketball there's a long line, will you cut?");

        setAllBtnsVisible();
        btn1.setText("Wait in line");
        btn2.setText("Cut");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                waitPatiently();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cutLine();
            }
        });


    }


    private void cutLine()
    {

        tvStoryText.setText("Before you make it to the front, you are stopped by an individual and is brutally beaten until you pass out. YOU LOSE!");

        setAllBtnsVisible();
        btn1.setText("Try Again");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { defeat();}
        });


    }


    private void waitPatiently() {

        tvStoryText.setText("After an hour of waiting, you shoots some hoops and earn a prize but someones says double it, will you?");

        setAllBtnsVisible();
        btn1.setText("Double or nothing");
        btn2.setText("Accept your prize");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doubleIt();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                takeTheWin();
            }
        });


    }


    private void takeTheWin()
    {

        tvStoryText.setText("Since you wanna be a loser and not risk it, you take your prize home yay! YOU WIN!");

        setAllBtnsVisible();
        btn1.setText("Try Again");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { victory();}
        });


    }

    private void doubleIt()
    {


        double rand = Math.random();
        if (rand < .30)
        {
            tvStoryText.setText("You WON and they give you a wagon full of candy and you eat the candy until you get diabetes, but you don't regret it since you got a W!!!                 YOU WIN! Try again");
        }
        else
        {
            tvStoryText.setText("You loss all your candy and the people laugh at you as you run home crying like a baby                               YOU LOSE! Try again");
        }

        restart();
    }

    private void causeChaos() {

        tvStoryText.setText("To cause chaos, you steal some candy and throw it at people, what more will you do? ");

        setAllBtnsVisible();
        btn1.setText("Throw more candy");
        btn2.setText("Destroy the carnival stands");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                throwCandyAtPeople();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                destroyCarnivalStands();
            }
        });


    }


    private void throwCandyAtPeople()
    {

        tvStoryText.setText("You keep throwing candy until someone stops you and punches you in the face then they kick you out. YOU LOSE!");

        setAllBtnsVisible();
        btn1.setText("Try Again");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { defeat();}
        });


    }

    private void destroyCarnivalStands()
    {

        String text = """
      You charge at some carnival stands and you have no idea why the people are angry at you, but security jumps at you and pins you down to the ground and they call the cops on you and your on the ground until they arrive and take you away.You are taken to prison for misconduct behavior and since your there you might as well clean yourself, the guards give you a bar of soap and towel to use while showering, but your not alone, there are other inmates there too.Though its all normal and all until you drop the soap infront of the other inmates, they demand you to PICK UP THE SOAP

      Uh oh....

      You screwed up.. Try again
      """;
        System.out.println(text);

        defeat();
    }

    private void goToNeighborhood()
    {

        String text = """
      Since you wanna be basic and be predictable, there's still some mischievous things you can do like breaking into someone's home or Trick-or-treat like a normal person, which is better?
      1. Trespass
      2. Trick-or-treat
      """;
        System.out.println(text);


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

        String text = """
      Once you enter the home UNWELCOMED, you hardly can see anything, start looking around for any valuables, but then you suddenly hear footsteps, you begin panicking and are only left with two options go down to the basement or up into the attic, which is best?
      1. Basement
      2. Attic
      """;
        System.out.println(text);


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

        String text = """
      Your inside the basement, and something's off, but you begin to find it hard to breathe, but you see a package of rotten fruits that stank up the whole basement since there's no ventilation.You fall to the ground as you suffocate to your demise. 

      YOU LOSE! Try again!
      """;
        System.out.println(text);

        defeat();
    }

    private void goToAttic()
    {

        String text = """
      You instead go up into the attic and it's so dark can't see a single thing, and you try to find a light source, but before you can do that, you trip and end falling through the attic and onto the living room landing on your neck, ending you instantly. 

      YOU DIED! Try again!
      """;
        System.out.println(text);

        defeat();
    }

    private void trickOrTreat()
    {

        String text = """
      You decide to be normal and trick-or-treat but after trick-or-treating for a while you stumble upon an ominous looking house with no lights on, but you go anyways so you knock on the door and surprisingly someone answers, a women dressed up like a witch, but instead of giving you candy, she gives you an invitation to enter, will you accept? 
      1. Accept
      2. Reject
      """;
        System.out.println(text);


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

        String text = """
      You go home and feel exhausted, so you sleep, you then wake up in a suspicious neighborhood and see a figure across the streets he has a claw as a hand and burned skin, this person was none other than Freddy Krueger.You try to run, but Freddy immediately stops you and teleports you into his own dimension of hell, that's always on fire.You burn up and scream in agony, but you burn for eternity. 

      YOU LOSE! Try again!
      """;
        System.out.println(text);

        defeat();
    }

    private void acceptInvitation()
    {

        String text = """
      You decide to enter a home of a stranger, ok why? Anyways when you enter you see nothing wrong, the lady even offers you cookies, you say yes and she brings the cookies and you know they look unedible, absolutely disgusting, will you still eat them?
      1. Yes
      2. No
      """;
        System.out.println(text);


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

        String text = """
      Since your such a gentleman, you eat the cookies then after eating them, she begins telling you her stories, but while your listening, your stomache starts hurting like crazy, so you get up, but your so weaken that you fall to the ground, but the lady smiles at you, telling you that you have been poisoned, as you lay there helpless, she laughs at you for going inside a stranger's house, and calls you stupid as you lay there now dead. 

      YOU DIED! Try again!
      """;
        System.out.println(text);

        defeat();
    }

    private void noEatFood()
    {

        String text = """
      After looking at her cookies, you tell her that it smells like shit, and you run off with your bucket of candy.Once you get home you eat the candy you collected by trick-or-treating, being satisfied with halloween this year.

      YOU WIN! Try again!
      """;
        System.out.println(text);

        restart();
    }

    private void victory()
    {

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
            restart();
        }
        else
        {
            System.out.println("GAME OVER");
        }
        System.out.println("You loss all your candy and the people laugh at you as you run home crying like a baby             YOU LOSE! Try again");
    }
}
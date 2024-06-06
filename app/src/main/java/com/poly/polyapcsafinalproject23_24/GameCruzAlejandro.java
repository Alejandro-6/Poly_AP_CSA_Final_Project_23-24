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

        tvStoryText.setText("You grab a baseball bat and destroy the stands, people are angry at you, so they called security on you then called the cops and took you to jail. YOU LOSE!");

        setAllBtnsVisible();
        btn1.setText("Try Again");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { defeat();}
        });


    }


    private void goToNeighborhood() {

        tvStoryText.setText("Since this place is boring, you decide to trespass into someones home or just trick-or-treat like a normal person. Which is better? ");

        setAllBtnsVisible();
        btn1.setText("Trespass");
        btn2.setText("Trick-or-treat");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                trespassing();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                trickOrTreat();
            }
        });


    }


    private void trespassing() {

        tvStoryText.setText("Once you enter unannounced, you to steal something but then you hear someone, you panic, you have to go to either the attic or the basement.What will you choose?");

        setAllBtnsVisible();
        btn1.setText("Basement");
        btn2.setText("Attic");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToBasement();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToAttic();
            }
        });


    }


    private void goToBasement()
    {

        tvStoryText.setText("You enter the basement, and you realize that it's hard to breathe and there is no ventilation, so you begin to fall and suffocate. YOU LOSE!");

        setAllBtnsVisible();
        btn1.setText("Try Again");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { defeat();}
        });


    }


    private void goToAttic()
    {

        tvStoryText.setText("You instead go in the attic and you see nothing, so you try to find the light switch but before you do, the floor breaks and you fall through landing face first, ending you instantly. YOU LOSE!");

        setAllBtnsVisible();
        btn1.setText("Try Again");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { defeat();}
        });


    }



    private void trickOrTreat() {

        tvStoryText.setText("You choose to trick or treat and after a while, you stumble upon an ominous looking home, but you still knock and a lady dressed like a witch answered, she offers to let you inside. Accept?");

        setAllBtnsVisible();
        btn1.setText("Accept");
        btn2.setText("Reject");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                acceptInvitation();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goHome();
            }
        });


    }

    private void goHome()
    {

        tvStoryText.setText("You instead go home because you don't trust strangers and you sleep like a good boy. YOU WIN!");

        setAllBtnsVisible();
        btn1.setText("Try Again");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { victory();}
        });


    }


    private void acceptInvitation() {

        tvStoryText.setText("You enter the STRANGER'S home, and she tells you a fairy tale and while you listen she give you cookies. Will you eat?");

        setAllBtnsVisible();
        btn1.setText("Yes");
        btn2.setText("No");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eatFood();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                noEatFood();
            }
        });


    }



    private void eatFood()
    {

        tvStoryText.setText("Since you eat the food,you continue to listen to her stories, though your stomach starts to hurt like crazy you fall to the ground while the lady watches you suffer. YOU LOSE!");

        setAllBtnsVisible();
        btn1.setText("Try Again");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { defeat();}
        });


    }


    private void noEatFood()
    {

        tvStoryText.setText("You look at her cookies and it smells bad, so you run out of there without looking back. YOU WIN!");

        setAllBtnsVisible();
        btn1.setText("Try Again");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { victory();}
        });


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
package com.example.tictac10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
int button11=0;
    int button12=0;
    int button13=0;
    int button21=0;
    int button22=0;
    int button23=0;
    int button31=0;
    int button32=0;
    int button33=0;
    int TicTac = 1;
    String Choose = "X";
    public void onClick(View view) {
        Button button = findViewById(R.id.button);
        button.setText(Choose);
        button.setClickable(false);

        if(Choose == "0")
        {
            button11 = 2;
        }
        else
        {
            button11 = 1;
        }

        TicTac++;
        if(TicTac% 2 == 0)
        {
            Choose = "0";
        }
        else{
            Choose = "X";
        }
        WinChek();


    }

    public void onClick2(View view) {
        Button button = findViewById(R.id.button2);
        button.setText(Choose);
        button.setClickable(false);
        if(Choose == "0")
        {
            button12 = 2;
        }
        else
        {
            button12 = 1;
        }
        TicTac++;
        if(TicTac% 2 == 0)
        {
            Choose = "0";
        }
        else{
            Choose = "X";
        }
        WinChek();

    }

    public void onClick3(View view) {
        Button button = findViewById(R.id.button3);
        button.setText(Choose);
        button.setClickable(false);
        if(Choose == "0")
        {
            button13 = 2;
        }
        else
        {
            button13 = 1;
        }
        TicTac++;
        if(TicTac% 2 == 0)
        {
            Choose = "0";
        }
        else{
            Choose = "X";
        }
        WinChek();

    }

    public void onClick4(View view) {
        Button button = findViewById(R.id.button4);
        button.setText(Choose);
        button.setClickable(false);
        if(Choose == "0")
        {
            button21 = 2;
        }
        else
        {
            button21 = 1;
        }
        TicTac++;
        if(TicTac% 2 == 0)
        {
            Choose = "0";
        }
        else{
            Choose = "X";
        }
        WinChek();

    }

    public void onClick5(View view) {
        Button button = findViewById(R.id.button5);
        button.setText(Choose);
        button.setClickable(false);
        if(Choose == "0")
        {
            button22 = 2;
        }
        else
        {
            button22 = 1;
        }
        TicTac++;
        if(TicTac% 2 == 0)
        {
            Choose = "0";
        }
        else{
            Choose = "X";
        }
        WinChek();

    }

    public void onClick6(View view) {
        Button button = findViewById(R.id.button6);
        button.setText(Choose);
        button.setClickable(false);
        if(Choose == "0")
        {
            button23 = 2;
        }
        else
        {
            button23 = 1;
        }
        TicTac++;
        if(TicTac% 2 == 0)
        {
            Choose = "0";
        }
        else{
            Choose = "X";
        }
        WinChek();

    }

    public void onClick7(View view) {
        Button button = findViewById(R.id.button7);
        button.setText(Choose);
        button.setClickable(false);
        if(Choose == "0")
        {
            button31 = 2;
        }
        else
        {
            button31 = 1;
        }
        TicTac++;
        if(TicTac% 2 == 0)
        {
            Choose = "0";
        }
        else{
            Choose = "X";
        }
        WinChek();

    }

    public void onClick8(View view) {
        Button button = findViewById(R.id.button8);
        button.setText(Choose);
        button.setClickable(false);
        if(Choose == "0")
        {
            button32 = 2;
        }
        else
        {
            button32 = 1;
        }
        TicTac++;
        if(TicTac% 2 == 0)
        {
            Choose = "0";
        }
        else{
            Choose = "X";
        }
        WinChek();

    }

    public void onClick9(View view) {
        Button button = findViewById(R.id.button9);
        button.setText(Choose);
        button.setClickable(false);
        if(Choose == "0")
        {
            button33 = 2;
        }
        else
        {
            button33 = 1;
        }
        TicTac++;
        if(TicTac% 2 == 0)
        {
            Choose = "0";
        }
        else{
            Choose = "X";
        }
        WinChek();

    }

    public void Ref(View view) {
         button11=0;
         button12=0;
         button13=0;
         button21=0;
         button22=0;
         button23=0;
         button31=0;
         button32=0;
         button33=0;
         TicTac = 1;
         Choose = "X";
        Button button = findViewById(R.id.button);
        button.setClickable(true);
        button.setText("");
        Button button2 = findViewById(R.id.button2);
        button2.setText("");
        button2.setClickable(true);
        Button button3 = findViewById(R.id.button3);
        button3.setText("");
        button3.setClickable(true);
        Button button4 = findViewById(R.id.button4);
        button4.setText("");
        button4.setClickable(true);
        Button button5 = findViewById(R.id.button5);
        button5.setText("");
        button5.setClickable(true);
        Button button6 = findViewById(R.id.button6);
        button6.setText("");
        button6.setClickable(true);
        Button button7 = findViewById(R.id.button7);
        button7.setText("");
        button7.setClickable(true);
        Button button8 = findViewById(R.id.button8);
        button8.setText("");
        button8.setClickable(true);
        Button button9 = findViewById(R.id.button9);
        button9.setText("");
        button9.setClickable(true);
        TextView textView =  findViewById(R.id.textView1);
        textView.setText("");

    }
    public void WinChek(){
        TextView textView = findViewById(R.id.textView1);
        if(button11!=0)
        {
            if (button12!=0)
            {
                if (button13!=0)
                {
                    if (button21!=0)
                    {
                        if (button22!=0)
                        {
                            if (button23!=0)
                            {
                                if (button31!=0)
                                {
                                    if (button32!=0)
                                    {
                                        if (button33!=0)
                                        {
                                            if(button11==1)
                                            {
                                                if(button12==1)
                                                {
                                                    if(button13==1)
                                                    {
                                                        textView.setText("Победа крестиков");
                                                    }
                                                }
                                            }
                                            if(button11==2)
                                            {
                                                if(button12==2)
                                                {
                                                    if(button13==2)
                                                    {
                                                        textView.setText("Победа ноликов");
                                                    }
                                                }
                                            }
                                            if(button11==1)
                                            {
                                                if(button21==1)
                                                {
                                                    if(button31==1)
                                                    {
                                                        textView.setText("Победа крестиков");
                                                    }
                                                }
                                            }
                                            if(button11==2)
                                            {
                                                if(button21==2)
                                                {
                                                    if(button31==2)
                                                    {
                                                        textView.setText("Победа ноликов");
                                                    }
                                                }
                                            }
                                            if(button11==1)
                                            {
                                                if(button22==1)
                                                {
                                                    if(button33==1)
                                                    {
                                                        textView.setText("Победа крестиков");
                                                    }
                                                }
                                            }
                                            if(button11==2)
                                            {
                                                if(button22==2)
                                                {
                                                    if(button33==2)
                                                    {
                                                        textView.setText("Победа ноликов");
                                                    }
                                                }
                                            }
                                            if(button12==1)
                                            {
                                                if(button22==1)
                                                {
                                                    if(button32==1)
                                                    {
                                                        textView.setText("Победа крестиков");
                                                    }
                                                }
                                            }
                                            if(button12==2)
                                            {
                                                if(button22==2)
                                                {
                                                    if(button32==2)
                                                    {
                                                        textView.setText("Победа ноликов");
                                                    }
                                                }
                                            }
                                            if(button13==1)
                                            {
                                                if(button23==1)
                                                {
                                                    if(button33==1)
                                                    {
                                                        textView.setText("Победа крестиков");
                                                    }
                                                }
                                            }
                                            if(button13==2)
                                            {
                                                if(button23==2)
                                                {
                                                    if(button33==2)
                                                    {
                                                        textView.setText("Победа ноликов");
                                                    }
                                                }
                                            }
                                            if(button13==1)
                                            {
                                                if(button22==1)
                                                {
                                                    if(button31==1)
                                                    {
                                                        textView.setText("Победа крестиков");
                                                    }
                                                }
                                            }
                                            if(button13==2)
                                            {
                                                if(button22==2)
                                                {
                                                    if(button31==2)
                                                    {
                                                        textView.setText("Победа ноликов");
                                                    }
                                                }
                                            }
                                            if(button21==1)
                                            {
                                                if(button22==1)
                                                {
                                                    if(button23==1)
                                                    {
                                                        textView.setText("Победа крестиков");
                                                    }
                                                }
                                            }
                                            if(button21==2)
                                            {
                                                if(button22==2)
                                                {
                                                    if(button23==2)
                                                    {
                                                        textView.setText("Победа ноликов");
                                                    }
                                                }
                                            }
                                            if(button31==1)
                                            {
                                                if(button32==1)
                                                {
                                                    if(button33==1)
                                                    {
                                                        textView.setText("Победа крестиков");
                                                    }
                                                }
                                            }
                                            if(button31==2)
                                            {
                                                if(button32==2)
                                                {
                                                    if(button33==2)
                                                    {
                                                        textView.setText("Победа ноликов");
                                                    }
                                                }
                                            }



                                        }

                                    }

                                }

                            }

                        }

                    }

                }
            }
        }
    }

}
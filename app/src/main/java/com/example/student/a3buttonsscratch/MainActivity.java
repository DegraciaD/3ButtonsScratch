package com.example.student.a3buttonsscratch;

import android.content.Context;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static android.R.attr.duration;
import static com.example.student.a3buttonsscratch.R.id.text;

public class MainActivity extends AppCompatActivity {
    public Button button;
    public Button button2;
    public Button button3;
    public Button buttonVariable;

    TextView button1var;
    TextView button2var;
    TextView button3var;
    TextView button4var;
    TextView button5var;
    TextView button6var;
    TextView button7var;
    TextView button8var;
    TextView button9var;
    TextView whoseTurnViewVar;

    int clickState1 = -1;
    int clickState2 = -2;
    int clickState3 = -3;
    int clickState4 = -4;
    int clickState5 = -5;
    int clickState6 = -6;
    int clickState7 = -7;
    int clickState8 = -8;
    int clickState9 = -9;

    int pTurn = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1var = (TextView) findViewById(R.id.button);
        button2var = (TextView) findViewById(R.id.button2);
        button3var = (TextView) findViewById(R.id.button3);
        button4var = (TextView) findViewById(R.id.button4);
        button5var = (TextView) findViewById(R.id.button5);
        button6var = (TextView) findViewById(R.id.button6);
        button7var = (TextView) findViewById(R.id.button7);
        button8var = (TextView) findViewById(R.id.button8);
        button9var = (TextView) findViewById(R.id.button9);
        whoseTurnViewVar = (TextView)findViewById(R.id.changeTurns1);
        Button reset = (Button) findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1var.setText("");
                button2var.setText("");
                button3var.setText("");
                button4var.setText("");
                button5var.setText("");
                button6var.setText("");
                button7var.setText("");
                button8var.setText("");
                button9var.setText("");
                button1var.setClickable(true);
                button2var.setClickable(true);
                button3var.setClickable(true);
                button4var.setClickable(true);
                button5var.setClickable(true);
                button6var.setClickable(true);
                button7var.setClickable(true);
                button8var.setClickable(true);
                button9var.setClickable(true);
                 clickState1 = -1;
                 clickState2 = -2;
                 clickState3 = -3;
                 clickState4 = -4;
                 clickState5 = -5;
                 clickState6 = -6;
                 clickState7 = -7;
                 clickState8 = -8;
                 clickState9 = -9;
                whoseTurnViewVar.setText("It is x's turn");
                Context context = getApplicationContext();
                CharSequence text = "NewGame";
                Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                LinearLayout toastLayout = (LinearLayout) toast.getView();
                TextView toastTV = (TextView) toastLayout.getChildAt(0);
                toastTV.setTextSize(40);
                toast.show();
            }
        });
    }

    public void button3(View view) {
          clickState1 = pTurn;

        if (clickState1 == 0) {
            button1var.setText("x");
        } else {
            button1var.setText("o");
        }
        check3inarow();
        changeTurns();
        button1var.setClickable(false);
    }

    public void button2(View view) {

        clickState2 = pTurn;

        if (clickState2 == 0) {

            button2var.setText("x");
        } else {
            button2var.setText("o");

        }
        check3inarow();
        changeTurns();
        button2var.setClickable(false);
    }

    public void button1(View view) {
        clickState3 = pTurn
;
        if (clickState3 == 0) {

            button3var.setText("x");

        } else {
            button3var.setText("o");

        }
        check3inarow();
        changeTurns();
        button3var.setClickable(false);
    }

    public void button4(View view) {
        clickState4 = pTurn;

        if (clickState4 == 0) {

            button4var.setText("x");

        } else {
            button4var.setText("o");

        }
        check3inarow();
        changeTurns();
        button4var.setClickable(false);
    }

    public void button5(View view) {

        clickState5 = pTurn;

        if (clickState5 == 0) {

            button5var.setText("x");

        } else {
            button5var.setText("o");

        }
        check3inarow();
        changeTurns();
        button5var.setClickable(false);
    }

    public void button6(View view) {

        clickState6 = pTurn;

        if (clickState6 == 0) {

            button6var.setText("x");

        } else {
            button6var.setText("o");

        }
        check3inarow();
        changeTurns();
        button6var.setClickable(false);
    }

    public void button7(View view) {

        clickState7 = pTurn;

        if (clickState7 == 0) {

            button7var.setText("x");

        } else {
            button7var.setText("o");

        }
        check3inarow();
        changeTurns();
        button7var.setClickable(false);
    }

    public void button8(View view) {

        clickState8 = pTurn;

        if (clickState8 == 0) {

            button8var.setText("x");

        } else {
            button8var.setText("o");

        }
        check3inarow();
        changeTurns();
        button8var.setClickable(false);
    }

    public void button9(View view) {

        clickState9 = pTurn;

        if (clickState9 == 0) {

            button9var.setText("x");

        } else {
            button9var.setText("o");

        }
        check3inarow();
        changeTurns();
        button9var.setClickable(false);
    }


    private void check3inarow() {


        if (clickState1 == clickState2 && clickState2 == clickState3) {
            showWinner();

        }
        if (clickState4 == clickState5 && clickState5 == clickState6) {
            showWinner();

        }
        if (clickState7 == clickState8 && clickState8 == clickState9) {
            showWinner();

        }
        if (clickState3 == clickState5 && clickState5 == clickState7) {
            showWinner();

        }
        if (clickState1 == clickState5 && clickState5 == clickState9) {
            showWinner();

        }
        if (clickState1 == clickState4 && clickState4 == clickState7) {
            showWinner();

        }
        if (clickState2 == clickState5 && clickState5 == clickState8) {
            showWinner();
        }
        if (clickState3 == clickState6 && clickState6 == clickState9) {
            showWinner();

        }
        if(clickState1 == clickState2 && clickState2 == clickState3 && clickState4 == clickState4 && clickState5 == clickState5 && clickState6 == clickState6 && clickState7 == clickState7 && clickState8 == clickState8 && clickState9 == clickState9 );
        showWinner();
    }

    private void showWinner(){
        Context context = getApplicationContext();
        CharSequence text;
        if(pTurn ==0)
             text = "x is the winner";
        else
            text = "o is the winner";
         if(pTurn == 0)
        text = "its a tie";
        Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        LinearLayout toastLayout = (LinearLayout) toast.getView();
        TextView toastTV = (TextView) toastLayout.getChildAt(0);
        toastTV.setTextSize(40);
        toast.show();
        button1var.setClickable(false);
        button2var.setClickable(false);
        button3var.setClickable(false);
        button4var.setClickable(false);
        button5var.setClickable(false);
        button6var.setClickable(false);
        button7var.setClickable(false);
        button8var.setClickable(false);
        button9var.setClickable(false);

    }

    private void changeTurns(){
        if(pTurn ==0){
            pTurn = 1;
            whoseTurnViewVar.setText("it is o's turn");
        }
        else {
            pTurn = 0;
            whoseTurnViewVar.setText("it is x's turn");
        }

    }
}
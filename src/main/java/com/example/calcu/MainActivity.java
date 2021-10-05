package com.example.calcu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button bt00, bt01, bt02, bt03, bt04, bt05, bt06,
            bt07, bt08, bt09, btC, btSumar, btRestar,
            btMult, btDiv, btEqual, btM, btPercent, btDot;
    private TextView screen;
    private TextView screenAnswer;
    public char operacion;
    //--------------------------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniciarBotones();
        screen.setText("0");
    }

    //Set botones---------------------------------
    public void iniciarBotones() {
        bt00 = (Button) findViewById(R.id.button_0);
        bt01 = (Button) findViewById(R.id.button_1);
        bt02 = (Button) findViewById(R.id.button_2);
        bt03 = (Button) findViewById(R.id.button_3);
        bt04 = (Button) findViewById(R.id.button_4);
        bt05 = (Button) findViewById(R.id.button_5);
        bt06 = (Button) findViewById(R.id.button_6);
        bt07 = (Button) findViewById(R.id.button_7);
        bt08 = (Button) findViewById(R.id.button_8);
        bt09 = (Button) findViewById(R.id.button_9);
        btC = (Button) findViewById(R.id.button_C);
        btSumar = (Button) findViewById(R.id.button_suma);
        btRestar = (Button) findViewById(R.id.button_rest);
        btMult = (Button) findViewById(R.id.button_multi);
        btDiv = (Button) findViewById(R.id.button_div);
        btEqual = (Button) findViewById(R.id.button_equal);
        btM = (Button) findViewById(R.id.button_back);
        btPercent = (Button) findViewById(R.id.button_percent);
        btDot = (Button) findViewById(R.id.button_dot);
        //Screen
        screen = (TextView) findViewById(R.id.screen);
        screenAnswer = (TextView) findViewById(R.id.respuesta);
        screenAnswer.setText("");
    }

    public void setBt00(View v) {
        if (screen.getText().toString() == "0") {
            screen.setText("0");
        } else {
            screen.setText(screen.getText().toString() + "0");
        }
    }

    public void setBt01(View v) {
        if (screen.getText().toString() == "0") {
            screen.setText("1");
        } else {
            screen.setText(screen.getText().toString() + "1");
        }
    }

    public void setBt02(View v) {
        if (screen.getText().toString() == "0") {
            screen.setText("2");
        } else {
            screen.setText(screen.getText().toString() + "2");
        }
    }

    public void setBt03(View v) {
        if (screen.getText().toString() == "0") {
            screen.setText("3");
        } else {
            screen.setText(screen.getText().toString() + "3");
        }
    }

    public void setBt04(View v) {
        if (screen.getText().toString() == "0") {
            screen.setText("4");
        } else {
            screen.setText(screen.getText().toString() + "4");
        }
    }

    public void setBt05(View v) {
        if (screen.getText().toString() == "0") {
            screen.setText("5");
        } else {
            screen.setText(screen.getText().toString() + "5");
        }
    }

    public void setBt06(View v) {
        if (screen.getText().toString() == "0") {
            screen.setText("6");
        } else {
            screen.setText(screen.getText().toString() + "6");
        }
    }

    public void setBt07(View v) {
        if (screen.getText().toString() == "0") {
            screen.setText("7");
        } else {
            screen.setText(screen.getText().toString() + "7");
        }
    }

    public void setBt08(View v) {
        if (screen.getText().toString() == "0") {
            screen.setText("8");
        } else {
            screen.setText(screen.getText().toString() + "8");
        }
    }

    public void setBt09(View v) {
        if (screen.getText().toString() == "0") {
            screen.setText("9");
        } else {
            screen.setText(screen.getText().toString() + "9");
        }
    }

    public void setBtM(View v) {
        if (screen.getText().length() == 1) {
            screen.setText("0");
        } else {
            screen.setText(screen.getText().toString().substring(0, screen.getText().toString().length() - 1));
        }
    }

    public void setBtDot(View v) {
        if (screen.getText().toString() == "0") {
            screen.setText("0.");
        } else {
            screen.setText(screen.getText().toString() + ".");
        }
    }

    //Set Operaciones-----------------------------
    public void setBtSumar(View v) {
        if (screen.getText().toString() == "0") {
            Toast.makeText(getApplicationContext(), "digite un numero", Toast.LENGTH_SHORT).show();
        } else {
            screen.setText(screen.getText().toString() + "+");
        }
    }

    public void setBtMult(View v) {
        if (screen.getText().toString() == "0") {
            Toast.makeText(getApplicationContext(), "digite un numero", Toast.LENGTH_SHORT).show();
        } else {
            screen.setText(screen.getText().toString() + "*");
        }
    }

    public void setBtRestar(View v) {
        if (screen.getText().toString() == "0") {
            Toast.makeText(getApplicationContext(), "digite un numero", Toast.LENGTH_SHORT).show();
        } else {
            screen.setText(screen.getText().toString() + "-");
        }
    }

    public void setBtDiv(View v) {
        if (screen.getText().toString() == "0") {
            Toast.makeText(getApplicationContext(), "digite un numero", Toast.LENGTH_SHORT).show();
        } else {
            screen.setText(screen.getText().toString() + "/");
        }
    }

    public void setBtC(View v) {
        screenAnswer.setText("");
        screen.setText("0");
    }

    //Parte logica--------------------------------
    public void findTerms(){

    }
    public int findOperator(String onScreen) {
        int indexOperator = 0;
        if (onScreen.contains("+") == true) {
            indexOperator = onScreen.indexOf("+");
            operacion = 's';
        } else if (onScreen.contains("-") == true) {
            indexOperator = onScreen.indexOf("+");
            operacion = 'r';
        } else if (onScreen.contains("*") == true) {
            indexOperator = onScreen.indexOf("+");
            operacion = 'm';
        } else if (onScreen.contains("/") == true) {
            indexOperator = onScreen.indexOf("+");
            operacion = 'd';
        }
        return indexOperator;
    }
    public float term1(int index){
        float num = Float.parseFloat(screen.getText().toString().substring(0, index));
        return num;
    }
    public float term2(int index){
        float num = Float.parseFloat(screen.getText().toString().substring(0, index));
        return num;
    }
    public void setBtEqual(View v) {
        switch (operacion){
            case 's':
                screen.setText(Float.toString(term1(findOperator(screen.getText().toString()))+term2(findOperator(screen.getText().toString()))));
                break;
            case 'r':
                screen.setText(Float.toString(term1(findOperator(screen.getText().toString()))-term2(findOperator(screen.getText().toString()))));
                break;
            case 'm':
                screen.setText(Float.toString(term1(findOperator(screen.getText().toString()))*term2(findOperator(screen.getText().toString()))));
                break;
            case 'd':
                screen.setText(Float.toString(term1(findOperator(screen.getText().toString()))/term2(findOperator(screen.getText().toString()))));
                break;
            default:
                Toast.makeText(getApplicationContext(),"ERROR CATASTROFICO", Toast.LENGTH_SHORT).show();
        }
        term1(findOperator(screen.getText().toString()));

    }
}

package com.fengjustin.custom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, button10, divide, addition, subtract,
            multiply, clear, equal;
    EditText edittext;

    float one, two;

    boolean add, sub, mult, div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 =  findViewById(R.id.button0);
        button1 =  findViewById(R.id.button1);
        button2 =  findViewById(R.id.button2);
        button3 =  findViewById(R.id.button3);
        button4 =  findViewById(R.id.button4);
        button5 =  findViewById(R.id.button5);
        button6 =  findViewById(R.id.button6);
        button7 =  findViewById(R.id.button7);
        button8 =  findViewById(R.id.button8);
        button9 =  findViewById(R.id.button9);
        button10 =  findViewById(R.id.button10);
        addition = findViewById(R.id.buttonadd);
        subtract = findViewById(R.id.buttonsub);
        multiply =  findViewById(R.id.buttonmul);
        divide = findViewById(R.id.buttondiv);
        clear = findViewById(R.id.buttonC);
        equal =  findViewById(R.id.buttoneql);
        edittext =  findViewById(R.id.edit1);

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                two = Float.parseFloat(edittext.getText() + "");

                if (add == true) {
                    edittext.setText(""+one + two );
                    add = false;
                }

                if (sub == true) {
                    edittext.setText(one - two + "");
                    sub = false;
                }

                if (mult == true) {
                    edittext.setText(""+one * two + "");
                    mult = false;
                }

                if (div == true) {
                    edittext.setText(""+one / two + "");
                    div = false;
                }
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "0");
            }
        });

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edittext == null) {
                    edittext.setText("");
                } else {
                    one = Float.parseFloat(edittext.getText() + "");
                    add = true;
                    edittext.setText(null);
                }
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one = Float.parseFloat(edittext.getText() + "");
                sub = true;
                edittext.setText(null);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one = Float.parseFloat(edittext.getText() + "");
                mult = true;
                edittext.setText(null);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one = Float.parseFloat(edittext.getText() + "");
                div = true;
                edittext.setText(null);
            }
        });


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + ".");
            }
        });
    }
}

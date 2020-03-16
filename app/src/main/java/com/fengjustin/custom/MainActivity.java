package com.fengjustin.custom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, button10, divide, addition, subtract,
            multiply, clear, equal;
    TabLayout tablay;
    TabItem inf;
    TabItem welc;
    ViewPager viewpager;
    PagerAdapter pageradapt;
    EditText edittext;
    EditText name;
    TextView displayText;
    Button submitButton;
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
        name=findViewById(R.id.responseEditText);
        displayText=findViewById(R.id.textBox);
        submitButton=findViewById(R.id.clickButton);



        viewpager = findViewById(R.id.viewp);
//        calc=findViewById(R.id.calc);
        inf=findViewById(R.id.info);
        welc=findViewById(R.id.welc);
        tablay=findViewById(R.id.tabBar);
        pageradapt=new PagerAdapter(getSupportFragmentManager(), tablay.getTabCount());
        viewpager.setAdapter(pageradapt);
tablay.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewpager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
});


        final SharedPreferences sharedPreferences = getSharedPreferences("save_name", Context.MODE_PRIVATE);
        String previous_name = sharedPreferences.getString("name", "");
        if(!previous_name.equals("")){
            Gson gson = new Gson();
            displayText.setText("Hello " + gson.fromJson(previous_name, username.class).getText() + "!");
        }
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("testButton","Hi dad! "+name.getText());
                Gson gson = new Gson();
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("name", gson.toJson(new username(name.getText()+"")));
                editor.apply();
                displayText.setText("Hello " + name.getText() + "!");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                two = Float.parseFloat(edittext.getText() + "");

                if (add == true) {
                    edittext.setText(""+(one + two) );
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

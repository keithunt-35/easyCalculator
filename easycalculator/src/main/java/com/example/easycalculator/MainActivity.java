package com.example.easycalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.MenuProvider;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.onClickListener {

    TextView resultTv,solutionTv;
    MaterialButton buttonC, buttonOpenBracket, buttonCloseBracket;
    MaterialButton buttonAdd, buttonMultiply, buttonDivide, buttonSubtract, buttonEquals;
    MaterialButton button0, button1, button2, button3,button4, button5, button6, button7, button8, button9;
    MaterialButton buttonAC, buttonPoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        resultTv = findViewById(R.id.result_tv);
        solutionTv = findViewById(R.id.solution_tv);

        assignId(button0, R.id.button_0);
        assignId(button1, R.id.button_1);
        assignId(button2, R.id.button_2);
        assignId(button3, R.id.button_3);
        assignId(button4, R.id.button_4);
        assignId(button5, R.id.button_5);
        assignId(button6, R.id.button_6);
        assignId(button7, R.id.button_7);
        assignId(button8, R.id.button_8);
        assignId(button9, R.id.button_9);
        assignId(buttonC, R.id.button_c);
        assignId(buttonAC, R.id.button_AC);
        assignId(buttonCloseBracket, R.id.button_close_bracket);
        assignId(buttonOpenBracket, R.id.button_open_bracket);
        assignId(buttonAdd, R.id.button_add);
        assignId(buttonSubtract, R.id.button_subtract);
        assignId(buttonMultiply, R.id.button_multiply);
        assignId(buttonDivide, R.id.button_divide);
        assignId(buttonPoint, R.id.button_point);
        assignId(buttonEquals, R.id.button_equals);


    }

    void assignId(MaterialButton btn, int id){
        btn = findViewById(id);
        btn.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void addMenuProvider(@NonNull MenuProvider provider, @NonNull LifecycleOwner owner, @NonNull Lifecycle.State state) {

    }

    @Override
    public void onClick(View view){
        MaterialButton button =(MaterialButton) view;
        String buttonText = (String) button.getText().toString();
    }
}
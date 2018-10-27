package com.codepath.myflashcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class AddQuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_question);

        findViewById(R.id.close_adding_question_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        findViewById(R.id.save_question).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent data = new Intent();
                data.putExtra("new_question", ((EditText) findViewById(R.id.edit_question_field)).getText().toString());
                data.putExtra("new_answer",((EditText) findViewById(R.id.edit_answer_field)).getText().toString());
                setResult(RESULT_OK,data);
                finish();
            }
        });

    }
}

package com.example.android.booklisting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//I start adapting from Udacity's Earthquake.
public class MainActivity extends AppCompatActivity {

    private Button buttonGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        buttonGo = (Button) findViewById(R.id.buttonGo);
        buttonGo.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                TextView txtName = (EditText) findViewById(R.id.txtName);
                String auxiliar = txtName.getText().toString();

                if (auxiliar.equals("")) {
                    TextView textView = (TextView) findViewById(R.id.txtTitle);
                    textView.setText(R.string.no_data);
                } else {

                    Intent i = new Intent(MainActivity.this, BookActivity.class);
                    i.putExtra("NAME", auxiliar);
                    startActivity(i);
                }
            }
        });
    }
}

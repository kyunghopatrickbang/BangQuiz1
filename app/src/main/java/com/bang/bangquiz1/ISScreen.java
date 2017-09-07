package com.bang.bangquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ISScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.isscreen);
    }

    public void nextActivity1(View view)
    {
        Intent intent = new Intent(this, ActivityMainScreen.class);
        startActivity(intent);
    }

    public void nextActivity2(View view)
    {
        Intent intent = new Intent(this, CSScreen.class);
        startActivity(intent);
    }

    public void nextActivity3(View view)
    {
        Intent intent = new Intent(this, ITScreen.class);
        startActivity(intent);
    }
}

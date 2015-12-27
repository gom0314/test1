package com.example.youngkyoung.test1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by YoungKyoung on 2015-12-23.
 */
public class MainActivity extends AppCompatActivity
{
    protected void onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.btn_page1:
                Intent intent1 = new Intent(this, Login_Activity.class);
                startActivity(intent1);
                break;

            case R.id.btn_vibration:
                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(3000);
                break;

            case R.id.btn_wait:
                Intent intent2 = new Intent(this, Login_Activity.class);
                startActivity(intent2);
                break;
        }
    }
}

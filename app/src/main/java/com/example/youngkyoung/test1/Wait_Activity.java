package com.example.youngkyoung.test1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

/**
 * Created by YoungKyoung on 2015-12-27.
 */
public class Wait_Activity extends AppCompatActivity {
    public  void onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.wait);
       requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        Loading();
    }

    private void Loading()
    {
        Handler handler = new Handler() {
            @Override
            public void close() {

            }

            @Override
            public void flush() {

            }

            @Override
            public void publish(LogRecord record) {

            }
        };
    }
}

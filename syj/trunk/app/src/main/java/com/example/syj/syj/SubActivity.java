package com.example.syj.syj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by jin on 2015-12-18.
 */
public class SubActivity extends Activity{
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        intent = getIntent();
        Person person=(Person)intent.getSerializableExtra("신상");
        TextView tx1= (TextView)findViewById(R.id.t1);
        tx1.setText(person.toString());


    }

    public void btn2(View view) {
        finish();
    }
}

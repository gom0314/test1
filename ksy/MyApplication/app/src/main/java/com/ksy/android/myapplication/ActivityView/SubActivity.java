package com.ksy.android.myapplication.ActivityView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.ksy.android.myapplication.R;
import com.ksy.android.myapplication.to.User;

/**
 * Created by KSY on 2015-12-26.
 */
public class SubActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        Intent intent = getIntent();

        User user = (User)intent.getSerializableExtra("user");
        TextView textView = (TextView)findViewById(R.id.text1);
        textView.setText(user.getUserId());

        Toast.makeText(this, "로그인 성공!!", Toast.LENGTH_SHORT).show();

    }
}

package com.ksy.android.myapplication.ActivityView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.ksy.android.myapplication.R;
import com.ksy.android.myapplication.to.User;


public class MainActivity extends AppCompatActivity {

    User user = null;

    EditText idText = null;
    EditText pwText = null;

    Vibrator vibrator = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idText = (EditText)findViewById(R.id.id);

        pwText = (EditText)findViewById(R.id.pw);

        vibrator = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);


    }
    public void onClick(View view)
    {

        switch (view.getId())
        {
            case R.id.login :

                if(login() == true)
                {
                    Log.d("true","true");
                    Intent intent1 = new Intent(this,SubActivity.class);
                    intent1.putExtra("user",user);
                    startActivity(intent1);

                }
                else
                {
                    Log.d("false","false");
                    Toast.makeText(this,"아이디와 패스워드를 확인하세요.",Toast.LENGTH_SHORT).show();
                    vibrator.vibrate(500);
                }
                Log.d("test", login() + ":" + user.getUserId()+":"+user.getUserPw());

                break;
            case R.id.reset :

                Toast.makeText(this,"데이터를 리셋합니다.", Toast.LENGTH_SHORT).show();

                idText.setText("");
                pwText.setText("");
                vibrator.vibrate(500);
                break;

        }
    }
    private Boolean login()
    {
        user = new User();

        user.setUserId(idText.getText().toString());
        user.setUserPw(pwText.getText().toString());


        return user.accessLogin();
    }


}

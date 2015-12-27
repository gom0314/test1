package com.example.youngkyoung.test1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

/**
 * Created by YoungKyoung on 2015-12-27.
 */
public class Login_Activity extends AppCompatActivity {
    protected  void onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.login);
    }
    public void onClick(View v)
    {
        EditText editId = (EditText) findViewById(R.id.edit_id);
        String id = editId.getText().toString();

        Intent intent = new Intent(this, Login01_Activity.class);
        intent.putExtra("입력한 id", id);
        startActivity(intent);
        Log.v("버튼", "아이디 입력했습니다.");


        EditText editPw = (EditText) findViewById(R.id.edit_password);
        String pw = editId.getText().toString();

        Intent intent1 = new Intent(this, Login01_Activity.class);
        intent.putExtra("입력한 pw", pw);
        startActivity(intent);
        Log.v("버튼", "비번 입력했습니다.");
    }
}
package com.example.youngkyoung.test1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by YoungKyoung on 2015-12-27.
 */
public class Login01_Activity extends AppCompatActivity
{
    RadioGroup radio;

    protected void onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.login01);

        Intent intent = getIntent();
        String id = intent.getStringExtra("입력한 id");

        Intent intent1 = getIntent();
        String pw = intent.getStringExtra("입력한 pw");

        if (id.equals("")||pw.equals(""))
            Toast.makeText(this, "입력한 아이디이나 비밀번호가 없습니다!", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this, "입력한 아이디는" +id+ "이고, 입력한 비번은"+pw+"입니다.", Toast.LENGTH_LONG).show();
    }

    public void onClick(View view)
    {

        if(view.getId()==R.id.btn_back)
        {
            Intent intent1 = new Intent(this, MainActivity.class);
            startActivity(intent1);
        }
    }

    public void onCheckedChanged(RadioGroup radio, int checkedld)
    {
        if(radio.getCheckedRadioButtonId() ==R.id.radio1)
            Toast.makeText(this,"1",Toast.LENGTH_SHORT).show();
        if(radio.getCheckedRadioButtonId() ==R.id.radio2)
            Toast.makeText(this,"2",Toast.LENGTH_SHORT).show();
        if(radio.getCheckedRadioButtonId() ==R.id.radio3)
            Toast.makeText(this,"3",Toast.LENGTH_SHORT).show();
    }
}

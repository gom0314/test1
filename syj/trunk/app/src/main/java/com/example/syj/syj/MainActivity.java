package com.example.syj.syj;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Vibrator vibrator;
    Intent intent;
    EditText editid;
    EditText editpw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        editid= (EditText)findViewById(R.id.edit_id);
        editpw= (EditText)findViewById(R.id.edit_pw);
        Button btnlogin= (Button)findViewById(R.id.btnlogin);
        vibrator = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        intent= new Intent(this,SubActivity.class);

        editid.setText("ID를 입력해주세요");
        editpw.setText("PW를 입력해주세요");

        View.OnClickListener listener =new View.OnClickListener(){

            @Override
        public void onClick(View v){

                switch (v.getId()){
                    case R.id.edit_id:
                        editid.setText("");
                        break;
                    case R.id.edit_pw:
                        editpw.setText("");
                        break;
                }


            }

        };

        editid.setOnClickListener(listener);
        editpw.setOnClickListener(listener);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnlogin :
                    Toast.makeText(this, "id:syj\npw:0823", Toast.LENGTH_SHORT).show() ;
                    vibrator.vibrate(3000);
                break;
            case R.id.blogin :
                intent.putExtra("신상", new Person(editid.getText().toString(),"30","남"));
                startActivityForResult(intent,0);
                break;
        }
    }
}
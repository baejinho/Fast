package com.apphunger.baejinho.fast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText loginId;
    EditText loginPwd;

    String id = "Test0";
    String pwd = "Test00";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        loginId =  (EditText)findViewById(R.id.loginid);
        loginPwd =  (EditText)findViewById(R.id.loginpwd);
        Button loginBtn = (Button) findViewById(R.id.loginbtn);


        loginBtn.setOnClickListener(l);

    }

    View.OnClickListener l = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(v.getId()==R.id.loginbtn){
                //Toast.makeText(v.getContext(),""+loginId.getText().toString(),Toast.LENGTH_SHORT).show();
                //Toast.makeText(v.getContext(), "" + loginPwd.getText().toString(), Toast.LENGTH_SHORT).show();

                if(loginId.getText().toString().equals(id)&&loginPwd.getText().toString().equals(pwd)) {
                    Toast.makeText(v.getContext(), "로그인에 성공하셨습니다", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(MainActivity.this, Taste.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(v.getContext(), "로그인에 실패하셨습니다", Toast.LENGTH_SHORT).show();

                }
            }
        }
    };

}

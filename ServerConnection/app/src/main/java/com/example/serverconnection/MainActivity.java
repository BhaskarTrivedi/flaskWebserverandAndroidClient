package com.example.serverconnection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button mLogin;
    private UserInfo usr;
    private ConnectServer cntsvr;
    private EditText usrNameEditText;
    private EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLogin = findViewById(R.id.Main_Login_Buttonid);
        usrNameEditText = findViewById(R.id.UserName_PlainTextID);
        passwordEditText = findViewById(R.id.Password_PainTextId);
        usr = new UserInfo();
        cntsvr = new ConnectServer();
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.Main_Login_Buttonid:
                String usrName = usrNameEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                boolean usrN = usr.checkUser(usrName);
                boolean psd = usr.checkPassword(password);
                cntsvr.SendSearchData("Hello XYZ ABC");
                // Do something
        }
    }
}

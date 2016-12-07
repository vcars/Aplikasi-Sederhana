package com.example.ahmadzulfikar.aplikasinilai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText usernamee , password;
    Button login;

    int username1 = 50414623;
    int password1 = 1996;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernamee = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.pass);
        login = (Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int user = Integer.parseInt(usernamee.getText().toString());
                int passwo = Integer.parseInt(password.getText().toString());





                if ( user == username1 &&  passwo == password1) {

                    Toast.makeText(MainActivity.this ,"Login Anda Berhasil",Toast.LENGTH_LONG).show();

                    Intent i = new Intent(getApplicationContext(),Hal2.class);
                    startActivity(i);
            }
                else {

                    Toast.makeText(MainActivity.this,"Username atau Password anda salah",Toast.LENGTH_LONG).show();

                }
}
});
    }
}

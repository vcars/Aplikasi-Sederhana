package com.example.ahmadzulfikar.aplikasinilai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Hal2 extends AppCompatActivity {
    EditText ET_Uts , ET_Uas ;
    Button BT;
    int hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal2);

        ET_Uts = (EditText) findViewById(R.id.uts);
        ET_Uas = (EditText) findViewById(R.id.uas);
        BT = (Button) findViewById(R.id.Hasil);

        BT.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                int uts = Integer.parseInt(ET_Uts.getText().toString());
                int uas = Integer.parseInt(ET_Uas.getText().toString());
                hasil = uts*70/100 +uas*30/100;

                if (hasil<50){

                    Toast.makeText(Hal2.this, "Nilai Anda " + String.valueOf(hasil)+"  "+"Maka Grade Anda"+"  E", Toast.LENGTH_LONG).show();
                }

                else if (hasil<60) {

                    Toast.makeText(Hal2.this, "Nilai Anda " + String.valueOf(hasil)+"  "+"Maka Grade Anda "+"  D",Toast.LENGTH_LONG).show();
                }

                else if (hasil<70){
                    Toast.makeText(Hal2.this, "Nilai Anda " + String.valueOf(hasil)+"  "+"Maka Grade Anda "+"  C",Toast.LENGTH_LONG).show();

                }

                else if (hasil<80){
                    Toast.makeText(Hal2.this, "Nilai Anda " + String.valueOf(hasil)+"  "+"Maka Grade Anda "+"  B",Toast.LENGTH_LONG).show();
                }

                else if (hasil>=80){
                    Toast.makeText(Hal2.this, "Nilai Anda " + String.valueOf(hasil)+"  "+"Maka Grade Anda "+"  A",Toast.LENGTH_LONG).show();
                }

            }











        } );
    }
}

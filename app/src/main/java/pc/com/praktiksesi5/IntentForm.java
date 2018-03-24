package pc.com.praktiksesi5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.id;

public class IntentForm extends AppCompatActivity {

    EditText nama, alamat, email, notelp;
    RadioButton jk1, jk2;
    RadioGroup rbJkGrup;
    Button proses;
    int jkVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_form);

        nama = (EditText) findViewById(R.id.namaEt);
        alamat = (EditText) findViewById(R.id.alamatEt);
        email = (EditText) findViewById(R.id.emailEt);
        notelp = (EditText) findViewById(R.id.notelpEt);
        jk1 = (RadioButton) findViewById(R.id.laki2Rb);
        jk2 = (RadioButton) findViewById(R.id.wanitaRb);
        rbJkGrup = (RadioGroup) findViewById(R.id.rbJkGrup);
        proses = (Button) findViewById(R.id.prosesBtn);

        //default radio button
        rbJkGrup.check(R.id.laki2Rb);
        jkVal = 0;

        //pilih radio button
        jk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jkVal = 0;
            }
        });
        jk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jkVal = 1;
            }
        });

        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), jkVal+" selected", Toast.LENGTH_SHORT).show();


//                String[] val = {"nama", "alamat", "email", "no.telp", "jenis kelamin"};
                //cari Intent pakai arrayList
                String[] data2 = new String[ 5 ];
                data2 [0] = nama.getText().toString();
                data2 [1] = alamat.getText().toString();
                data2 [2] = email.getText().toString();
                data2 [3] = notelp.getText().toString();
                data2 [4] = String.valueOf( jkVal );

                Intent intent = new Intent(getApplicationContext(), IntentTujuan.class);
                intent.putExtra("data_kiriman", data2 );
                startActivity(intent);

                //cek data that stored in array
//                for(int i=0; i<datas.length; i++){
//                    Toast.makeText(getApplicationContext(), ""+datas[i], Toast.LENGTH_SHORT).show();
//                }

            }
        });

    }
}

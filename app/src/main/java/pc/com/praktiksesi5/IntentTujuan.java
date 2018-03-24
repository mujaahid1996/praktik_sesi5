package pc.com.praktiksesi5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class IntentTujuan extends AppCompatActivity {

    TextView nama, alamat, email, notelp, jk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_tujuan);

        nama = (TextView) findViewById(R.id.namaTv);
        alamat = (TextView) findViewById(R.id.alamatTv);
        email = (TextView) findViewById(R.id.emailTv);
        notelp = (TextView) findViewById(R.id.notelpTv);
        jk= (TextView) findViewById(R.id.jkTv);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String[] values = bundle.getStringArray("data_kiriman");

        nama.setText( values[0] );
        alamat.setText( values[1] );
        email.setText( values[2] );
        notelp.setText( values[3] );
//        jk.setText( values[4] );
        if (values[4].equals("1")) {
            jk.setText(R.string.wanita);
        }else{
            jk.setText(R.string.laki_laki);
        }


    }
}

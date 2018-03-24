package pc.com.praktiksesi5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonForm extends AppCompatActivity {

    RadioButton passTextRb, passNumberRb;
    RadioGroup radioGroup;
    Button loginBtn;
    EditText usernameEt, passwordEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button_form);

        passTextRb = (RadioButton) findViewById(R.id.passTextType);
        passNumberRb = (RadioButton) findViewById(R.id.passNumberType);
        radioGroup = (RadioGroup) findViewById(R.id.rbGrup);
        usernameEt = (EditText) findViewById(R.id.usernameEt);
        passwordEt = (EditText) findViewById(R.id.passEt);
        loginBtn = (Button) findViewById(R.id.loginBtn);

        //default radio button
        radioGroup.check(R.id.passTextType);
        passwordEt.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        passwordEt.setText("");

        passTextRb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "password tipe text dipilih", Toast.LENGTH_SHORT).show();
                passwordEt.setInputType(InputType.TYPE_CLASS_TEXT |
                        InputType.TYPE_TEXT_VARIATION_PASSWORD);
                passwordEt.setText("");

            }
        });

        passNumberRb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "password tipe nomor dipilih", Toast.LENGTH_SHORT).show();
                passwordEt.setInputType(InputType.TYPE_CLASS_NUMBER |
                        InputType.TYPE_NUMBER_VARIATION_PASSWORD);
                passwordEt.setText("");
            }
        });

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernameVal = usernameEt.getText().toString().trim();
                String passwordVal = passwordEt.getText().toString().trim();

                if (usernameVal.equals("user") && passwordVal.equals("aman")) {
                    Intent intent = new Intent(getApplicationContext(), IntentForm.class);
                    startActivity(intent);

                } else {
                    Toast.makeText(getApplicationContext(),
                            "Username dan Password Salah. Cek Kembali", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}

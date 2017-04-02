package app.com.example.android.validasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText angka1,angka2;
    TextView hasil;
    Button proses;

    Integer Angka1, Angka2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka1 = (EditText)findViewById(R.id.edt_main_angka1);
        angka2 = (EditText)findViewById(R.id.edt_main_angka2);
        hasil = (TextView)findViewById(R.id.hasil);
        proses = (Button)findViewById(R.id.proses);

        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hitung();
            }
        });
    }

    public void Ok(View view) {

    }

    public  void Hitung(){
        if(!validasi()){
            return;
        }
        if(!validasi()){
            return;
        }
            try {
                Angka1 = Integer.parseInt(angka1.getText().toString());
            }catch (Exception e) {
                Toast.makeText(this, "angka 1 harus diisi", Toast.LENGTH_SHORT).show();
                return;
            }
        try {
            Angka2 = Integer.parseInt(angka2.getText().toString());
        }catch (Exception e) {
            Toast.makeText(this, "angka 2 harus diisi", Toast.LENGTH_SHORT).show();
            return;
        }

        Integer hasilpenjumlahan = Angka1 + Angka2;
        hasil.setText(String.valueOf(hasilpenjumlahan));
        }
    public boolean validasi () {
        if(angka1.getText().toString().isEmpty()) {
            Toast.makeText(this, "angka 1 harus diisi", Toast.LENGTH_SHORT).show();
            return false;
        }
        if(angka2.getText().toString().isEmpty()) {
            Toast.makeText(this, "angka 2 harus diisi", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    }

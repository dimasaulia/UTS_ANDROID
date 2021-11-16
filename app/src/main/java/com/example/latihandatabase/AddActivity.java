package com.example.latihandatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {

    EditText nama, alamat, nik, tempat_lahir, tanggal_lahir, agama, telepon, kepala_keluarga;
    Button add_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        nama = findViewById(R.id.nama_input);
        alamat = findViewById(R.id.alamat_input);
        nik = findViewById(R.id.nik_input);
        tempat_lahir = findViewById(R.id.tempat_lahir);
        tanggal_lahir = findViewById(R.id.tanggal_lahir);
        agama = findViewById(R.id.agama);
        telepon = findViewById(R.id.tlp);
        kepala_keluarga = findViewById(R.id.kepala_keluarga);
        add_button = findViewById(R.id.update_button);

        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDatabaseHelper myDB = new MyDatabaseHelper(AddActivity.this);
                myDB.addData(nama.getText().toString().trim(),
                        alamat.getText().toString().trim(),
                        Integer.valueOf(nik.getText().toString().trim()),
                        tempat_lahir.getText().toString().trim(),
                        tanggal_lahir.getText().toString().trim(),
                        agama.getText().toString().trim(),
                        telepon.getText().toString().trim(),
                        kepala_keluarga.getText().toString().trim()
                );
            }
        });
    }
}
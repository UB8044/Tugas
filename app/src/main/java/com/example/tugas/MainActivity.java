package com.example.tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private SimpleDateFormat dateFormatter;
    private TextView dateResult;

    Button daftar, back;
    EditText FN, SN, TL, Tgl, Almt, Telp, Email, Pass, Pass2;

    private void showDateDialog(){
        Calendar calendar = Calendar.getInstance();
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                Calendar date = Calendar.getInstance();
                date.set(year, month, dayOfMonth);

                dateResult.setText(dateFormatter.format(date.getTime()));
            }
        }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        dateResult = (TextView) findViewById(R.id.editTglLahir);
        Tgl = (EditText) findViewById(R.id.editTglLahir);

        dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        dateResult = (TextView) findViewById(R.id.editTglLahir);
        Tgl = (EditText) findViewById(R.id.editTglLahir);
        Tgl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDateDialog();
            }
        });

        daftar = findViewById(R.id.btnDaftar);
        back = findViewById(R.id.btnBack);
        FN = findViewById(R.id.editFN);
        SN = findViewById(R.id.editSN);
        TL = findViewById(R.id.editTmptLahir);
        Telp = findViewById(R.id.editTlpn);
        Almt = findViewById(R.id.editAlamat);
        Email = findViewById(R.id.editEmail);
        Pass = findViewById(R.id.editPass);
        Pass2 = findViewById(R.id.editPass2);
        JK = findViewById(R.id.jenisKelamin);
        Agama = findViewById(R.id.agama);

        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first_name = FN.getText().toString();
                String second_name = SN.getText().toString();
                String tempat_lahir = TL.getText().toString();
                String tanggal_lahir = dateResult.getText().toString();
                String alamat = Tgl.getText().toString();
                String telepon = Telp.getText().toString();
                String email = Email.getText().toString();
                String password = Pass.getText().toString();
                String pass_pattern = "a-zA-Z0-9@,&;#";
                String password2 = Pass.getText().toString();
                int jKelamin = JK.getCheckedRadioButtonId();
                RadioButton jk = findViewById(jKelamin);

                if (first_name.isEmpty()){
                    FN.setError("Nama Depan Harus Diisi");
                    FN.requestFocus();
                    SN.setError("Nama Belakang Harus Diisi");
                    SN.requestFocus();
                    TL.setError("Tempat Lahir Harus Diisi");
                    TL.requestFocus();
                    Tgl.setError("Tanggal Lahir Harus Diisi");
                    Tgl.requestFocus();
                    Almt.setError("Alamat Harus Diisi");
                    Almt.requestFocus();
                    Telp.setError("Nomor Telepon Harus Diisi");
                    Telp.requestFocus();
                    Email.setError("Email Harus Diisi");
                    Email.requestFocus();
                    Pass.setError("Password Harus Diisi");
                    Pass.requestFocus();

                } else if (second_name.isEmpty()){
                    SN.setError("Nama Belakang Harus Diisi");
                    SN.requestFocus();
                    TL.setError("Tempat Lahir Harus Diisi");
                    TL.requestFocus();
                    Tgl.setError("Tanggal Lahir Harus Diisi");
                    Tgl.requestFocus();
                    Almt.setError("Alamat Harus Diisi");
                    Almt.requestFocus();
                    Telp.setError("Nomor Telepon Harus Diisi");
                    Telp.requestFocus();
                    Email.setError("Email Harus Diisi");
                    Email.requestFocus();
                    Pass.setError("Password Harus Diisi");
                    Pass.requestFocus();

                } else if (tempat_lahir.isEmpty()){
                    TL.setError("Tempat Lahir Harus Diisi");
                    TL.requestFocus();
                    Tgl.setError("Tanggal Lahir Harus Diisi");
                    Tgl.requestFocus();
                    Almt.setError("Alamat Harus Diisi");
                    Almt.requestFocus();
                    Telp.setError("Nomor Telepon Harus Diisi");
                    Telp.requestFocus();
                    Email.setError("Email Harus Diisi");
                    Email.requestFocus();
                    Pass.setError("Password Harus Diisi");
                    Pass.requestFocus();

                } else if (tanggal_lahir.isEmpty()){
                    Tgl.setError("Tanggal Lahir Harus Diisi");
                    Tgl.requestFocus();
                    Almt.setError("Alamat Harus Diisi");
                    Almt.requestFocus();
                    Telp.setError("Nomor Telepon Harus Diisi");
                    Telp.requestFocus();
                    Email.setError("Email Harus Diisi");
                    Email.requestFocus();
                    Pass.setError("Password Harus Diisi");
                    Pass.requestFocus();

                } else if (alamat.isEmpty()){
                    Almt.setError("Tanggal Lahir Harus Diisi");
                    Almt.requestFocus();
                    Telp.setError("Nomor Telepon Harus Diisi");
                    Telp.requestFocus();
                    Email.setError("Email Harus Diisi");
                    Email.requestFocus();
                    Pass.setError("Password Harus Diisi");
                    Pass.requestFocus();

                } else if (telepon.isEmpty()){
                    Telp.setError("Nomor Telepon Harus Diisi");
                    Telp.requestFocus();
                    Email.setError("Email Harus Diisi");
                    Email.requestFocus();
                    Pass.setError("Password Harus Diisi");
                    Pass.requestFocus();

                } else if (email.isEmpty()){
                    Email.setError("Email Harus Diisi");
                    Email.requestFocus();
                    Pass.setError("Password Harus Diisi");
                    Pass.requestFocus();

                } else if (password.isEmpty()){
                    Pass.setError("Password Harus Diisi");
                    Pass.requestFocus();

                } else if (password.length() < 8 || !password.matches(pass_pattern)) {
                    Pass.setError("Panjang password minimal adalah 8 karakter dengan angka, huruf besar, huruh kecil dan spesial karakter (seperti: @,&amp;,#,?)");
                    Pass.requestFocus();

                } else if (!password2.equals(password)) {
                    Pass2.setError("Password Harus Sama");
                    Pass2.requestFocus();

                } else {
                    Toast.makeText(getApplicationContext(), "Pendaftaran Berhasil", Toast.LENGTH_LONG).show();
                }
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }

    RadioGroup JK, Agama;

    public void radioButtonJK(View v){
        setContentView(R.layout.activity_main);
        boolean cek = ((RadioButton) v).isChecked();

        switch (v.getId()){
            case R.id.btnL:
                if (cek){
                    break;
                }
            case R.id.btnP:
                if (cek){
                    break;
                }
        }
    }

    public void radioButtonAgama(View v){
        boolean cek = ((RadioButton) v).isChecked();

        switch (v.getId()){
            case R.id.islam:
                if (cek){
                    break;
                }
            case R.id.katolik:
                if (cek){
                    break;
                }
            case R.id.buddha:
                if (cek){
                    break;
                }
            case R.id.other:
                if (cek){
                    break;
                }
            case R.id.kristen:
                if (cek){
                    break;
                }
            case R.id.hindu:
                if (cek){
                    break;
                }
            case R.id.konghucu:
                if (cek){
                    break;
                }
        }
    }
}

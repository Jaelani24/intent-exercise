package id.ac.polinema.intentexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    public static final String FULLNAME_KEY = "fullname";
    public static final String EMAIL_KEY = "email";
    public static final String PASSWORD_KEY = "password";
    public static final String CONFIRM_PASSWORD_KEY = "confirm_password";
    public static final String HOMEPAGE_KEY = "homepage";
    public static final String ABOUT_KEY = "about";

    private EditText isiFullname;
    private EditText isiEmail;
    private EditText isiPassword;
    private EditText isiConfirmPassword;
    private EditText isiHomepage;
    private EditText isiAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        isiFullname = findViewById(R.id.text_fullname);
        isiEmail = findViewById(R.id.text_email);
        isiPassword = findViewById(R.id.text_password);
        isiConfirmPassword = findViewById(R.id.text_confirm_password);
        isiHomepage = findViewById(R.id.text_homepage);
        isiAbout = findViewById(R.id.text_about);
    }

    public void handleSubmit(View view) {
        String fullname = isiFullname.getText().toString();
        String email = isiEmail.getText().toString();
        String password = isiPassword.getText().toString();
        String confirm_password = isiConfirmPassword.getText().toString();
        String homepage = isiHomepage.getText().toString();
        String about = isiAbout.getText().toString();

        if(TextUtils.isEmpty(fullname) || TextUtils.isEmpty(email) || TextUtils.isEmpty(password) || TextUtils.isEmpty(confirm_password) || TextUtils.isEmpty(homepage) || TextUtils.isEmpty(about)){
            MyAlertDialog.showAlert(RegisterActivity.this, "Info", "Harus Isi Semua Data");
        }else{
            if(!password.equals(confirm_password)){
                MyAlertDialog.showAlert(RegisterActivity.this, "Info", "Confirm Password Tidak Sesuai");
            }else {
                Intent intent = new Intent(this, ProfileActivity.class);
                intent.putExtra(FULLNAME_KEY, fullname);
                intent.putExtra(EMAIL_KEY, email);
                intent.putExtra(PASSWORD_KEY, password);
                intent.putExtra(CONFIRM_PASSWORD_KEY, confirm_password);
                intent.putExtra(HOMEPAGE_KEY, homepage);
                intent.putExtra(ABOUT_KEY, about);

                startActivity(intent);
            }
        }
    }

}

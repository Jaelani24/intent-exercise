package id.ac.polinema.intentexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private TextView isiAbout;
    private TextView isiFullname;
    private TextView isiEmail;
    private TextView isiHomepage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        isiAbout = findViewById(R.id.label_about);
        isiFullname = findViewById(R.id.label_fullname);
        isiEmail = findViewById(R.id.label_email);
        isiHomepage = findViewById(R.id.label_homepage);
        
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            // TODO: display value here
            String about = extras.getString(RegisterActivity.ABOUT_KEY);
            String fullname = extras.getString(RegisterActivity.FULLNAME_KEY);
            String email = extras.getString(RegisterActivity.EMAIL_KEY);
            String homepage = extras.getString(RegisterActivity.HOMEPAGE_KEY);

            // Tampilkan nilai ke tampilan
            isiAbout.setText("" + about);
            isiFullname.setText("" + fullname);
            isiEmail.setText("" + email);
            isiHomepage.setText("" + homepage);
        }
    }

    public void backHome(View view) {
        Intent intent =  new Intent(this, HomepageActivity.class);
        startActivity(intent);
    }
}

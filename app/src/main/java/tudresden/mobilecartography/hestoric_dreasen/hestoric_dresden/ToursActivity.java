package tudresden.mobilecartography.hestoric_dreasen.hestoric_dresden;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ToursActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tours);
        Intent tours = getIntent();

    }
    public void mainmenubutton(View view) {

        Intent mainmenu = new Intent(this, MainActivity.class);

        startActivity(mainmenu);
    }
}
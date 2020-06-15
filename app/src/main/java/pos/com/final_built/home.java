package pos.com.final_built;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import pos.com.final_built.ui.main.HomeFragment;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, HomeFragment.newInstance())
                    .commitNow();
        }
    }
}
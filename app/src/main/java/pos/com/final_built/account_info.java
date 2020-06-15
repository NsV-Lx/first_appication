package pos.com.final_built;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import pos.com.final_built.ui.accountinfo.accountInfoFragment;

public class account_info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_info_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, accountInfoFragment.newInstance())
                    .commitNow();
        }
    }
}
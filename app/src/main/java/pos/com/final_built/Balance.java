package pos.com.final_built;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import pos.com.final_built.ui.main.BalanceFragment;

public class Balance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.balance_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, BalanceFragment.newInstance())
                    .commitNow();
        }
    }
}
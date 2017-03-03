package pattern.com.patternproj.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import pattern.com.patternproj.R;

public class BasicRulesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_rules);
        Toast.makeText(this, "Hi I am in BasicRules", Toast.LENGTH_SHORT).show();
       Log.d("hi","this is me");
    }
}

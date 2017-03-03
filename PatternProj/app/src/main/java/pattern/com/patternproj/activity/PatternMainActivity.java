package pattern.com.patternproj.activity;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

import pattern.com.patternproj.R;

public class PatternMainActivity extends Activity implements View.OnClickListener {
    TranslateAnimation anim_left,anim_right;
    MediaPlayer mp;
    TextView tv_basic_rule,tv_easy,tv_medium,tv_hard;
    Typeface typeface;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pattern_main);
        //this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        mp = MediaPlayer.create(this,R.raw.bt_sound);
        typeface = Typeface.createFromAsset(getAssets(),"fonts/DroidSerif-Bold.ttf");
        tv_basic_rule= (TextView) findViewById(R.id.tv_basic_rule);
        tv_basic_rule.setTypeface(typeface);
        tv_easy = (TextView) findViewById(R.id.tv_easy);
        tv_easy.setTypeface(typeface);
        tv_medium = (TextView) findViewById(R.id.tv_medium);
        tv_medium.setTypeface(typeface);
        tv_hard = (TextView) findViewById(R.id.tv_hard);
        tv_hard.setTypeface(typeface);
        anim_left= new TranslateAnimation(-500.0f,0.0f,0.0f,0.0f);
        anim_left.setDuration(1000);
        tv_basic_rule.startAnimation(anim_left);
        anim_right= new TranslateAnimation(500.0f,0.0f,0.0f,0.0f);
        anim_right.setDuration(1000);
        tv_easy .startAnimation(anim_right);
        tv_medium.startAnimation(anim_left);
        tv_hard.startAnimation(anim_right);
        tv_basic_rule.setOnClickListener(this);
        tv_easy .setOnClickListener(this);
        tv_medium.setOnClickListener(this);
        tv_hard.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv_basic_rule:
                mp.start();
                startActivity(new Intent(PatternMainActivity.this,BasicRulesActivity.class));
                break;
            case R.id.tv_easy:
                mp.start();
                startActivity(new Intent(PatternMainActivity.this,EasyModeActivity.class));
                break;
            case R.id.tv_medium:
                mp.start();
                startActivity(new Intent(PatternMainActivity.this,MediumModeActivity.class));
                break;
            case R.id.tv_hard:
                mp.start();
                startActivity(new Intent(PatternMainActivity.this,HardModeActivity.class));
                break;
        }
    }
}

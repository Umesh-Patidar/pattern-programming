package pattern.com.patternproj.activity;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

import pattern.com.patternproj.R;

public class HardModeActivity extends AppCompatActivity implements View.OnClickListener{
    TranslateAnimation anim_left,anim_right;
    MediaPlayer mp;
    Typeface typeface;
    TextView tv_pat_one,tv_pat_two,tv_pat_three,tv_pat_four,tv_pat_five,tv_pat_six,tv_pat_seven,tv_pat_eight,tv_pat_nine,tv_pat_ten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium_mode);
        mp = MediaPlayer.create(this,R.raw.bt_sound);
        typeface = Typeface.createFromAsset(getAssets(),"fonts/DroidSerif-Bold.ttf");
        anim_left= new TranslateAnimation(-500.0f,0.0f,0.0f,0.0f);
        anim_left.setDuration(1000);
        anim_right= new TranslateAnimation(500.0f,0.0f,0.0f,0.0f);
        anim_right.setDuration(1000);
        tv_pat_one = (TextView) findViewById(R.id.tv_pat_one);
        tv_pat_two = (TextView) findViewById(R.id.tv_pat_two);
        tv_pat_three = (TextView) findViewById(R.id.tv_pat_three);
        tv_pat_four = (TextView) findViewById(R.id.tv_pat_four);
        tv_pat_five = (TextView) findViewById(R.id.tv_pat_five);
        tv_pat_six = (TextView) findViewById(R.id.tv_pat_six);
        tv_pat_seven = (TextView) findViewById(R.id.tv_pat_seven);
        tv_pat_eight = (TextView) findViewById(R.id.tv_pat_eight);
        tv_pat_nine = (TextView) findViewById(R.id.tv_pat_nine);
        tv_pat_ten = (TextView) findViewById(R.id.tv_pat_ten);
        tv_pat_one.setTypeface(typeface);
        tv_pat_one.startAnimation(anim_left);
        tv_pat_two.setTypeface(typeface);
        tv_pat_two.startAnimation(anim_right);
        tv_pat_three.setTypeface(typeface);
        tv_pat_three.startAnimation(anim_left);
        tv_pat_four.setTypeface(typeface);
        tv_pat_four.startAnimation(anim_right);
        tv_pat_five.setTypeface(typeface);
        tv_pat_five.startAnimation(anim_left);
        tv_pat_six.setTypeface(typeface);
        tv_pat_six.startAnimation(anim_right);
        tv_pat_seven.setTypeface(typeface);
        tv_pat_seven.startAnimation(anim_left);
        tv_pat_eight.setTypeface(typeface);
        tv_pat_eight.startAnimation(anim_right);
        tv_pat_nine.setTypeface(typeface);
        tv_pat_nine.startAnimation(anim_left);
        tv_pat_ten.setTypeface(typeface);
        tv_pat_ten.startAnimation(anim_right);
        tv_pat_one.setOnClickListener(this);
        tv_pat_two.setOnClickListener(this);
        tv_pat_three.setOnClickListener(this);
        tv_pat_four.setOnClickListener(this);
        tv_pat_five.setOnClickListener(this);
        tv_pat_six.setOnClickListener(this);
        tv_pat_seven.setOnClickListener(this);
        tv_pat_eight.setOnClickListener(this);
        tv_pat_nine.setOnClickListener(this);
        tv_pat_ten.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_pat_one:

                break;
        }
    }
}

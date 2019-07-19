package kk.techbytecare.animationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btnZoom,btnMove,btnBlink,btnFade,btnSlideUp,btnSlideDown;

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.image);

        btnBlink = findViewById(R.id.btnBlink);
        btnZoom = findViewById(R.id.btnZoom);

        btnMove = findViewById(R.id.btnMove);
        btnFade = findViewById(R.id.btnFade);

        btnSlideUp = findViewById(R.id.btnSlideUp);
        btnSlideDown = findViewById(R.id.btnSlideDown);

        imageView.setImageResource(R.drawable.subs);

        btnBlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
                imageView.startAnimation(animation);
            }
        });

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
                imageView.startAnimation(animation);
            }
        });

        btnZoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in);
                imageView.startAnimation(animation);
            }
        });

        btnFade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
                imageView.startAnimation(animation);
            }
        });

        btnSlideUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_up);
                imageView.startAnimation(animation);
            }
        });

        btnSlideDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_down);
                imageView.startAnimation(animation);
            }
        });
    }
}

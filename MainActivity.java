package com.mini.toggle;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {
    boolean on;

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        final ImageView v = new ImageView(this);
        v.setBackgroundColor(0xFF000000);
        v.setScaleType(ImageView.ScaleType.FIT_CENTER);
        v.setImageResource(R.drawable.img1);
        v.setOnClickListener(new View.OnClickListener() {
            public void onClick(View x) {
                on = !on;
                v.setImageResource(on ? R.drawable.img2 : R.drawable.img1);
            }
        });
        setContentView(v);
    }
}

package com.prostudio.inc.banglaquotes;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Recyler_design extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_design);

        textView = findViewById(R.id.status_text_design);
        Typeface customFont = Typeface.createFromAsset(getAssets(),"font/kartikab.ttf");
        textView.setTypeface(customFont);

    }
}

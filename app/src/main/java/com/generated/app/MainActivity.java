package com.generated.app;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setGravity(Gravity.CENTER);
        root.setPadding(64, 64, 64, 64);
        root.setBackgroundColor(Color.parseColor("#F5F5F5"));

        TextView emptyView = new TextView(this);
        emptyView.setText(getString(R.string.empty_state));
        emptyView.setTextSize(18);
        emptyView.setPadding(0, 0, 0, 48);

        Button scanButton = new Button(this);
        scanButton.setText(getString(R.string.scan_button));
        scanButton.setBackgroundColor(Color.parseColor("#2196F3"));
        scanButton.setTextColor(Color.WHITE);
        scanButton.setPadding(48, 24, 48, 24);

        root.addView(emptyView);
        root.addView(scanButton);

        setContentView(root, new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, 
                ViewGroup.LayoutParams.MATCH_PARENT));
    }
}

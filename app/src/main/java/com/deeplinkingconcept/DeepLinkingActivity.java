package com.deeplinkingconcept;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DeepLinkingActivity extends AppCompatActivity {

    TextView tv_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deep_linking);

        tv_text=(TextView)findViewById(R.id.tv_text);
        Uri data = this.getIntent().getData();
        if (data != null && data.isHierarchical()) {
            String uri = this.getIntent().getDataString();
            data.getQueryParameter("userid");
            tv_text.setText(data.getQueryParameter("userid"));
        }
    }
}

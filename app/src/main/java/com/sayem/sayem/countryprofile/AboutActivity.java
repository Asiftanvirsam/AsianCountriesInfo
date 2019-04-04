package com.sayem.sayem.countryprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {


    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        textView = (TextView) findViewById(R.id.aboutTextId);


        Bundle bundle = getIntent().getExtras();

        if(bundle!=null){

            String aboutUs = (String) bundle.get("about");
            showDetails(aboutUs);


        }

    }

    private void showDetails(String aboutUs) {

        if(aboutUs.equals("AboutUs")){
            textView.setText(R.string.about);
        }

    }
}

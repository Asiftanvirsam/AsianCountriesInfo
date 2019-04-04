package com.sayem.sayem.countryprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class profile extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,

                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );



        setContentView(R.layout.activity_profile);

       imageView = (ImageView) findViewById(R.id.imageViewId);
       textView = (TextView) findViewById(R.id.textViewId);




    Bundle bundle = getIntent().getExtras();

    if(bundle!=null){

      String country = (String) bundle.get("name");
      showDetails(country);


    }

    }




    void showDetails(String country){


      if(country.equals("Bangladesh")){

            imageView.setImageResource(R.drawable.bdnature);
            textView.setText(R.string.bangladesh);
        }



        if(country.equals("India")){

            imageView.setImageResource(R.drawable.indianature);
            textView.setText(R.string.india);
        }


        if(country.equals("Pakistan")){

            imageView.setImageResource(R.drawable.pakistannature);
            textView.setText(R.string.pakistan);
        }


        if(country.equals("Afghanistan")){

            imageView.setImageResource(R.drawable.afghanistanp);
            textView.setText(R.string.afghanistan);
        }

        if(country.equals("Bhutan")){

            imageView.setImageResource(R.drawable.bhutanp);
            textView.setText(R.string.bhutan);
        }

        if(country.equals("China")){

            imageView.setImageResource(R.drawable.chinap);
            textView.setText(R.string.china);
        }
        if(country.equals("Iran")){

            imageView.setImageResource(R.drawable.iranp);
            textView.setText(R.string.iran);
        }
        if(country.equals("Iraq")){

            imageView.setImageResource(R.drawable.iraqp);
            textView.setText(R.string.iraq);
        }
        if(country.equals("Japan")){

            imageView.setImageResource(R.drawable.japanp);
            textView.setText(R.string.japan);
        }
        if(country.equals("Malaysia")){

            imageView.setImageResource(R.drawable.malaysiap);
            textView.setText(R.string.malaysia);
        }
        if(country.equals("Myanmar")){

            imageView.setImageResource(R.drawable.myanmarp);
            textView.setText(R.string.myanmar);
        }

        if(country.equals("Nepal")){

            imageView.setImageResource(R.drawable.nepalp);
            textView.setText(R.string.nepal);
        }
        if(country.equals("SouthKorea")){

            imageView.setImageResource(R.drawable.southkoreap);
            textView.setText(R.string.southkorea);
        }
        if(country.equals("HongKong")){

            imageView.setImageResource(R.drawable.hongkongp);
            textView.setText(R.string.hongkong);
        }
        if(country.equals("Srilanka")){

            imageView.setImageResource(R.drawable.srilankap);
            textView.setText(R.string.srilanka);
        }

    }



}

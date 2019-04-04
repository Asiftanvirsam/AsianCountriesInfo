package com.sayem.sayem.countryprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button banladeshButton,indiaButton,pakistanButton,afghanistanButton,bhutanButton,chinaButton,hongkongButton,iranButton,iraqButton,japanButton,malaysiaButton,myanmarButton,nepalButton,southkoreaButton,srilankaButton;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_main);



        banladeshButton = (Button) findViewById(R.id.bangladeshButtonId);
        indiaButton = (Button) findViewById(R.id.indiaButtonId);
        pakistanButton = (Button) findViewById(R.id.pakistanButtonId);
        afghanistanButton = findViewById(R.id.afghanistanButtonId);
        bhutanButton = findViewById(R.id.bhutanButtonId);
        chinaButton = findViewById(R.id.chinaButtonId);
        hongkongButton = findViewById(R.id.hongkongButtonId);
        iranButton = findViewById(R.id.iranButtonId);
        iraqButton = findViewById(R.id.iraqButtonId);
        japanButton = findViewById(R.id.japanButtonId);
        malaysiaButton = findViewById(R.id.malaysiaButtonId);
        myanmarButton = findViewById(R.id.myanmarButtonId);
        nepalButton = findViewById(R.id.nepalButtonId);
        southkoreaButton = findViewById(R.id.southkoreaButtonId);
        srilankaButton = findViewById(R.id.srilankaButtonId);



        banladeshButton.setOnClickListener(this);

        indiaButton.setOnClickListener(this);
        pakistanButton.setOnClickListener(this);
        afghanistanButton.setOnClickListener(this);
        bhutanButton.setOnClickListener(this);
        chinaButton.setOnClickListener(this);
        hongkongButton.setOnClickListener(this);
        iranButton.setOnClickListener(this);
        iraqButton.setOnClickListener(this);
        japanButton.setOnClickListener(this);
        malaysiaButton.setOnClickListener(this);
        myanmarButton.setOnClickListener(this);
        nepalButton.setOnClickListener(this);
        southkoreaButton.setOnClickListener(this);
        srilankaButton.setOnClickListener(this);




    }

    @Override








    public void onClick(View v) {


   if(v.getId()==R.id.bangladeshButtonId){

     intent =  new Intent(MainActivity.this,profile.class);
     intent.putExtra("name","Bangladesh");
     startActivity(intent);

   }

   if(v.getId()==R.id.indiaButtonId){
       intent =  new Intent(MainActivity.this,profile.class);
       intent.putExtra("name","India");
       startActivity(intent);

       }


       if(v.getId()==R.id.pakistanButtonId){

            intent =  new Intent(MainActivity.this,profile.class);
            intent.putExtra("name","Pakistan");
            startActivity(intent);

        }
        if(v.getId()==R.id.afghanistanButtonId){

            intent =  new Intent(MainActivity.this,profile.class);
            intent.putExtra("name","Afghanistan");
            startActivity(intent);

        }
        if(v.getId()==R.id.bhutanButtonId){

            intent =  new Intent(MainActivity.this,profile.class);
            intent.putExtra("name","Bhutan");
            startActivity(intent);

        }
        if(v.getId()==R.id.chinaButtonId){

            intent =  new Intent(MainActivity.this,profile.class);
            intent.putExtra("name","China");
            startActivity(intent);

        }
        if(v.getId()==R.id.hongkongButtonId){

            intent =  new Intent(MainActivity.this,profile.class);
            intent.putExtra("name","HongKong");
            startActivity(intent);

        }
        if(v.getId()==R.id.iranButtonId){

            intent =  new Intent(MainActivity.this,profile.class);
            intent.putExtra("name","Iran");
            startActivity(intent);

        }
        if(v.getId()==R.id.iraqButtonId){

            intent =  new Intent(MainActivity.this,profile.class);
            intent.putExtra("name","Iraq");
            startActivity(intent);

        }
        if(v.getId()==R.id.japanButtonId){

            intent =  new Intent(MainActivity.this,profile.class);
            intent.putExtra("name","Japan");
            startActivity(intent);

        }
        if(v.getId()==R.id.malaysiaButtonId){

            intent =  new Intent(MainActivity.this,profile.class);
            intent.putExtra("name","Malaysia");
            startActivity(intent);

        }
        if(v.getId()==R.id.myanmarButtonId){

            intent =  new Intent(MainActivity.this,profile.class);
            intent.putExtra("name","Myanmar");
            startActivity(intent);

        }
        if(v.getId()==R.id.nepalButtonId){

            intent =  new Intent(MainActivity.this,profile.class);
            intent.putExtra("name","Nepal");
            startActivity(intent);

        }
        if(v.getId()==R.id.southkoreaButtonId){

            intent =  new Intent(MainActivity.this,profile.class);
            intent.putExtra("name","SouthKorea");
            startActivity(intent);

        }
        if(v.getId()==R.id.srilankaButtonId){

            intent =  new Intent(MainActivity.this,profile.class);
            intent.putExtra("name","Srilanka");
            startActivity(intent);

        }


           }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==R.id.aboutUsId){
            Toast.makeText(MainActivity.this,"about us",Toast.LENGTH_SHORT).show();
            intent = new Intent(MainActivity.this,AboutActivity.class);
            intent.putExtra("name","AboutUs");
            startActivity(intent);
            return true;
        }

        if (item.getItemId()==R.id.settingsId){
            Toast.makeText(MainActivity.this,"settings",Toast.LENGTH_SHORT).show();
            intent = new Intent(MainActivity.this,Empty1.class);
            return true;
        }

        if (item.getItemId()==R.id.shareId){
            Toast.makeText(MainActivity.this,"share",Toast.LENGTH_SHORT).show();
            intent = new Intent(MainActivity.this,Empty1.class);
            return true;
        }




        return super.onOptionsItemSelected(item);
    }
}

package com.example.investingapp;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentTransaction;

import android.view.MenuItem;
import android.view.SurfaceControl;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView mTextMessage;

    FrameLayout frameLayout;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.market:
                    FragmentTransaction ft=
                            getSupportFragmentManager().beginTransaction();
                    MarketFrage firstFrag=new MarketFrage();
                    ft.addToBackStack("FirstFrag");
                    ft.replace(R.id.frame,firstFrag);
                    ft.commit();

                    return true;
                case R.id.news:

                    FragmentTransaction fragmentTransaction2=
                            getSupportFragmentManager().beginTransaction();
                    NewsFrage newsFrage=new NewsFrage();
                    fragmentTransaction2.addToBackStack("FirstFrag");
                    fragmentTransaction2.replace(R.id.frame,newsFrage);
                    fragmentTransaction2.commit();
                    return true;
                case R.id.Calenders:

                    FragmentTransaction fragmentTransaction3=
                            getSupportFragmentManager().beginTransaction();
                    CalenderFrage calenderFrage=new CalenderFrage();
                    fragmentTransaction3.addToBackStack("FirstFrag");
                    fragmentTransaction3.replace(R.id.frame,calenderFrage);
                    fragmentTransaction3.commit();

                    return true;

                case R.id.Protfolio:

                    FragmentTransaction fragmentTransaction4=
                            getSupportFragmentManager().beginTransaction();
                    Protfolio protfolio=new Protfolio();
                    fragmentTransaction4.addToBackStack("FirstFrag");
                    fragmentTransaction4.replace(R.id.frame,protfolio);
                    fragmentTransaction4.commit();

                    return true;


                case R.id.More:

                    FragmentTransaction fragmentTransaction5=
                            getSupportFragmentManager().beginTransaction();
                    MoreFrage moreFrage=new MoreFrage();
                    fragmentTransaction5.addToBackStack("FirstFrag");
                    fragmentTransaction5.replace(R.id.frame,moreFrage);
                    fragmentTransaction5.commit();

                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        ActionBar actionBar=getSupportActionBar();

        frameLayout=findViewById(R.id.frame);

        FragmentTransaction ft=
                getSupportFragmentManager().beginTransaction();
        MarketFrage firstFrag=new MarketFrage();
        ft.addToBackStack("FirstFrag");
        ft.replace(R.id.frame,firstFrag);
        ft.commit();
    }

}

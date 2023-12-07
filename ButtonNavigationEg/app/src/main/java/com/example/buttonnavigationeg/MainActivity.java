package com.example.buttonnavigationeg;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bnView = findViewById(R.id.bnView);
        FrameLayout container = findViewById(R.id.container);

        bnView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                int id = menuItem.getItemId();

                if (id == R.id.home) {

                    AFragment a1 = new AFragment();
                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.container, a1);
                    ft.commit();
                }
                else if (id == R.id.about) {

                    BFragment a2 = new BFragment();
                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.container, a2);
                    ft.commit();
                }
                else if (id == R.id.resource) {

                    CFragment a3 = new CFragment();
                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.container, a3);
                    ft.commit();
                }
                else if (id == R.id.share) {

                    DFragment a4 = new DFragment();
                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.container, a4);
                    ft.commit();
                }
                else {

                    EFragment a5 = new EFragment();
                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.container, a5);
                    ft.commit();
                }

                return true ;
            }
        });
    }
}
package com.foo.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
//    https://material.io/components/bottom-navigation/android#using-bottom-navigation
//    https://developer.android.com/training/basics/fragments/pass-data-between?hl=ko#java
//    https://developer.android.com/guide/fragments/fragmentmanager?hl=ko
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NavigationBarView navigationBarView = findViewById(R.id.bottom_navigation);

        transferTo(FavoritesFragment.newInstance("param1", "param2"));

        navigationBarView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.page_1:// Respond to navigation item 1 click
                        transferTo(FavoritesFragment.newInstance("param1", "param2"));
                        return true;
                    case R.id.page_2:// Respond to navigation item 2 click
                        transferTo(MusicFragment.newInstance("param1", "param2"));
                        return true;
                    case R.id.page_3:// Respond to navigation item 3 click
                        transferTo(PlacesFragment.newInstance("param1", "param2"));
                        return true;
                    case R.id.page_4:// Respond to navigation item 4 click
                        transferTo(NewsFragment.newInstance("param1", "param2"));
                        return true;
                    default:
                        return false;
                }
            }
        });

        navigationBarView.setOnItemReselectedListener(new NavigationBarView.OnItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {

            }
        });
    }

    private void transferTo(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.commit();
    }


}
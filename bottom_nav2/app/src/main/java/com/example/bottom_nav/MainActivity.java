package com.example.bottom_nav;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.bottom_nav.ui.home.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.bottom_nav.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainbinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        BottomNavigationView navView=findViewById(R.id.nav_view);
        AppBarConfiguration appBarConfiguration =new AppBarConfiguration.Builder(
                R.id.navigation_dashboard,R.id.navigation_fav
        ).build();
        NavController navController= Navigation.findNavController(this,R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this,navController,appBarConfiguration);
        NavigationUI.setupWithNavController(binding.nav_View,navController);
    }
}
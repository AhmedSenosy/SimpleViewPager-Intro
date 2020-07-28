package com.wassma.viewpagersample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.wassma.viewpagersample.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    List<IntroModel> introModels;
    int position;
    private IntroViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupPager();
        binding.vpIntro.setAdapter(adapter);
        binding.tabIntro.setupWithViewPager(binding.vpIntro);
    }

    void setupPager() {
        introModels = new ArrayList<>();
        introModels.add(new IntroModel(getString(R.string.order_wherever), R.drawable.welcomescreen));
        introModels.add(new IntroModel(getString(R.string.order_wherever), R.drawable.secondwelcome));
        introModels.add(new IntroModel(getString(R.string.order_wherever), R.drawable.thirdwelcome));

        adapter = new IntroViewPagerAdapter(this, introModels);


    }
}
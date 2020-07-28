package com.wassma.viewpagersample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;
import java.util.List;


public class IntroViewPagerAdapter extends PagerAdapter {
    Context context;
    List<IntroModel> introModels = new ArrayList<>();

    public IntroViewPagerAdapter(Context context, List<IntroModel> introModels) {
        this.context = context;
        this.introModels = introModels;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layoutScreen = inflater.inflate(R.layout.layout_intro, null);

        ImageView img = layoutScreen.findViewById(R.id.welcomeimage);
        TextView desc = layoutScreen.findViewById(R.id.intro_description);

        desc.setText(introModels.get(position).getDescription());
        img.setImageResource(introModels.get(position).getScreenImage());

        container.addView(layoutScreen);

        return layoutScreen;
    }

    @Override
    public int getCount() {
        return introModels.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

}

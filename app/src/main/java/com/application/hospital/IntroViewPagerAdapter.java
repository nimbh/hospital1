package com.application.hospital;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class IntroViewPagerAdapter extends PagerAdapter {

    Context mContext;
    List<ScreenItem> LScreenItem;

    public IntroViewPagerAdapter(Context mContext, List<ScreenItem> LScreenItem) {
        this.mContext = mContext;
        this.LScreenItem = LScreenItem;
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layoutScreen = layoutInflater.inflate(R.layout.layout_screen, null);

        ImageView imageSlide = layoutScreen.findViewById(R.id.imageView);
        TextView title = layoutScreen.findViewById(R.id.textView);
        TextView description = layoutScreen.findViewById(R.id.textView2);

        title.setText(LScreenItem.get(position).getMainText());
        description.setText(LScreenItem.get(position).getDescription());
        imageSlide.setImageResource(LScreenItem.get(position).getScreenImg());


        container.addView(layoutScreen);
        return  layoutScreen;
    }

    @Override
    public int getCount() {
        return LScreenItem.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
       container.removeView((View) object);
    }
}

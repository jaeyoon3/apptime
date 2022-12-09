package kr.apptimer.android.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import android.os.Bundle;

import kr.apptimer.R;


public class slider extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_slider);
        TabLayout tabLayout=findViewById(R.id.indicator);
        ViewPager viewPager=findViewById(R.id.vpPager);
        PagerAdater pagerAdater=new PagerAdater(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdater);
        tabLayout.setupWithViewPager(viewPager,true);
    }
}
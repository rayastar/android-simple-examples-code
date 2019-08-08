package android.anil.com.viewpagerwithcircleindicator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Nature> getData = dataSource();
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        CustomPageAdapter mCustomPagerAdapter = new CustomPageAdapter(MainActivity.this, getData);
        viewPager.setAdapter(mCustomPagerAdapter);
        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
        indicator.setViewPager(viewPager);
    }

    private List<Nature> dataSource() {
        List<Nature> data = new ArrayList<Nature>();
        data.add(new Nature(R.drawable.araku));
        data.add(new Nature(R.drawable.araku2));
        data.add(new Nature(R.drawable.araku3));
        data.add(new Nature(R.drawable.araku4));
        return data;
    }
}

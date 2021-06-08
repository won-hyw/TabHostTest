package kr.hs.emirim.w2019.tabhosttest;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabSpec1 = tabHost.newTabSpec("song").setIndicator("음악별");
        tabSpec1.setContent(R.id.linear1);
        tabHost.addTab(tabSpec1);

        TabHost.TabSpec tabSpec2 = tabHost.newTabSpec("artist").setIndicator("가수별");
        tabSpec2.setContent(R.id.linear2);
        tabHost.addTab(tabSpec2);

        TabHost.TabSpec tabSpec3 = tabHost.newTabSpec("album").setIndicator("앨범별");
        tabSpec3.setContent(R.id.linear3);
        tabHost.addTab(tabSpec3);

        tabHost.setCurrentTab(2);

    }
}
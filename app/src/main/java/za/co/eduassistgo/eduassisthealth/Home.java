package za.co.eduassistgo.eduassisthealth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Home extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        //toolbar.setTitle(getResources().getString(R.string.app_name));
      
        setSupportActionBar(toolbar);
        MobileAds.initialize(this,"ca-app-pub-9189472653918970~5767181948");
        AdView adView = (AdView)findViewById(R.id.mainAdView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }
    public void loadPage(View v)
    {
        if(v.getId()!=R.id.home){
            Intent i = new Intent(this, Page.class);
            i.putExtra("id", v.getId());
            startActivity(i);
        }
    }
}

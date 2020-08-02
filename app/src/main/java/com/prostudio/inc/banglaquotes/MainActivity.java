package com.prostudio.inc.banglaquotes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity {

    AlertDialog.Builder ExitDialog;
    ListView containerSearchListView;
    ArrayAdapter<String> adapter;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3630202220559028/7652215692");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener() {
            @Override public void onAdClosed()
            { mInterstitialAd.loadAd(new AdRequest.Builder().build()); } });
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run()
            {
                Intertialshow();
            }
        },5000);


        containerSearchListView = findViewById(R.id.containerSearchList);
        String[] sms_category = getResources().getStringArray(R.array.category_list);

        adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.list_view_design, R.id.Desgin_Text, sms_category);
        containerSearchListView.setAdapter(adapter);
        containerSearchListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                if (i == 0) {
                    Intent intent = new Intent(MainActivity.this, Q1.class);
                    startActivity(intent);
                }
                if (i == 1) {
                    Intent intent = new Intent(MainActivity.this, Q2.class);
                    startActivity(intent);
                }
                if (i == 2) {
                    Intent intent = new Intent(MainActivity.this, Q3.class);
                    startActivity(intent);
                }
                if (i == 3) {
                    Intent intent = new Intent(MainActivity.this, Q4.class);
                    startActivity(intent);
                }
                if (i == 4) {
                    Intent intent = new Intent(MainActivity.this, Q5.class);
                    startActivity(intent);
                }
                if (i == 5) {
                    Intent intent = new Intent(MainActivity.this, Q6.class);
                    startActivity(intent);
                }
                if (i == 6) {
                    Intent intent = new Intent(MainActivity.this, Q7.class);
                    startActivity(intent);
                }

                if (i == 7) {
                    Intent intent = new Intent(MainActivity.this, Q8.class);
                    startActivity(intent);
                }
                if (i == 8) {
                    Intent intent = new Intent(MainActivity.this, Q9.class);
                    startActivity(intent);
                }
                if (i == 9) {
                    Intent intent = new Intent(MainActivity.this, Q10.class);
                    startActivity(intent);
                }
                if (i == 10) {
                    Intent intent = new Intent(MainActivity.this, Q11.class);
                    startActivity(intent);
                }
                if (i == 11) {
                    Intent intent = new Intent(MainActivity.this, Q12.class);
                    startActivity(intent);
                }
                if (i == 12) {
                    Intent intent = new Intent(MainActivity.this, Q13.class);
                    startActivity(intent);
                }
                if (i == 13) {
                    Intent intent = new Intent(MainActivity.this, Q14.class);
                    startActivity(intent);
                }
                if (i == 14) {
                    Intent intent = new Intent(MainActivity.this, Q15.class);
                    startActivity(intent);
                }
                if (i == 15) {
                    Intent intent = new Intent(MainActivity.this, Q16.class);
                    startActivity(intent);
                }
                if (i == 16) {
                    Intent intent = new Intent(MainActivity.this, Q17.class);
                    startActivity(intent);
                }
                if (i == 17) {
                    Intent intent = new Intent(MainActivity.this, Q18.class);
                    startActivity(intent);
                }
                if (i == 18) {
                    Intent intent = new Intent(MainActivity.this, Q19.class);
                    startActivity(intent);
                }
                if (i == 19) {
                    Intent intent = new Intent(MainActivity.this, Q20.class);
                    startActivity(intent);
                }
                if (i == 20) {
                    Intent intent = new Intent(MainActivity.this, Q21.class);
                    startActivity(intent);
                }
                if (i == 21) {
                    Intent intent = new Intent(MainActivity.this, Q22.class);
                    startActivity(intent);
                }
                if (i == 22) {
                    Intent intent = new Intent(MainActivity.this, Q23.class);
                    startActivity(intent);
                }
                if (i == 23) {
                    Intent intent = new Intent(MainActivity.this, Q24.class);
                    startActivity(intent);
                }
                if (i == 24) {
                    Intent intent = new Intent(MainActivity.this, Q25.class);
                    startActivity(intent);
                }if (i == 25) {
                    Intent intent = new Intent(MainActivity.this, Q27.class);
                    startActivity(intent);
                } if (i == 26) {
                    Intent intent = new Intent(MainActivity.this, Q28.class);
                    startActivity(intent);
                } if (i == 27) {
                    Intent intent = new Intent(MainActivity.this, Q29.class);
                    startActivity(intent);
                } if (i == 28) {
                    Intent intent = new Intent(MainActivity.this, Q30.class);
                    startActivity(intent);
                } if (i == 29) {
                    Intent intent = new Intent(MainActivity.this, Q31.class);
                    startActivity(intent);
                } if (i == 30) {
                    Intent intent = new Intent(MainActivity.this, Q35.class);
                    startActivity(intent);
                } if (i == 31) {
                    Intent intent = new Intent(MainActivity.this, Q33.class);
                    startActivity(intent);
                } if (i == 32) {
                    Intent intent = new Intent(MainActivity.this, Q34.class);
                    startActivity(intent);
                } if (i == 33) {
                    Intent intent = new Intent(MainActivity.this, Q32.class);
                    startActivity(intent);
                } if (i == 34) {
                    Intent intent = new Intent(MainActivity.this, Q42.class);
                    startActivity(intent);
                } if (i == 35) {
                    Intent intent = new Intent(MainActivity.this, Q37.class);
                    startActivity(intent);
                } if (i == 36) {
                    Intent intent = new Intent(MainActivity.this, Q38.class);
                    startActivity(intent);
                } if (i == 37) {
                    Intent intent = new Intent(MainActivity.this, Q40.class);
                    startActivity(intent);
                } if (i == 38) {
                    Intent intent = new Intent(MainActivity.this, Q41.class);
                    startActivity(intent);
                } if (i == 39) {
                    Intent intent = new Intent(MainActivity.this, Q39.class);
                    startActivity(intent);
                } if (i == 40) {
                    Intent intent = new Intent(MainActivity.this, Q36.class);
                    startActivity(intent);
                } if (i == 41) {
                    Intent intent = new Intent(MainActivity.this, Q26.class);
                    startActivity(intent);
                } if (i == 42) {
                    Intent intent = new Intent(MainActivity.this, Q43.class);
                    startActivity(intent);
                } if (i == 43) {
                    Intent intent = new Intent(MainActivity.this, Q44.class);
                    startActivity(intent);
                }



            }
        });

    }


    //ExitDialog//

    public void loadExitDialog() {

        ExitDialog = new AlertDialog.Builder(MainActivity.this);
        ExitDialog.setMessage("Do you want to Exit ?");
        ExitDialog.setCancelable(false);
        ExitDialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                finish();

            }
        });

        ExitDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                dialogInterface.cancel();

            }
        });

        AlertDialog alertDialog = ExitDialog.create();
        alertDialog.show();


    }

    @Override
    public void onBackPressed() {

        loadExitDialog();
    }

    //ExitDialog//

    //option menu



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.option_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.about_option_menu) {

            Intent intent = new Intent(getApplicationContext(), About.class);
            startActivity(intent);
        } else if (item.getItemId() == R.id.more_app_option_menu){

            try {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://dev?id=5952395425393771763")));
            } catch (ActivityNotFoundException e) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/dev?id=5952395425393771763")));
            }

        } else if (item.getItemId() == R.id.rate_us_option_menu){

            try {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + getPackageName())));
            } catch (ActivityNotFoundException e) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName())));
            }

        }
        return super.onOptionsItemSelected(item);

    }

    //option menu

    public void Intertialshow()
    { if (mInterstitialAd.isLoaded()) { mInterstitialAd.show(); }
    else
    {


    } }
}

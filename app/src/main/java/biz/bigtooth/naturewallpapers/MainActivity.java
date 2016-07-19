package biz.bigtooth.naturewallpapers;

import android.app.ProgressDialog;
import android.app.WallpaperManager;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.IntegerRes;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresPermission;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.Manifest;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.io.IOException;
import java.util.HashMap;

import biz.bigtooth.naturewallpapers.R;

public class MainActivity extends AppCompatActivity implements ActivityCompat.OnRequestPermissionsResultCallback {

    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(getApplicationContext(), "ca-app-pub-5164171001589422/5381023392");

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-5164171001589422/5381023392");

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                requestNewInterstitial();
            }
        });

        requestNewInterstitial();
    }

    private void requestNewInterstitial() {
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("5C6759521D465119182182A234FF5CE3")
                .build();

        mInterstitialAd.loadAd(adRequest);
    }

    public void blooming(View view) {

        new AlertDialog.Builder(this)
                .setTitle("Confirm")
                .setMessage("Set as your wallpaper?")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    WallpaperManager myWallpaperManager
                            = WallpaperManager.getInstance(getApplicationContext());

                    public void onClick(DialogInterface dialog, int whichButton) {
                        if (mInterstitialAd.isLoaded()) {
                            mInterstitialAd.show();
                            try {
                                myWallpaperManager.setResource(R.raw.blooming);
                                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
                            } catch (IOException e) {
                                Toast.makeText(MainActivity.this,
                                        "Whoops! Something went wrong!", Toast.LENGTH_LONG).show();
                                e.printStackTrace();
                            }
                        } else {
                            try {
                                myWallpaperManager.setResource(R.raw.blooming);
                                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
                            } catch (IOException e) {
                                Toast.makeText(MainActivity.this,
                                        "Whoops! Something went wrong!", Toast.LENGTH_LONG).show();
                                e.printStackTrace();
                            }
                        }
                    }})
                .setNegativeButton(android.R.string.no, null).show();
    }

    public void cave_pool(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Confirm")
                .setMessage("Set as your wallpaper?")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    WallpaperManager myWallpaperManager
                            = WallpaperManager.getInstance(getApplicationContext());

                    public void onClick(DialogInterface dialog, int whichButton) {
                        if (mInterstitialAd.isLoaded()) {
                            mInterstitialAd.show();
                            try {
                                myWallpaperManager.setResource(R.raw.cave_pool);
                                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
                            } catch (IOException e) {
                                Toast.makeText(MainActivity.this,
                                        "Whoops! Something went wrong!", Toast.LENGTH_LONG).show();
                                e.printStackTrace();
                            }
                        } else {
                            try {
                                myWallpaperManager.setResource(R.raw.cave_pool);
                                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
                            } catch (IOException e) {
                                Toast.makeText(MainActivity.this,
                                        "Whoops! Something went wrong!", Toast.LENGTH_LONG).show();
                                e.printStackTrace();
                            }
                        }
                    }})
                .setNegativeButton(android.R.string.no, null).show();
    }

    public void coral(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Confirm")
                .setMessage("Set as your wallpaper?")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    WallpaperManager myWallpaperManager
                            = WallpaperManager.getInstance(getApplicationContext());

                    public void onClick(DialogInterface dialog, int whichButton) {
                        if (mInterstitialAd.isLoaded()) {
                            mInterstitialAd.show();
                            try {
                                myWallpaperManager.setResource(R.raw.coral);
                                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
                            } catch (IOException e) {
                                Toast.makeText(MainActivity.this,
                                        "Whoops! Something went wrong!", Toast.LENGTH_LONG).show();
                                e.printStackTrace();
                            }
                        } else {
                            try {
                                myWallpaperManager.setResource(R.raw.coral);
                                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
                            } catch (IOException e) {
                                Toast.makeText(MainActivity.this,
                                        "Whoops! Something went wrong!", Toast.LENGTH_LONG).show();
                                e.printStackTrace();
                            }
                        }
                    }})
                .setNegativeButton(android.R.string.no, null).show();
    }

    public void dandy_lions(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Confirm")
                .setMessage("Set as your wallpaper?")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    WallpaperManager myWallpaperManager
                            = WallpaperManager.getInstance(getApplicationContext());

                    public void onClick(DialogInterface dialog, int whichButton) {
                        if (mInterstitialAd.isLoaded()) {
                            mInterstitialAd.show();
                            try {
                                myWallpaperManager.setResource(R.raw.dandy_lions);
                                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
                            } catch (IOException e) {
                                Toast.makeText(MainActivity.this,
                                        "Whoops! Something went wrong!", Toast.LENGTH_LONG).show();
                                e.printStackTrace();
                            }
                        } else {
                            try {
                                myWallpaperManager.setResource(R.raw.dandy_lions);
                                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
                            } catch (IOException e) {
                                Toast.makeText(MainActivity.this,
                                        "Whoops! Something went wrong!", Toast.LENGTH_LONG).show();
                                e.printStackTrace();
                            }
                        }
                    }})
                .setNegativeButton(android.R.string.no, null).show();
    }

    public void forest(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Confirm")
                .setMessage("Set as your wallpaper?")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    WallpaperManager myWallpaperManager
                            = WallpaperManager.getInstance(getApplicationContext());

                    public void onClick(DialogInterface dialog, int whichButton) {
                        if (mInterstitialAd.isLoaded()) {
                            mInterstitialAd.show();
                            try {
                                myWallpaperManager.setResource(R.raw.forest);
                                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
                            } catch (IOException e) {
                                Toast.makeText(MainActivity.this,
                                        "Whoops! Something went wrong!", Toast.LENGTH_LONG).show();
                                e.printStackTrace();
                            }
                        } else {
                            try {
                                myWallpaperManager.setResource(R.raw.forest);
                                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
                            } catch (IOException e) {
                                Toast.makeText(MainActivity.this,
                                        "Whoops! Something went wrong!", Toast.LENGTH_LONG).show();
                                e.printStackTrace();
                            }
                        }
                    }})
                .setNegativeButton(android.R.string.no, null).show();
    }

    public void forest_trail(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Confirm")
                .setMessage("Set as your wallpaper?")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    WallpaperManager myWallpaperManager
                            = WallpaperManager.getInstance(getApplicationContext());

                    public void onClick(DialogInterface dialog, int whichButton) {
                        if (mInterstitialAd.isLoaded()) {
                            mInterstitialAd.show();
                            try {
                                myWallpaperManager.setResource(R.raw.forest_trail);
                                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
                            } catch (IOException e) {
                                Toast.makeText(MainActivity.this,
                                        "Whoops! Something went wrong!", Toast.LENGTH_LONG).show();
                                e.printStackTrace();
                            }
                        } else {
                            try {
                                myWallpaperManager.setResource(R.raw.forest_trail);
                                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
                            } catch (IOException e) {
                                Toast.makeText(MainActivity.this,
                                        "Whoops! Something went wrong!", Toast.LENGTH_LONG).show();
                                e.printStackTrace();
                            }
                        }
                    }})
                .setNegativeButton(android.R.string.no, null).show();
    }

    public void hills(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Confirm")
                .setMessage("Set as your wallpaper?")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    WallpaperManager myWallpaperManager
                            = WallpaperManager.getInstance(getApplicationContext());

                    public void onClick(DialogInterface dialog, int whichButton) {
                        if (mInterstitialAd.isLoaded()) {
                            mInterstitialAd.show();
                            try {
                                myWallpaperManager.setResource(R.raw.hills);
                                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
                            } catch (IOException e) {
                                Toast.makeText(MainActivity.this,
                                        "Whoops! Something went wrong!", Toast.LENGTH_LONG).show();
                                e.printStackTrace();
                            }
                        } else {
                            try {
                                myWallpaperManager.setResource(R.raw.hills);
                                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
                            } catch (IOException e) {
                                Toast.makeText(MainActivity.this,
                                        "Whoops! Something went wrong!", Toast.LENGTH_LONG).show();
                                e.printStackTrace();
                            }
                        }
                    }})
                .setNegativeButton(android.R.string.no, null).show();
    }

    public void holly(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Confirm")
                .setMessage("Set as your wallpaper?")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    WallpaperManager myWallpaperManager
                            = WallpaperManager.getInstance(getApplicationContext());

                    public void onClick(DialogInterface dialog, int whichButton) {
                        if (mInterstitialAd.isLoaded()) {
                            mInterstitialAd.show();
                            try {
                                myWallpaperManager.setResource(R.raw.holly);
                                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
                            } catch (IOException e) {
                                Toast.makeText(MainActivity.this,
                                        "Whoops! Something went wrong!", Toast.LENGTH_LONG).show();
                                e.printStackTrace();
                            }
                        } else {
                            try {
                                myWallpaperManager.setResource(R.raw.holly);
                                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
                            } catch (IOException e) {
                                Toast.makeText(MainActivity.this,
                                        "Whoops! Something went wrong!", Toast.LENGTH_LONG).show();
                                e.printStackTrace();
                            }
                        }
                    }})
                .setNegativeButton(android.R.string.no, null).show();
    }

    public void leaves(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Confirm")
                .setMessage("Set as your wallpaper?")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    WallpaperManager myWallpaperManager
                            = WallpaperManager.getInstance(getApplicationContext());

                    public void onClick(DialogInterface dialog, int whichButton) {
                        if (mInterstitialAd.isLoaded()) {
                            mInterstitialAd.show();
                            try {
                                myWallpaperManager.setResource(R.raw.leaves);
                                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
                            } catch (IOException e) {
                                Toast.makeText(MainActivity.this,
                                        "Whoops! Something went wrong!", Toast.LENGTH_LONG).show();
                                e.printStackTrace();
                            }
                        } else {
                            try {
                                myWallpaperManager.setResource(R.raw.leaves);
                                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
                            } catch (IOException e) {
                                Toast.makeText(MainActivity.this,
                                        "Whoops! Something went wrong!", Toast.LENGTH_LONG).show();
                                e.printStackTrace();
                            }
                        }
                    }})
                .setNegativeButton(android.R.string.no, null).show();
    }

    public void lilac(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Confirm")
                .setMessage("Set as your wallpaper?")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    WallpaperManager myWallpaperManager
                            = WallpaperManager.getInstance(getApplicationContext());

                    public void onClick(DialogInterface dialog, int whichButton) {
                        if (mInterstitialAd.isLoaded()) {
                            mInterstitialAd.show();
                            try {
                                myWallpaperManager.setResource(R.raw.lilac);
                                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
                            } catch (IOException e) {
                                Toast.makeText(MainActivity.this,
                                        "Whoops! Something went wrong!", Toast.LENGTH_LONG).show();
                                e.printStackTrace();
                            }
                        } else {
                            try {
                                myWallpaperManager.setResource(R.raw.lilac);
                                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
                            } catch (IOException e) {
                                Toast.makeText(MainActivity.this,
                                        "Whoops! Something went wrong!", Toast.LENGTH_LONG).show();
                                e.printStackTrace();
                            }
                        }
                    }})
                .setNegativeButton(android.R.string.no, null).show();
    }

    public void lovers_leap(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Confirm")
                .setMessage("Set as your wallpaper?")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    WallpaperManager myWallpaperManager
                            = WallpaperManager.getInstance(getApplicationContext());

                    public void onClick(DialogInterface dialog, int whichButton) {
                        if (mInterstitialAd.isLoaded()) {
                            mInterstitialAd.show();
                            try {
                                myWallpaperManager.setResource(R.raw.lovers_leap);
                                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
                            } catch (IOException e) {
                                Toast.makeText(MainActivity.this,
                                        "Whoops! Something went wrong!", Toast.LENGTH_LONG).show();
                                e.printStackTrace();
                            }
                        } else {
                            try {
                                myWallpaperManager.setResource(R.raw.lovers_leap);
                                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
                            } catch (IOException e) {
                                Toast.makeText(MainActivity.this,
                                        "Whoops! Something went wrong!", Toast.LENGTH_LONG).show();
                                e.printStackTrace();
                            }
                        }
                    }})
                .setNegativeButton(android.R.string.no, null).show();
    }

    public void mountain_trail(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Confirm")
                .setMessage("Set as your wallpaper?")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    WallpaperManager myWallpaperManager
                            = WallpaperManager.getInstance(getApplicationContext());

                    public void onClick(DialogInterface dialog, int whichButton) {
                        if (mInterstitialAd.isLoaded()) {
                            mInterstitialAd.show();
                            try {
                                myWallpaperManager.setResource(R.raw.mountain_trail);
                                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
                            } catch (IOException e) {
                                Toast.makeText(MainActivity.this,
                                        "Whoops! Something went wrong!", Toast.LENGTH_LONG).show();
                                e.printStackTrace();
                            }
                        } else {
                            try {
                                myWallpaperManager.setResource(R.raw.mountain_trail);
                                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
                            } catch (IOException e) {
                                Toast.makeText(MainActivity.this,
                                        "Whoops! Something went wrong!", Toast.LENGTH_LONG).show();
                                e.printStackTrace();
                            }
                        }
                    }})
                .setNegativeButton(android.R.string.no, null).show();
    }

    public void rock_fall(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Confirm")
                .setMessage("Set as your wallpaper?")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    WallpaperManager myWallpaperManager
                            = WallpaperManager.getInstance(getApplicationContext());

                    public void onClick(DialogInterface dialog, int whichButton) {
                        if (mInterstitialAd.isLoaded()) {
                            mInterstitialAd.show();
                            try {
                                myWallpaperManager.setResource(R.raw.rock_fall);
                                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
                            } catch (IOException e) {
                                Toast.makeText(MainActivity.this,
                                        "Whoops! Something went wrong!", Toast.LENGTH_LONG).show();
                                e.printStackTrace();
                            }
                        } else {
                            try {
                                myWallpaperManager.setResource(R.raw.rock_fall);
                                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
                            } catch (IOException e) {
                                Toast.makeText(MainActivity.this,
                                        "Whoops! Something went wrong!", Toast.LENGTH_LONG).show();
                                e.printStackTrace();
                            }
                        }
                    }})
                .setNegativeButton(android.R.string.no, null).show();
    }

    public void stone_bridge(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Confirm")
                .setMessage("Set as your wallpaper?")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    WallpaperManager myWallpaperManager
                            = WallpaperManager.getInstance(getApplicationContext());

                    public void onClick(DialogInterface dialog, int whichButton) {
                        if (mInterstitialAd.isLoaded()) {
                            mInterstitialAd.show();
                            try {
                                myWallpaperManager.setResource(R.raw.stone_bridge);
                                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
                            } catch (IOException e) {
                                Toast.makeText(MainActivity.this,
                                        "Whoops! Something went wrong!", Toast.LENGTH_LONG).show();
                                e.printStackTrace();
                            }
                        } else {
                            try {
                                myWallpaperManager.setResource(R.raw.stone_bridge);
                                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
                            } catch (IOException e) {
                                Toast.makeText(MainActivity.this,
                                        "Whoops! Something went wrong!", Toast.LENGTH_LONG).show();
                                e.printStackTrace();
                            }
                        }
                    }})
                .setNegativeButton(android.R.string.no, null).show();
    }

    public void twigs(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Confirm")
                .setMessage("Set as your wallpaper?")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    WallpaperManager myWallpaperManager
                            = WallpaperManager.getInstance(getApplicationContext());

                    public void onClick(DialogInterface dialog, int whichButton) {
                        if (mInterstitialAd.isLoaded()) {
                            mInterstitialAd.show();
                            try {
                                myWallpaperManager.setResource(R.raw.twigs);
                                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
                            } catch (IOException e) {
                                Toast.makeText(MainActivity.this,
                                        "Whoops! Something went wrong!", Toast.LENGTH_LONG).show();
                                e.printStackTrace();
                            }
                        } else {
                            try {
                                myWallpaperManager.setResource(R.raw.twigs);
                                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
                            } catch (IOException e) {
                                Toast.makeText(MainActivity.this,
                                        "Whoops! Something went wrong!", Toast.LENGTH_LONG).show();
                                e.printStackTrace();
                            }
                        }
                    }})
                .setNegativeButton(android.R.string.no, null).show();
    }

    public void whale_shark(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Confirm")
                .setMessage("Set as your wallpaper?")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    WallpaperManager myWallpaperManager
                            = WallpaperManager.getInstance(getApplicationContext());

                    public void onClick(DialogInterface dialog, int whichButton) {
                        if (mInterstitialAd.isLoaded()) {
                            mInterstitialAd.show();
                            try {
                                myWallpaperManager.setResource(R.raw.whale_shark);
                                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
                            } catch (IOException e) {
                                Toast.makeText(MainActivity.this,
                                        "Whoops! Something went wrong!", Toast.LENGTH_LONG).show();
                                e.printStackTrace();
                            }
                        } else {
                            try {
                                myWallpaperManager.setResource(R.raw.whale_shark);
                                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
                            } catch (IOException e) {
                                Toast.makeText(MainActivity.this,
                                        "Whoops! Something went wrong!", Toast.LENGTH_LONG).show();
                                e.printStackTrace();
                            }
                        }
                    }})
                .setNegativeButton(android.R.string.no, null).show();
    }

    public void white_flowers(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Confirm")
                .setMessage("Set as your wallpaper?")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    WallpaperManager myWallpaperManager
                            = WallpaperManager.getInstance(getApplicationContext());

                    public void onClick(DialogInterface dialog, int whichButton) {
                        if (mInterstitialAd.isLoaded()) {
                            mInterstitialAd.show();
                            try {
                                myWallpaperManager.setResource(R.raw.white_flowers);
                                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
                            } catch (IOException e) {
                                Toast.makeText(MainActivity.this,
                                        "Whoops! Something went wrong!", Toast.LENGTH_LONG).show();
                                e.printStackTrace();
                            }
                        } else {
                            try {
                                myWallpaperManager.setResource(R.raw.white_flowers);
                                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
                            } catch (IOException e) {
                                Toast.makeText(MainActivity.this,
                                        "Whoops! Something went wrong!", Toast.LENGTH_LONG).show();
                                e.printStackTrace();
                            }
                        }
                    }})
                .setNegativeButton(android.R.string.no, null).show();
    }
}

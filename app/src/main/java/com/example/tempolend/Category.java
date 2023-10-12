package com.example.tempolend;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Category extends AppCompatActivity {

    private ImageButton guitarselection1, guitarselection2, guitarselection3, guitarselection4, guitarselection5, guitarselection6;
    private TextView PianoButton, DrumsButton, EButton, ViolinButton, SaxButton, CajonButton, FluteButton;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottonnav);

        bottomNavigationView.setSelectedItemId(R.id.Category);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.orders:
                        startActivity(new Intent(getApplicationContext(), Orders.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), Home.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.Category:
                        return true;

                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext(), Profile.class));
                        overridePendingTransition(0, 0);
                        return true;
                }

                return false;
            }
        });


        PianoButton = (TextView) findViewById(R.id.PianoButton);
        PianoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPianoCategory();
            }
        });

        DrumsButton = (TextView) findViewById(R.id.DrumsButton);
        DrumsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDrumsCategory();
            }
        });

        EButton = (TextView) findViewById(R.id.EButton);
        EButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openECategory();
            }
        });

        ViolinButton = (TextView) findViewById(R.id.ViolinButton);
        ViolinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openViolinCategory();
            }
        });

        SaxButton = (TextView) findViewById(R.id.SaxButton);
        SaxButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSaxCategory();
            }
        });

        CajonButton = (TextView) findViewById(R.id.CajonButton);
        CajonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCajonCategory();
            }
        });

        FluteButton = (TextView) findViewById(R.id.FluteButton);
        FluteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFluteCategory();
            }
        });

        guitarselection1 = (ImageButton) findViewById(R.id.guitarselection1);
        guitarselection1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCategory1stSelection();
            }
        });

        guitarselection2 = (ImageButton) findViewById(R.id.guitarselection2);
        guitarselection2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCategory2ndSelection();
            }
        });

        guitarselection3 = (ImageButton) findViewById(R.id.guitarselection3);
        guitarselection3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCategory3rdSelection();
            }
        });

        guitarselection4 = (ImageButton) findViewById(R.id.guitarselection4);
        guitarselection4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCategory4thSelection();
            }
        });

        guitarselection5 = (ImageButton) findViewById(R.id.guitarselection5);
        guitarselection5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCategory5thSelection();
            }
        });

        guitarselection6 = (ImageButton) findViewById(R.id.guitarselection6);
        guitarselection6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCategory6thSelection();
            }
        });

    }

    public void openPianoCategory() {
        Intent intent = new Intent(this, PianoCategory.class);
        startActivity(intent);
        overridePendingTransition(androidx.navigation.ui.R.anim.nav_default_enter_anim, androidx.navigation.ui.R.anim.nav_default_exit_anim);
    }

    public void openDrumsCategory() {
        Intent intent = new Intent(this, DrumsCategory.class);
        startActivity(intent);
        overridePendingTransition(androidx.navigation.ui.R.anim.nav_default_enter_anim, androidx.navigation.ui.R.anim.nav_default_exit_anim);
    }

    public void openECategory() {
        Intent intent = new Intent(this, ECategory.class);
        startActivity(intent);
        overridePendingTransition(androidx.navigation.ui.R.anim.nav_default_enter_anim, androidx.navigation.ui.R.anim.nav_default_exit_anim);
    }

    public void openViolinCategory() {
        Intent intent = new Intent(this, ViolinCategory.class);
        startActivity(intent);
        overridePendingTransition(androidx.navigation.ui.R.anim.nav_default_enter_anim, androidx.navigation.ui.R.anim.nav_default_exit_anim);
    }

    public void openSaxCategory() {
        Intent intent = new Intent(this, SaxCategory.class);
        startActivity(intent);
        overridePendingTransition(androidx.navigation.ui.R.anim.nav_default_enter_anim, androidx.navigation.ui.R.anim.nav_default_exit_anim);
    }

    public void openCajonCategory() {
        Intent intent = new Intent(this, CajonCategory.class);
        startActivity(intent);
        overridePendingTransition(androidx.navigation.ui.R.anim.nav_default_enter_anim, androidx.navigation.ui.R.anim.nav_default_exit_anim);
    }

    public void openFluteCategory() {
        Intent intent = new Intent(this, FluteCategory.class);
        startActivity(intent);
        overridePendingTransition(androidx.navigation.ui.R.anim.nav_default_enter_anim, androidx.navigation.ui.R.anim.nav_default_exit_anim);
    }

    public void openCategory1stSelection() {
        Intent intent = new Intent(this, Category1stSelection.class);
        startActivity(intent);
        overridePendingTransition(androidx.navigation.ui.R.anim.nav_default_enter_anim, androidx.navigation.ui.R.anim.nav_default_exit_anim);
    }

    public void openCategory2ndSelection() {
        Intent intent = new Intent(this, Category2ndSelection.class);
        startActivity(intent);
        overridePendingTransition(androidx.navigation.ui.R.anim.nav_default_enter_anim, androidx.navigation.ui.R.anim.nav_default_exit_anim);
    }

    public void openCategory3rdSelection() {
        Intent intent = new Intent(this, Category3rdSelection.class);
        startActivity(intent);
        overridePendingTransition(androidx.navigation.ui.R.anim.nav_default_enter_anim, androidx.navigation.ui.R.anim.nav_default_exit_anim);
    }

    public void openCategory4thSelection() {
        Intent intent = new Intent(this, Category4thSelection.class);
        startActivity(intent);
        overridePendingTransition(androidx.navigation.ui.R.anim.nav_default_enter_anim, androidx.navigation.ui.R.anim.nav_default_exit_anim);
    }

    public void openCategory5thSelection() {
        Intent intent = new Intent(this, Category5thSelection.class);
        startActivity(intent);
        overridePendingTransition(androidx.navigation.ui.R.anim.nav_default_enter_anim, androidx.navigation.ui.R.anim.nav_default_exit_anim);
    }

    public void openCategory6thSelection() {
        Intent intent = new Intent(this, Category6thSelection.class);
        startActivity(intent);
        overridePendingTransition(androidx.navigation.ui.R.anim.nav_default_enter_anim, androidx.navigation.ui.R.anim.nav_default_exit_anim);
    }

}






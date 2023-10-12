package com.example.tempolend;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Locale;

public class Home extends AppCompatActivity {

    private ImageButton guitarselection1, pianoselection1, drumsselection1, Eselection1, Saxselection1, cajonselection1;
    private TextView GuitarButton, PianoButton, DrumsButton, EButton, ViolinButton, SaxButton, CajonButton, FluteButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottonnav);

        bottomNavigationView.setSelectedItemId(R.id.home);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.orders:
                        startActivity(new Intent(getApplicationContext(), Orders.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.home:
                        return true;

                    case R.id.Category:
                        startActivity(new Intent(getApplicationContext(), Locale.Category.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext(), Profile.class));
                        overridePendingTransition(0, 0);
                        return true;
                }

                return false;
            }
        });

        GuitarButton = (TextView) findViewById(R.id.GuitarButton);
        GuitarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCategory();
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
                openGuitarFirstSelection();
            }
        });

        pianoselection1 = (ImageButton) findViewById(R.id.pianoselection1);
        pianoselection1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openpianoselection();
            }
        });

        drumsselection1 = (ImageButton) findViewById(R.id.drumsselection1);
        drumsselection1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opendrumsselection();
            }
        });

        Eselection1 = (ImageButton) findViewById(R.id.Eselection1);
        Eselection1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openeselection();
            }
        });

        Saxselection1 = (ImageButton) findViewById(R.id.Saxselection1);
        Saxselection1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensaxselection();
            }
        });

        cajonselection1 = (ImageButton) findViewById(R.id.cajonselection1);
        cajonselection1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opencajonselection();
            }
        });

    }

    public void openCategory() {
        Intent intent = new Intent(this, Category.class);
        startActivity(intent);
    }

    public void openPianoCategory() {
        Intent intent = new Intent(this, PianoCategory.class);
        startActivity(intent);
    }

    public void openDrumsCategory() {
        Intent intent = new Intent(this, DrumsCategory.class);
        startActivity(intent);
    }

    public void openECategory() {
        Intent intent = new Intent(this, ECategory.class);
        startActivity(intent);
    }

    public void openViolinCategory() {
        Intent intent = new Intent(this, ViolinCategory.class);
        startActivity(intent);
    }

    public void openSaxCategory() {
        Intent intent = new Intent(this, SaxCategory.class);
        startActivity(intent);
    }

    public void openCajonCategory() {
        Intent intent = new Intent(this, CajonCategory.class);
        startActivity(intent);
    }

    public void openFluteCategory() {
        Intent intent = new Intent(this, FluteCategory.class);
        startActivity(intent);
    }

    public void openGuitarFirstSelection() {
        Intent intent = new Intent(this, GuitarFirstSelection.class);
        startActivity(intent);
    }

    public void openpianoselection() {
        Intent intent = new Intent(this, pianoselection.class);
        startActivity(intent);
    }

    public void opendrumsselection() {
        Intent intent = new Intent(this, drumsselection.class);
        startActivity(intent);
    }

    public void openeselection() {
        Intent intent = new Intent(this, eselection.class);
        startActivity(intent);
    }

    public void opensaxselection() {
        Intent intent = new Intent(this, saxselection.class);
        startActivity(intent);
    }

    public void opencajonselection() {
        Intent intent = new Intent(this, cajonselection.class);
        startActivity(intent);
    }

}









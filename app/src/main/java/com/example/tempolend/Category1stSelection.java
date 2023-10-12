package com.example.tempolend;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Category1stSelection extends AppCompatActivity {

    private ImageButton BACKButton;
    private ImageButton profile;
    private ImageButton cart;
    private ImageButton bottom1stSelection;
    private ImageButton bottom2ndSelection;
    private ImageButton bottom3rdSelection;
    private ImageButton bottom4thSelection;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category1st_selection);

        BACKButton = (ImageButton) findViewById(R.id.BACKButton);
        BACKButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCategory();
            }
        });

        profile = (ImageButton) findViewById(R.id.profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMe();
            }
        });

        cart = (ImageButton) findViewById(R.id.cart);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCart();
            }
        });

        bottom1stSelection = (ImageButton) findViewById(R.id.bottom1stSelection);
        bottom1stSelection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog1();
            }
        });

    }

    private void showDialog1() {
        Dialog dialog1 = new Dialog(this);
        dialog1.setContentView(R.layout.layout_popup_bottom);
        dialog1.show();

        ImageButton close_btn = dialog1.findViewById(R.id.close_btn);

        close_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog1.dismiss();
            }
        });

        bottom2ndSelection = (ImageButton) findViewById(R.id.bottom2ndSelection);
        bottom2ndSelection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog2();
            }
        });


    }

    private void showDialog2() {
        Dialog dialog2 = new Dialog(this);
        dialog2.setContentView(R.layout.layout_popup_ram2);
        dialog2.show();

        ImageButton close_btn2 = dialog2.findViewById(R.id.close_btn2);

        close_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog2.dismiss();
            }
        });

        bottom3rdSelection = findViewById(R.id.bottom3rdSelection);
        bottom3rdSelection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog3();
            }
        });
    }

    private void showDialog3() {
        Dialog dialog3 = new Dialog(this);
        dialog3.setContentView(R.layout.layout_popup_ram3);
        dialog3.show();

        ImageButton close_btn3 = dialog3.findViewById(R.id.close_btn3);
        close_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog3.dismiss();
            }
        });

        bottom4thSelection = findViewById(R.id.bottom4thSelection);
        bottom4thSelection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog4();
            }
        });
    }

    private void showDialog4() {
        Dialog dialog4 = new Dialog(this);
        dialog4.setContentView(R.layout.layout_popup_ram4);
        dialog4.show();

        ImageButton close_btn3 = dialog4.findViewById(R.id.close_btn3);
        close_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog4.dismiss();
            }
        });

    }




    public void openCategory() {
        Intent intent = new Intent(this, Category.class);
        startActivity(intent);

    }

    @Override
    public void finish() {
        super.finish();
    }

    public void openMe() {
        Intent intent = new Intent(this, Me.class);
        startActivity(intent);
    }

    public void openCart() {
        Intent intent = new Intent(this, Cart.class);
        startActivity(intent);
    }


}

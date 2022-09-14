package com.example.myapplication;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    int mycountValue = 0;

    Button btMinus, btplus,txReset;
    TextView txcount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btMinus = findViewById(R.id.btMinus);
        btplus = findViewById(R.id.btplus);
        txcount = findViewById(R.id.txcount);
        txReset = findViewById(R.id.txReset);
        btMinus.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                mycountValue = mycountValue - 1;

                txcount.setText(mycountValue + "");
            }
        });

        btplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mycountValue = mycountValue + 1;

                txcount.setText(mycountValue + "");
            }
        });

        txReset.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mycountValue = 0;

                txcount.setText(mycountValue + "");
            }
        });
    }
}


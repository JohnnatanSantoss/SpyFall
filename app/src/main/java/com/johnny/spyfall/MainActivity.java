package com.johnny.spyfall;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.startButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                ImageView imageView = findViewById(R.id.imageStart);
                Picasso.get()
                        .load("https://instagram.fpll3-2.fna.fbcdn.net/v/t51.2885-19/129511543_193011969030769_78989157602671942_n.jpg?stp=dst-jpg_s150x150&_nc_ht=instagram.fpll3-2.fna.fbcdn.net&_nc_cat=101&_nc_ohc=gxJoh2EcC7UAX9xK81p&edm=AOQ1c0wBAAAA&ccb=7-5&oh=00_AT8SztQSQpxRzR6cSDf8N-bTghOVM7A6ej6xDkSoxxhaYQ&oe=6346EA42&_nc_sid=8fd12b")
                        .into(imageView);


                final TextView mTextView = (TextView) findViewById(R.id.texthello);
                mTextView.setText("Eae");

            }
        });


    }

}
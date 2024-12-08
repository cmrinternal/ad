package com.cmrit.week2;
  import androidx.appcompat.app.AppCompatActivity;
  import android.content.Intent;
  import android.net.Uri;
  import android.os.Bundle;
  import android.view.View;
  import android.widget.Button;
  public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    Button b1,b2,b3;
    Intent i = new Intent();
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.setAction(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:9505061025"));
                startActivity(i);
            }                    });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("sms:9505061025"));
                startActivity(i);
            }                     });
        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.cmrithyderabad.edu.in/"));
                startActivity(i);
            }                     };                   }                             }

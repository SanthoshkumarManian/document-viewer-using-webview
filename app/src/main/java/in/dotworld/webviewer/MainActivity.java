package in.dotworld.webviewer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


import java.io.File;

public class MainActivity extends AppCompatActivity {

    public static int PICKFILE_REQUEST_CODE=6384;
    Uri selectedPdf;
    WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.open);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            Intent i=new Intent(MainActivity.this,ViewActivity.class);
            startActivity(i);

            }

        });
    }

}



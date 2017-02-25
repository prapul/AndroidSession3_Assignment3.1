package com.spambox.payal.androidsession3_assignment31;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String input;
    EditText text;
    Button bsearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (EditText) findViewById(R.id.text);
        bsearch = (Button) findViewById(R.id.bsearch);
        bsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent i = new Intent(Intent.ACTION_WEB_SEARCH);
                    input = text.getText().toString();
                    i.putExtra(SearchManager.QUERY, input);
                    startActivity(i);
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        });
    }
}

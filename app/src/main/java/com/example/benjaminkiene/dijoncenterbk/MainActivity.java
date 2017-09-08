package com.example.benjaminkiene.dijoncenterbk;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.util.JsonReader;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.HttpURLConnection;
import java.lang.Thread;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedInputStream;

import com.example.benjaminkiene.dijoncenterbk.Classes.Pois;

import java.util.ArrayList;
import java.util.List;

import static android.os.AsyncTask.*;

public class MainActivity extends AppCompatActivity {

    public static final String URL_API = "https://my-json-server.typicode.com/lpotherat/pois/pois";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lvPois = (ListView) findViewById(R.id.lvPois);
        GetData gt = new GetData(this);
        gt.execute(URL_API);
    }
}

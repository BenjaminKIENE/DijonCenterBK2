package com.example.benjaminkiene.dijoncenterbk;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import android.app.ProgressDialog;
import java.io.BufferedReader;
import android.os.AsyncTask;
import android.util.JsonReader;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import com.example.benjaminkiene.dijoncenterbk.Classes.Location;
import com.example.benjaminkiene.dijoncenterbk.Classes.Pois;


    class GetData extends AsyncTask<String, Void, ArrayList<Pois>> {

    private ProgressDialog dialog;
    private MainActivity context;

    public GetData(MainActivity activity) {
        context = activity;
        dialog = new ProgressDialog(context);
    }

    protected void onPreExecute() {
        this.dialog.setMessage("...");
        this.dialog.show();
    }

    @Override
    protected ArrayList<Pois> doInBackground(String... params) {

        URL url = null;
        try {
            url = new URL(params[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }

        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection) url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList<Pois> objects = null;

        try {
            InputStream in = connection.getInputStream();
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(in));
            if (connection.getResponseCode() != HttpURLConnection.HTTP_OK) {
                return null;
            }
            String line;
            objects = new ArrayList<Pois>();
            Pois mo = new Pois();
            line = reader.readLine();

            try {

                JSONObject obj = new JSONObject(line);
                
                /*while (obj. != null) {
                    mo.setId(line.);
                    mo.setType();
                    mo.setName();
                    Location l = new Location();
                    l.setAdress();
                    l.setCity();
                    l.setPostalCode();
                    l.setPosition();
                    mo.setLocation();
                }*/


            } catch (Throwable t) {

            }
            reader.close();
            in.close();

        } catch (Exception e) {
            return null;
        } finally {
            if (connection != null)
                connection.disconnect();
        }

        return objects;

    }

    protected void onPostExecute(ArrayList<Pois> data) {
        if (dialog.isShowing()) {
            dialog.dismiss();
        }

        if (data == null) {
            Toast.makeText(context, "fail", Toast.LENGTH_SHORT).show();
        }

        else {

            ArrayAdapter<Pois> poisAdapter = new ArrayAdapter<Pois>(context, android.R.layout.simple_list_item_1, (ArrayList<Pois>) data);
            //context.lvPois.setAdapter(poisAdapter);

        }

    }
}
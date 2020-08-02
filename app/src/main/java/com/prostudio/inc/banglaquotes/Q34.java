package com.prostudio.inc.banglaquotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q34 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q34);
        RecyclerView statusList = findViewById(R.id.q34);
        statusList.setLayoutManager(new LinearLayoutManager(this));
        statusList.setAdapter(new StatusAdapter(getStatus(), this));


    }
    private List<String> getStatus(){

        List<String> status = new ArrayList<>();
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(this.getAssets().open("q34.txt"), "UTF-8"));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                status.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        finally {
            if (bufferedReader != null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return status;

    }
}
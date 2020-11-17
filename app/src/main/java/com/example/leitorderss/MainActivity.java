package com.example.leitorderss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: iniciando a AsyncTask");
        DownloadData downloadData = new DownloadData();
        downloadData.execute("URL para download");
        Log.d(TAG, "onCreate: terminou");

        }

        //1º parâmetro  - dado passado para a classe - uma URL - String;
        //2º parâmetro - dados referente a progresso - ignoramos aqui - void;
        //3º parâmetro - tipo de resultado - no nosso caso uma String;

        private  class DownloadData extends AsyncTask<String, Void, String>{
            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                Log.d(TAG, "onPostExecute: o parâmetro recebido é " + s);

            }

            @Override
            protected String doInBackground(String... strings) {
                Log.d(TAG, "doBackground: recebeu " + strings[0]);

                return "Terminou doBackground";
            }
        }
}
package com.example.shuvamghosh.prodb;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.shuvamghosh.prodb.api.ApiClient;
import com.example.shuvamghosh.prodb.api.ApiInterface;
import com.example.shuvamghosh.prodb.model.RespModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

   // EditText edtAccessionNo;
    EditText edtProteinName;
    Button btnSearch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // edtAccessionNo = findViewById(R.id.edt_acc_no);
        edtProteinName = findViewById(R.id.edt_key_word);
        btnSearch = findViewById(R.id.btn_search_btn);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String proteinName = edtProteinName.getText().toString();
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);
                i.putExtra("Protein",proteinName);
                startActivity(i);


            }
        });
}
}

package com.example.intent;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.intent.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

//    TextView tvName, tvNim, tvDollar;
    ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

//        tvName = findViewById(R.id.tv_name);
//        tvNim = findViewById(R.id.tv_nim);
//        tvDollar = findViewById(R.id.tv_dollar);

//        String nama = getIntent().getStringExtra("nama");
//        String nim = getIntent().getStringExtra("nim");
//        int dollar = getIntent().getIntExtra("dollar", 0);

        Mahasiswa mahasiswa = getIntent().getParcelableExtra("data");

        binding.tvName.setText(mahasiswa.getName());
        binding.tvNim.setText(mahasiswa.getNim());
        binding.tvDollar.setText(String.valueOf(mahasiswa.getDollar()));
    }
}
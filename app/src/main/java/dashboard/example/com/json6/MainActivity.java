package dashboard.example.com.json6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ApiInterface apiInterface;
    List<Guru> gurunya;
    TextView txtnama, txtno_hp, txtalamat, txtno_induk;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnama=(TextView)findViewById(R.id.txt_nama);
        txtno_hp=(TextView)findViewById(R.id.txt_no_hp);
        txtalamat=(TextView)findViewById(R.id.txt_alamat);
        txtno_induk=(TextView)findViewById(R.id.txt_no_induk);

        apiInterface = ApiClient.ambilData().create(ApiInterface.class);
        Call<List<Guru>> callnama_guru = apiInterface.getGuruSaya();
        callnama_guru.enqueue(new Callback<List<Guru>>() {
            @Override
            public void onResponse(Call<List<Guru>> call, Response<List<Guru>> response) {
                gurunya=response.body();
                txtnama.setText(gurunya.get(0).getNama());
                txtno_hp.setText(gurunya.get(0).getNo_hp());
                txtalamat.setText(gurunya.get(0).getAlamat());
                txtno_induk.setText(gurunya.get(0).getNo_induk());

            }

            @Override
            public void onFailure(Call<List<Guru>> call, Throwable t) {

            }
        });


    }

}

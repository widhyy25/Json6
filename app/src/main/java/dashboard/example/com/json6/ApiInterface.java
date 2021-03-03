package dashboard.example.com.json6;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
   @GET("b89cb383")
   Call <List<Guru>> getGuruSaya();




}

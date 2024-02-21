package Tests;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.testng.annotations.Test;
import pages.MovieApiContract;

import java.io.IOException;

public class GetMoviesTest {

    @Test
    public void testGetMovies() {
        OkHttpClient client = new OkHttpClient();

        String url = MovieApiContract.BASE_URL + MovieApiContract.FAVORITE_MOVIES_ENDPOINT +
                "?language=en-US&page=1&sort_by=created_at.asc";

        Request request = new Request.Builder()
                .url(url)
                .get()
                .addHeader("Authorization", "Bearer " + MovieApiContract.API_KEY)
                .addHeader("accept", "application/json")
                .build();

        try {
            // Executing the request
            Response response = client.newCall(request).execute();

            if (response.isSuccessful()) {
                System.out.println("Response Body:");
                System.out.println(response.body().string());
            } else {
                System.err.println("Error: " + response.code() + " - " + response.message());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

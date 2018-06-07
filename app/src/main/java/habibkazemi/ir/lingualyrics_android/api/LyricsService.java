package habibkazemi.ir.lingualyrics_android.api;

import habibkazemi.ir.lingualyrics_android.vo.Lyric;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by habibkazemi on 5/21/18.
 */

public interface LyricsService {
    @GET("/api/v1/")
    Call<Lyric> getLyric(@Query("mus") String mus, @Query("artist") String artist);
}
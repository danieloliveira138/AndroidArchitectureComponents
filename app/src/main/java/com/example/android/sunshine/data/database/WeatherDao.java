package com.example.android.sunshine.data.database;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.Date;
import java.util.List;

@Dao
public interface WeatherDao {

    @Query("SELECT * FROM weather WHERE date = :date")
    LiveData<WeatherEntry> getWeatherByDate(Date date);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void bulkinsert(WeatherEntry... weather);

    @Query("SELECT count(*) FROM weather WHERE date >= :date")
    int countAllFutureWeather(Date date);

    @Query("DELETE FROM weather WHERE date < :date")
    void deleteOldData(Date date);

    @Query("SELECT * FROM weather WHERE date >= :date")
    LiveData<List<ListViewWeatherEntry>> getAListOfWheaterEntry(Date date);
}

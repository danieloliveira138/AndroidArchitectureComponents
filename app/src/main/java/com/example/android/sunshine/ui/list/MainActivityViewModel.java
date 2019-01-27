package com.example.android.sunshine.ui.list;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.android.sunshine.data.SunshineRepository;
import com.example.android.sunshine.data.database.ListViewWeatherEntry;
import com.example.android.sunshine.utilities.SunshineDateUtils;

import java.util.Date;
import java.util.List;

public class MainActivityViewModel extends ViewModel {
    private SunshineRepository repository;
    private LiveData<List<ListViewWeatherEntry>> weatherListLiveData;
    private Date today = SunshineDateUtils.getNormalizedUtcDateForToday();

    public MainActivityViewModel(SunshineRepository repository){
        this.repository = repository;

        weatherListLiveData = repository.getCurrentWeatherForecasts(today);
    }

    public LiveData<List<ListViewWeatherEntry>> getWeatherListLiveData() {
        return weatherListLiveData;
    }

//    public void setWeatherListLiveData(LiveData<List<WeatherEntry>> weatherListLiveData) {
//        this.weatherListLiveData = weatherListLiveData;
//    }

}

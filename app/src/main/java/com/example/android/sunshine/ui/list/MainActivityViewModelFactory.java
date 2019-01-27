package com.example.android.sunshine.ui.list;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.example.android.sunshine.data.SunshineRepository;
import com.example.android.sunshine.data.database.WeatherEntry;

import org.jetbrains.annotations.NotNull;

public class MainActivityViewModelFactory extends ViewModelProvider.NewInstanceFactory {
    private SunshineRepository repository;

    public MainActivityViewModelFactory(SunshineRepository repository) {
        this.repository = repository;
    }

    @NotNull
    @Override
    public <T extends ViewModel> T create(@NotNull Class<T> modelClass){
        return (T) new MainActivityViewModel(repository);
    }
}

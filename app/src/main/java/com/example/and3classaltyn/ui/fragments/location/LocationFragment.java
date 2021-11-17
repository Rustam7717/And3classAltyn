package com.example.and3classaltyn.ui.fragments.location;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and3classaltyn.R;
import com.example.and3classaltyn.databinding.FragmentLocationsBinding;

public class LocationFragment extends Fragment {
private FragmentLocationsBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentLocationsBinding.inflate(getLayoutInflater(), container, false);
        return binding.getRoot();
    }
}
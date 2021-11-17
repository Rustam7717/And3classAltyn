package com.example.and3classaltyn.ui.fragments.episodes;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and3classaltyn.R;
import com.example.and3classaltyn.databinding.FragmentEpisodesBinding;


public class EpisodesFragment extends Fragment {

    private FragmentEpisodesBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       binding=  FragmentEpisodesBinding.inflate(getLayoutInflater(), container, false);
        return binding.getRoot();
    }
}
package com.example.and3classaltyn.ui.fragments.character;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and3classaltyn.R;
import com.example.and3classaltyn.databinding.FragmentCharacterBinding;


public class CharacterFragment extends Fragment {
private FragmentCharacterBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCharacterBinding.inflate(getLayoutInflater(), container, false);
        return binding.getRoot();
    }
}
package com.example.bottom_nav.ui.fav;

import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.bottom_nav.R;
////
import com.example.bottom_nav.databinding.FragmentFavBinding;
import com.example.bottom_nav.ui.dashboard.DashboardViewModel;
import com.example.bottom_nav.ui.fav.FragmentFavBinding;
import com.example.bottom_nav.ui.fav.FavViewModel;
public class FavFargment extends Fragment {
    private FavViewModel favViewModel;
    private FragmentFavBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        favViewModel =
                new ViewModelProvider(this).get(FavViewModel.class);
        binding = FragmentFavBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textFav;
        favViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);

            }
        });
        return root;
    }
}

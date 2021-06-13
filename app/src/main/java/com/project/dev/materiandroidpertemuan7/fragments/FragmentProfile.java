package com.project.dev.materiandroidpertemuan7.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.project.dev.materiandroidpertemuan7.R;

/**
 * created by Irfan Assidiq
 * email : assidiq.irfan@gmail.com
 **/
public class FragmentProfile extends Fragment {
    ImageView imgEditNama, imgEditPassword;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        imgEditNama = view.findViewById(R.id.imgEditNama);
        imgEditPassword = view.findViewById(R.id.imgEditPassword);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        imgEditNama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(requireContext(), "Edit Nama", Toast.LENGTH_SHORT).show();
            }
        });
        imgEditPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(requireContext(), "Edit Password", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

package com.project.dev.materiandroidpertemuan7.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.project.dev.materiandroidpertemuan7.Kota;
import com.project.dev.materiandroidpertemuan7.KotaAdapter;
import com.project.dev.materiandroidpertemuan7.R;

import java.util.ArrayList;

/**
 * created by Irfan Assidiq
 * email : assidiq.irfan@gmail.com
 **/
public class FragmentHome extends Fragment {
    private RecyclerView rcView;
    private ArrayList<Kota> listKota = new ArrayList<>();
    private KotaAdapter kotaAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        rcView = view.findViewById(R.id.rcView);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setListKota();
        LinearLayoutManager layoutManager = new LinearLayoutManager(requireContext());
        rcView.setLayoutManager(layoutManager);
        rcView.setHasFixedSize(true);

        kotaAdapter = new KotaAdapter(requireActivity(), listKota);
        rcView.setAdapter(kotaAdapter);
    }

    private void setListKota(){
        Kota kotaBandung = new Kota("Bandung", "Kota Parahyangan");
        listKota.add(kotaBandung);

        Kota kotaCimahi = new Kota("Cimahi", "Kota Cimahi");
        listKota.add(kotaCimahi);

        Kota kotaBogor = new Kota("Bogor", "Kota Bogor");
        listKota.add(kotaBogor);

        Kota kotaDepok = new Kota("Depok", "Kota Depok");
        listKota.add(kotaDepok);

        Kota kotaJakarta = new Kota("Jakarta", "Kota Jakarta");
        listKota.add(kotaJakarta);

        Kota kotaJambi = new Kota("Jambi", "Kota Jambi");
        listKota.add(kotaJambi);

        Kota kotaPadang = new Kota("Padang", "Kota Padang");
        listKota.add(kotaPadang);

        Kota kotaMedan = new Kota("Medan", "Kota Medan");
        listKota.add(kotaMedan);
    }
}

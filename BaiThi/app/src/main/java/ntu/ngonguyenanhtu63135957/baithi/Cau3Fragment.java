package ntu.ngonguyenanhtu63135957.baithi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class Cau3Fragment extends Fragment {

    LandScapeAdapter adapter;
    ArrayList<LandScape> list;
    RecyclerView recyclerViewLandScape;


    public Cau3Fragment() {
        // Required empty public constructor
    }

    public static Cau3Fragment newInstance(String param1, String param2) {
        Cau3Fragment fragment = new Cau3Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list = new ArrayList<>();
        list.add(new LandScape("thaphanoi", "Cột cờ Hà Nội"));
        list.add(new LandScape("effel", "Tháp Effel"));
        list.add(new LandScape("buckingham", "Cung điện Buckinghham"));
        list.add(new LandScape("thaphanoi", "Cột cờ Hà Nội"));
        list.add(new LandScape("effel", "Tháp Effel"));
        list.add(new LandScape("buckingham", "Cung điện Buckinghham"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewCau3 = inflater.inflate(R.layout.fragment_cau3, container, false);
        recyclerViewLandScape = viewCau3.findViewById(R.id.ryCau3);
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(viewCau3.getContext());
        recyclerViewLandScape.setLayoutManager(layoutLinear);
        adapter = new LandScapeAdapter(viewCau3.getContext(), list);
        recyclerViewLandScape.setAdapter(adapter);
        return viewCau3;
    }
}
package com.example.tabbedexample;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class RequestTab extends Fragment {

    List<Requests> requests=new ArrayList<>();
    RecyclerView recyclerView;
    RequestAdapter mAdapter;
    public RequestTab() {
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View v= inflater.inflate(R.layout.fragment_request_tab, container, false);

        recyclerView=(RecyclerView)v.findViewById(R.id.request_recycler_view);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        for (int i=0;i<10;i++){
            if (i%2==0){
                Requests request=new Requests("Jannifer","12:00PM");
                requests.add(request);
            }else {

                Requests request=new Requests("Shaman","12:00PM");
                requests.add(request);
            }
        }

        mAdapter=new RequestAdapter(requests,getActivity());
        recyclerView.setAdapter(mAdapter);
        return v;


    }
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}

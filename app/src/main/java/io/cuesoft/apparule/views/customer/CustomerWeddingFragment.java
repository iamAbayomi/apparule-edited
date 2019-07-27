package io.cuesoft.apparule.views.customer;


import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.cuesoft.apparule.R;
import io.cuesoft.apparule.model.ItemsModel;

/**
 * A simple {@link Fragment} subclass.
 */
public class CustomerWeddingFragment extends DiscoverBaseFragment {


    public CustomerWeddingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_customer_wedding, container, false);
        mRecyclerView = view.findViewById(R.id.custWeddingRecycler);
        initilaizeView();
        String [] imageArray ={"wedding_dress.jpg"};
        initilaizeData(imageArray,"Wedding");
        return view;
    }

  /*  @Override
    public void initilaizeData(){
        TypedArray ImageResources =
                getResources().obtainTypedArray(R.array.women_images);

        for(int i =0; i<ImageResources.length(); i++){
            mItemsData.add(new ItemsModel( ImageResources.getResourceId(i,0)));
        }

        ImageResources.recycle();
        mAdapter.notifyDataSetChanged();
    }*/

}

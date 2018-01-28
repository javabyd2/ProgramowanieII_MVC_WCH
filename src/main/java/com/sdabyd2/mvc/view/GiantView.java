package com.sdabyd2.mvc.view;


import com.sdabyd2.mvc.model.GiantModel;

import java.util.List;

public class GiantView {

    public GiantView() {
    }

    public void displayGiant(List<GiantModel> giantModel) {
        System.out.println(giantModel.toString());
    }
}

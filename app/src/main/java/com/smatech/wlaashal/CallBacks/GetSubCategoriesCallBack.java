package com.smatech.wlaashal.CallBacks;

import com.smatech.wlaashal.Model.Objects.SubCategory;

import java.util.ArrayList;

/**
 * Created by NaderNabil216@gmail.com on 5/17/2018.
 */
public interface GetSubCategoriesCallBack extends Failures {
    void OnSuccess(ArrayList<SubCategory> subCategories);
}

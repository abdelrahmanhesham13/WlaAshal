package com.smatech.wlaashal.CallBacks;

import com.smatech.wlaashal.Model.Objects.Category;

import java.util.ArrayList;

/**
 * Created by NaderNabil216@gmail.com on 5/15/2018.
 */
public interface AllCategoriesCallBack extends Failures {
    void OnSuccess(ArrayList<Category> categories);
}

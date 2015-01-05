package com.jennatauro.sectionedlistrecyclerview;

import java.util.List;

/**
 * Created by jennatauro on 2015-01-05.
 */
public interface ViewAdapter<T> {

    /*
     * Replaces entire adapter with passed in list
     */
    public void replace(List<T> objects);
}

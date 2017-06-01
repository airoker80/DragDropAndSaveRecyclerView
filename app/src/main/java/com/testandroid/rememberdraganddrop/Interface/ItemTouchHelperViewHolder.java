package com.testandroid.rememberdraganddrop.Interface;

/**
 * Created by Sameer on 5/31/2017.
 */

public interface ItemTouchHelperViewHolder {
    /**
     * Implementations should update the item view to indicate it's active state.
     */
    void onItemSelected();


    /**
     * state should be cleared.
     */
    void onItemClear();
}

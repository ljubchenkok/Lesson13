package ru.com.penza.lesson12;


import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.transition.ChangeBounds;
import android.transition.ChangeImageTransform;
import android.transition.ChangeTransform;
import android.transition.TransitionSet;
import android.util.AttributeSet;


/**
 * Created by Константин on 14.02.2018.
 */
@TargetApi(Build.VERSION_CODES.LOLLIPOP)
public class MyTransitionSet extends TransitionSet {

    public MyTransitionSet() {
        init();
    }


    private void init() {
        setOrdering(ORDERING_TOGETHER);
        addTransition(new ChangeBounds()).
                addTransition(new ChangeTransform()).
                addTransition(new ChangeImageTransform());
    }
}

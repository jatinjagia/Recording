package jatin.camerarecording;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.FrameLayout;

/**
 * Created by jatin on 7/26/2017.
 */

public class SquareFrameLayout extends FrameLayout {
    public SquareFrameLayout(Context context) {
        super(context);
    }

    public SquareFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareFrameLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        DisplayMetrics displaymetrics = new DisplayMetrics();
        ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int height = displaymetrics.heightPixels;
        int width = displaymetrics.widthPixels;
        int size = width > height ? height : width;
        setMeasuredDimension(size, size);


    }


}
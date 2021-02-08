package android.support.v4.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class SwipeRefreshLayout extends View {
    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public SwipeRefreshLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SwipeRefreshLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void setRefreshing(boolean b) {
    }

    public void setOnRefreshListener(androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener mOnRefreshListener) {
    }

    public interface OnRefreshListener {
        void onRefresh();
    }
}

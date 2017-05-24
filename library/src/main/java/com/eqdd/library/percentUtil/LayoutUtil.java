package com.eqdd.library.percentUtil;

import android.databinding.BindingAdapter;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by vzhihao on 2016/11/1.
 */
public class LayoutUtil {

    @BindingAdapter({"android:layout_margin"})
    public static void setMargin(View view, int margin) {
        margin = (margin * WindowUtil.csw / WindowUtil.width);
        if (view != null) {
            setMargin(view, margin, margin, margin, margin);
        }

    }

    @BindingAdapter({"android:padding"})
    public static void setPadding(View view, int padding) {
        padding = (padding * WindowUtil.csw / WindowUtil.width);
        if (view != null) {
            view.setPadding(padding, padding, padding, padding);
        }

    }

    public static void setMargin(View view, int left, int right, int top, int bottom) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = left;
                marginLayoutParams.topMargin = top;
                marginLayoutParams.rightMargin = right;
                marginLayoutParams.bottomMargin = bottom;
                view.setLayoutParams(marginLayoutParams);
            }


        }
    }

    @BindingAdapter({"android:textSize"})
    public static void setTextSize(TextView view, int size) {
        size = (size * WindowUtil.csw / WindowUtil.width);
        if (view != null) {
            view.setTextSize(TypedValue.COMPLEX_UNIT_PX, size);
        }
    }


    @BindingAdapter({"size"})
    public static void setSize(View view, int[] size) {
        if (view != null && size != null && size.length == 2) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = size[0];
            layoutParams.height = size[1];
            view.setLayoutParams(layoutParams);
        }

    }

    @BindingAdapter({"layout_width"})
    public static void setLayoutWidth(View view, int width) {
        width = width * WindowUtil.csw / WindowUtil.width;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = width;
            view.setLayoutParams(layoutParams);
        }

    }

    @BindingAdapter({"layout_height"})
    public static void setLayoutHeight(View view, int height) {
        height = height * WindowUtil.csw / WindowUtil.width;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = height;
            view.setLayoutParams(layoutParams);
        }

    }

    @BindingAdapter({"android:paddingLeft"})
    public static void setPaddingLeft(View view, int padding) {
        padding = (padding * WindowUtil.csw / WindowUtil.width);
        if (view != null) {
            view.setPadding(padding, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    @BindingAdapter({"android:paddingRight"})
    public static void setPaddingRight(View view, int padding) {
        padding = (padding * WindowUtil.csw / WindowUtil.width);
        if (view != null) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), padding, view.getPaddingBottom());
        }
    }

    @BindingAdapter({"android:paddingTop"})
    public static void setPaddingTop(View view, int padding) {
        padding = (padding * WindowUtil.csw / WindowUtil.width);
        if (view != null) {
            view.setPadding(view.getPaddingLeft(), padding, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    @BindingAdapter({"android:paddingBottom"})
    public static void setPaddingBottom(View view, int padding) {
        padding = (padding * WindowUtil.csw / WindowUtil.width);
        if (view != null) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), padding);
        }
    }


    @BindingAdapter({"android:layout_marginLeft"})
    public static void setMarginLeft(View view, int margin) {
        margin = (margin * WindowUtil.csw / WindowUtil.width);
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = margin;
                view.setLayoutParams(marginLayoutParams);
            }
        }

    }

    @BindingAdapter({"android:layout_marginRight"})
    public static void setMarginRight(View view, int margin) {
        margin = (margin * WindowUtil.csw / WindowUtil.width);
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.rightMargin = margin;
                view.setLayoutParams(marginLayoutParams);
            }
        }

    }

    @BindingAdapter({"android:layout_marginTop"})
    public static void setMarginTop(View view, int margin) {
        margin = (margin * WindowUtil.csw / WindowUtil.width);
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = margin;
                view.setLayoutParams(marginLayoutParams);
            }
        }

    }

    @BindingAdapter({"android:layout_marginBottom"})
    public static void setMarginBottom(View view, int margin) {
        margin = (margin * WindowUtil.csw / WindowUtil.width);
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = margin;
                view.setLayoutParams(marginLayoutParams);
            }
        }

    }

    @BindingAdapter({"android:maxWidth"})
    public static void setMaxWidth(TextView view, int maxWidth) {
        maxWidth = (maxWidth * WindowUtil.csw / WindowUtil.width);
        view.setMaxWidth(maxWidth);
    }
    @BindingAdapter({"android:maxHeight"})
    public static void setMaxHeight(TextView view, int maxHeight) {
        maxHeight = (maxHeight * WindowUtil.csw / WindowUtil.width);
        view.setMaxHeight(maxHeight);
    }
    @BindingAdapter({"android:minWidth"})
    public static void setMinWidth(TextView view, int maxWidth) {
        maxWidth = (maxWidth * WindowUtil.csw / WindowUtil.width);
        view.setMinWidth(maxWidth);
}

    @BindingAdapter({"android:minHeight"})
    public static void setMinHeight(TextView view, int maxHeight) {
        maxHeight = (maxHeight * WindowUtil.csw / WindowUtil.width);
        view.setMinHeight(maxHeight);
    }
}

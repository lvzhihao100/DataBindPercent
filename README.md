# DataBindPercent
  DatabindPercent 使用DataBinding 实现android 百分比布局，使用简单方便  
  
百分比库使用的依赖
```
dependencies {
	        compile 'com.github.lvzhihao100:DataBindPercent:-SNAPSHOT'
	}
```
1. 首先在Application中初始化
```
public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        WindowUtil.init(this);
    }
}
```
2. 在项目的module build.gradle中开启databinding
```
android {
    ......
    dataBinding {
        enabled = true
    }
}
```
3. 更改布局文件格式为databinding格式(根布局layout)，例如activity_main
```
<layout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools">

    <data class=".MainActivityCustom">

    </data>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="#ffffff"
        android:orientation="vertical">


        <Button
            android:id="@+id/imageView"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:layout_height="@{200}"
            app:layout_width="@{320}"
            android:textSize="@{30}"
            android:text="DatabindPercent"
            android:textAllCaps="false"
            android:layout_margin="@{50}"
            android:background="#ff0000"
            />
    </LinearLayout>

</layout>
```
4. 在MainActivity中使用databinding方式
```   
//        setContentView(R.layout.activity_main); 以前的方式

DataBindingUtil.setContentView(this,R.layout.activity_main);//databinding的方式
```
5. 根据上边的设置，你会发现button的宽度占据了屏幕的一半，
这是因为我设置的默认满百分比是640，屏幕的宽度
button的宽度是app:layout_width="@{320}"，占屏幕宽度的320/640,就是1/2,一半。
当然这个屏幕宽度百分之百尺寸，你可以自己设置的
在初始化的时候
```
public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        WindowUtil.init(this,屏幕宽,屏幕高);
    }
}
```
百分比的实现是以屏幕宽为基准的，屏幕高随意



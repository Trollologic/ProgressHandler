# ProgressHandler
=====================


Android library for handling progress actions.

![alt tag](https://raw.githubusercontent.com/Trollologic/ProgressHandler/d9412d45645f9030adb81532a9d6e97d2eb4d7c5/progress_without_message.png)
![alt tag](https://raw.githubusercontent.com/Trollologic/ProgressHandler/d9412d45645f9030adb81532a9d6e97d2eb4d7c5/progress_with_message.png)


Gradle
------

Add in your app gradle file under dependencies:
```
dependencies {
    ...
    compile 'com.trollologic.progresshandlerlib:progress-handler:1.0.0'
}
```

Usage
-----
In your activity you need to extend some of custom Progress-activities(ProgressAppCompactActivity org ProgressFragmentActivity)
```java
class ExampleActivity extends ProgressAppCompactActivity {

  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.simple_activity);
    //set value null if you don't need progress message(first image)
    showProgress(null);
    //if you need progress as on image2( you should add some text
    //showProgress("This is my progress message");

    findViewById(R.id.my_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hideProgress();
            }
        });
  }
}
```



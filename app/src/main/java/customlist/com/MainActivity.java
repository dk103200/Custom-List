package customlist.com;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import  android.view.View;
import  android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    ListView listCourse;
    ArrayList<Course> arrayCourse;
    int[] courseImages = new int[]{R.drawable.android,R.drawable.ios,R.drawable.php,R.drawable.unity,R.drawable.c
            ,R.drawable.java,R.drawable.python};
    String[] courseNames = new String[]{"Android","IOS","PHP","Unity","C/C++","Java","Python"};
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new Adapter(getApplicationContext(), courseImages,courseNames);

        listCourse = (ListView) findViewById(R.id.lvCourse);

//        arrayCourse = new ArrayList<Course>();

//
//
//
//        arrayCourse.add(new Course("Android",3799000,R.drawable.android));
//        arrayCourse.add(new Course("IOS",5550000,R.drawable.ios));
//        arrayCourse.add(new Course("PHP",2999000,R.drawable.php));
//        arrayCourse.add(new Course("Unity",4799000,R.drawable.unity));
//        arrayCourse.add(new Course("C/C++",2799000,R.drawable.c));
//        arrayCourse.add(new Course("Java",5799000,R.drawable.java));
//        arrayCourse.add(new Course("Python",3999000,R.drawable.python));
//
//        Adapter adapter = new Adapter(
//                MainActivity.this,
//                R.layout.row_course,
//                arrayCourse
//        );
//        listCourse.setAdapter(adapter);
//        listCourse.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this, arrayCourse.get(position).hoTen, Toast.LENGTH_SHORT).show();
//            }
//        });


    }
}
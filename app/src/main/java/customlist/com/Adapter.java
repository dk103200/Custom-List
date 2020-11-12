package customlist.com;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {
    Context context;
    int[] images;
    String[] courseName;

    LayoutInflater inflater = null;


    ArrayList<Course> arrayCourse;

    public Adapter(Context context, int[] images,String[] courseName){
        this.context = context;
        this.images = images;
        this.courseName = courseName;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return courseName.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        View courseIt = inflater.inflate(R.layout.row_course, null);

        ImageView img = (ImageView) courseIt.findViewById(R.id.img);
        TextView txtName = (TextView) courseIt.findViewById(R.id.txtName);
        txtName.setText(courseName[position]);
        img.setImageResource(images[position]);

        return courseIt;



//
//        TextView txtDetail = (TextView) convertView.findViewById(R.id.txtdetail);
//        txtDetail.setText(String.valueOf(arrayCourse.get(position).gia));
//
//
//


    }
}

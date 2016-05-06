import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by AHTD 04 on 6/5/2559.
 */
abstract public class DotListAdapter extends BaseAdapter implements Adapter {

    private static final class ViewHolder{
        TextView txtCoordX;
        TextView txtCoordY;

    }
    private Context mContext;
    public DotListAdapter(Context context){
        mContext=context;
    }
    public DotListAdapter() {
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view==null){
            // create a new row

        }else{

        }
        return null;
    }
}

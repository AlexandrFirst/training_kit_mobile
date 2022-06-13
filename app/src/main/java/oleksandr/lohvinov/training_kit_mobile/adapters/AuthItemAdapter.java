package oleksandr.lohvinov.training_kit_mobile.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import oleksandr.lohvinov.training_kit_mobile.R;
import oleksandr.lohvinov.training_kit_mobile.auth_models.AuthMenuModel;

public class AuthItemAdapter extends ArrayAdapter<AuthMenuModel> {

    Context mContext;
    int layoutResourceId;
    AuthMenuModel data[] = null;

    public AuthItemAdapter(@NonNull Context context, int resource, @NonNull AuthMenuModel[] objects) {
        super(context, resource, objects);

        this.layoutResourceId = resource;
        this.mContext = context;
        this.data = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;

        LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
        listItem = inflater.inflate(layoutResourceId, parent, false);

        ImageView imageViewIcon = (ImageView) listItem.findViewById(R.id.imageViewIcon);
        TextView textViewName = (TextView) listItem.findViewById(R.id.textViewName);

        AuthMenuModel folder = data[position];

        imageViewIcon.setImageResource(folder.icon);
        textViewName.setText(folder.name);

        return listItem;
    }
}

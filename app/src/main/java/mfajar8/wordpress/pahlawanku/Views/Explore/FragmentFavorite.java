package mfajar8.wordpress.pahlawanku.Views.Explore;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mfajar8.wordpress.pahlawanku.R;

public class FragmentFavorite extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View myFragmentsView = inflater.inflate(R.layout.fragment_favorite, container, false);
        return myFragmentsView;
    }
}

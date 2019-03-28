package database.c347.soi.rp.edu.sg.viewpagertab;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Tab1.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Tab1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Tab1 extends Fragment {

    List<Book> bookList;
    RecyclerView rvBookList;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Tab1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Tab1.
     */
    // TODO: Rename and change types and number of parameters
    public static Tab1 newInstance(String param1, String param2) {
        Tab1 fragment = new Tab1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_tab1, container, false);
        rvBookList = (RecyclerView) v.findViewById(R.id.rvBookList);
        bookList = new ArrayList<>();

        bookList.add(new Book("Yukina 01", "Caregorie", "Description Book", R.drawable.y_image_01));
        bookList.add(new Book("Yukina 02", "Caregorie", "Description Book", R.drawable.y_image_02));
        bookList.add(new Book("Yukina 03", "Caregorie", "Description Book", R.drawable.y_image_03));
        bookList.add(new Book("Yukina 04", "Caregorie", "Description Book", R.drawable.y_image_04));
        bookList.add(new Book("Yukina 05", "Caregorie", "Description Book", R.drawable.y_image_05));

        bookList.add(new Book("Yukina 06", "Caregorie", "Description Book", R.drawable.y_image_06));
        bookList.add(new Book("Yukina 07", "Caregorie", "Description Book", R.drawable.y_image_07));
        bookList.add(new Book("Yukina 08", "Caregorie", "Description Book", R.drawable.y_image_08));
        bookList.add(new Book("Yukina 09", "Caregorie", "Description Book", R.drawable.y_image_09));
        bookList.add(new Book("Yukina 10", "Caregorie", "Description Book", R.drawable.y_image_10));

        bookList.add(new Book("Yukina 11", "Caregorie", "Description Book", R.drawable.y_image_11));
        bookList.add(new Book("Yukina 12", "Caregorie", "Description Book", R.drawable.y_image_12));
        bookList.add(new Book("Yukina 13", "Caregorie", "Description Book", R.drawable.y_image_13));
        bookList.add(new Book("Yukina 14", "Caregorie", "Description Book", R.drawable.y_image_14));
        bookList.add(new Book("Yukina 15", "Caregorie", "Description Book", R.drawable.y_image_01));

        RecycleViewAdapter2 myAdapter = new RecycleViewAdapter2(getContext(), bookList);
        rvBookList.setHasFixedSize(true);
        rvBookList.setLayoutManager(new GridLayoutManager(getContext(), 3));
        rvBookList.setAdapter(myAdapter);

        return v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}

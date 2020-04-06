package cl.desafiolatam.recyclerview;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A fragment representing a list of Items.
 * <p/>
 * Activities containing this fragment MUST implement the {@link OnListFragmentInteractionListener}
 * interface.
 */
public class RestaurantesFragment extends Fragment {
    MyRestaurantesRecyclerViewAdapter adapterRestaurantes;
    RecyclerView recyclerView;
    List<Restaurante>restauranteList;

    // TODO: Customize parameters
    private int mColumnCount = 1;

    private OnListFragmentInteractionListener mListener;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public RestaurantesFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_restaurantes_list, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }

            //LISTA DE RESTAURANTES
            restauranteList = new ArrayList<>();
            restauranteList.add(new Restaurante("Pizzeria Carlos", "https://cdn-3.expansion.mx/dims4/default/9186eec/2147483647/strip/true/crop/800x450+0+0/resize/1200x675!/quality/90/?url=https%3A%2F%2Fcdn-3.expansion.mx%2F24%2F27%2F3279aad54c27873cb6adece10f9c%2Fvino-pizza-maridaje-1.jpg", 3.0f, "Roma, Italia"));
            restauranteList.add(new Restaurante("Sandwish Oscar", "https://upload.wikimedia.org/wikipedia/commons/e/e6/BLT_sandwich_on_toast.jpg", 5.0f, "Mexico"));
            restauranteList.add(new Restaurante("Suchilovers", "https://i.pinimg.com/originals/7c/27/3d/7c273d91040758a157e417afaa90c7e6.jpg", 4.0f, "Santiago, Chile"));
            restauranteList.add(new Restaurante("Parrilladas La Argentina", "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQ5-s1DLX4OX-PyMsUk9Ox5dAahsAOcbpMVR2z-fqQZUo0xx45r&usqp=CAU",5.0f, "Las Rejas, Samtiago"));

            //ASOCIAMOS EL ADAPTADOR AL RECYCLERVIEW
            adapterRestaurantes = new MyRestaurantesRecyclerViewAdapter(restauranteList, mListener);
            recyclerView.setAdapter(adapterRestaurantes);
        }
        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnListFragmentInteractionListener) {
            mListener = (OnListFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnListFragmentInteractionListener");
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
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnListFragmentInteractionListener {
        // TODO: Update argument type and name
        void onListFragmentInteraction(Restaurante item);
    }
}

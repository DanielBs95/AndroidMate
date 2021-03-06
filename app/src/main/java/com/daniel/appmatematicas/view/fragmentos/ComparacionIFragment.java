package com.daniel.appmatematicas.view.fragmentos;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.daniel.appmatematicas.R;

import static android.content.Context.MODE_PRIVATE;

public class ComparacionIFragment extends Fragment {
    private SharedPreferences prefs = null;
    private String resultadoList;

    private EditText primero;
    private EditText segundo;

    public ComparacionIFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment+
        View root = inflater.inflate(R.layout.fragment_comparacion_i_, container, false);
        ImageView btnCerrar;
        btnCerrar = root.findViewById(R.id.cerrar);
        btnCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(getActivity(), R.id.nav_host_fragment).navigate(R.id.nav_home);
            }
        });

        prefs = getActivity().getSharedPreferences("com.valdemar.appcognitivo", MODE_PRIVATE);
        resultadoList = prefs.getString("modulo_2","");

        initValidar(root);
        return root;
    }

    private void initValidar(View root) {
        Button validar = root.findViewById(R.id.validar);
        validar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                primero = root.findViewById(R.id.primero);
                segundo = root.findViewById(R.id.segundo);

                String primero_ = primero.getText().toString();
                String segundo_ = segundo.getText().toString();

                    if(primero_.equalsIgnoreCase("83") && segundo_.equalsIgnoreCase("73")){
                        prefs.edit().putString("modulo_2", resultadoList+",1").commit();
                    }else{
                        prefs.edit().putString("modulo_2", resultadoList+",0").commit();
                    }
                    Navigation.findNavController(getActivity(), R.id.nav_host_fragment).navigate(R.id.comparacionII);
            }
        });
    }

    public void showSnackBar(String msg) {
        Toast.makeText(getActivity(),""+msg,Toast.LENGTH_SHORT).show();
    }

}
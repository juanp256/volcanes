package com.example.volcanes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VolcanAdapter extends RecyclerView.Adapter<VolcanAdapter.VolcanViewHolder> {

    private final List<Volcan> lista;

    public VolcanAdapter(List<Volcan> lista) {
        this.lista = lista;
    }

    static class VolcanViewHolder extends RecyclerView.ViewHolder {
        ImageView imagen;
        TextView nombre, ubicacion, altura, descripcion;

        VolcanViewHolder(@NonNull View vista) {
            super(vista);
            imagen = vista.findViewById(R.id.imgVolcan);
            nombre = vista.findViewById(R.id.tvNombre);
            ubicacion = vista.findViewById(R.id.tvUbicacion);
            altura = vista.findViewById(R.id.tvAltura);
            descripcion = vista.findViewById(R.id.tvDescripcion);
        }
    }

    @NonNull
    @Override
    public VolcanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_volcan, parent, false);
        return new VolcanViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull VolcanViewHolder holder, int position) {
        Volcan v = lista.get(position);
        holder.imagen.setImageResource(v.getImagen());
        holder.nombre.setText(v.getNombre());
        holder.ubicacion.setText(v.getUbicacion());
        holder.altura.setText(v.getAltura());
        holder.descripcion.setText(v.getDescripcion());
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }
}

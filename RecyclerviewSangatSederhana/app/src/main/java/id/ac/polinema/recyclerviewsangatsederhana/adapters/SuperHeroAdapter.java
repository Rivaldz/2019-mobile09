package id.ac.polinema.recyclerviewsangatsederhana.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.R;
import id.ac.polinema.recyclerviewsangatsederhana.models.SuperHero;

public class SuperHeroAdapter extends RecyclerView.Adapter<SuperHeroAdapter.MyViewHolder> {
    List<SuperHero> heroList;

    public SuperHeroAdapter(List<SuperHero> heroList) {
        this.heroList = heroList;
    }

    @NonNull
    @Override
    public SuperHeroAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //mengambil objek context dari parrent
        Context context = parent.getContext();
        //objek context digunakan untuk membuat object layoutinflater
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        //object layoutInflater digunakan untuk membuat object view yang merupakan hasil inflate layout
        View superHeroView = layoutInflater.inflate(R.layout.item_super_hero,parent,false);
        //digunakan untuk membuat object viewHolder
        MyViewHolder viewHolder = new MyViewHolder(superHeroView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SuperHeroAdapter.MyViewHolder holder, int position) {
        //ambil satu item hero 
        SuperHero hero = heroList.get(position);
        //set text heroName berdasarkan data dari model hero
        holder.heroName.setText(hero.getHeroName());
        
        
    }

    @Override
    public int getItemCount() {
        return (heroList != null) ? heroList.size() : 0 ;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView heroName;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
              heroName = itemView.findViewById(R.id.heroName);
        }
    }
}

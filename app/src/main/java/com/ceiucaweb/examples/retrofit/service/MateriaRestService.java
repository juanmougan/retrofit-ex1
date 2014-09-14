package com.ceiucaweb.examples.retrofit.service;

import android.app.Activity;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import static com.ceiucaweb.examples.retrofit.GetMateriasActivity.ENDPOINT;

import com.ceiucaweb.examples.retrofit.GetMateriasActivity;
import com.ceiucaweb.examples.retrofit.R;
import com.ceiucaweb.examples.retrofit.domain.Materia;

import java.util.List;

import retrofit.RetrofitError;

/**
 * Implementación asincrónica del servicio REST para Materias
 * Created by juanma on 13/09/14.
 */
public class MateriaRestService {

    private static final String TAG = MateriaRestService.class.getSimpleName();

    public void fetchMaterias(final MateriaServiceInterface service, final Activity activity) {
        new AsyncTask<Void, Void, List<Materia>>() {
            @Override
            protected List<Materia> doInBackground(Void... voids) {
                try {
                    Log.d(TAG, "Attempting to fetch result from base url: " + ENDPOINT);
                    List<Materia> materias = service.getMaterias();
                    if (materias != null && !materias.isEmpty()) {
                        Log.d(TAG, "Fetched : " + materias.toString() + " from " + ENDPOINT);
                        StringBuilder sb = new StringBuilder();
                        for (Materia materia : materias) {
                            sb.append(materia.getName() + System.getProperty("line.separator"));
                        }
                        final String materiasStr = sb.toString();
                        final TextView materiasView = (TextView) activity.findViewById(R.id.get_materias);
                        activity.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                materiasView.setText(materiasStr);
                            }
                        });
                    }
                    return materias;
                }
                catch (RetrofitError retrofitError) {
                    Log.e(TAG, "Error de Retrofit!");
                    return null;
                }
                catch (Exception e) {
                    Log.e(TAG, "Unknown error", e);
                    return null;
                }
            }
        }.execute();
    }

}

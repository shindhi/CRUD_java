package controller;

import model.Pessoa;
import model.timePessoa;

import java.util.ArrayList;
import java.util.List;

public class GerenciaTimePessoa {
    private List<timePessoa> arrayTimePessoa;

    public GerenciaTimePessoa() {
        this.arrayTimePessoa = new ArrayList<>();
    }

    public List<timePessoa> getArrayTimePessoa() {
        return arrayTimePessoa;
    }
}

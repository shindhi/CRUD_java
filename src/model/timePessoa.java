package model;

public class timePessoa {
    private Pessoa pessoa;
    private Time2 time;

    public timePessoa(Pessoa pessoa, Time2 time) {
        this.pessoa = pessoa;
        this.time = time;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Time2 getTime() {
        return time;
    }

    public void setTime(Time2 time) {
        this.time = time;
    }
}

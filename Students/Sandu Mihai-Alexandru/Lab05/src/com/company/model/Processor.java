package com.company.model;

public class Processor extends Component {
    private double frequency;
    private int nrOfCores;
    private String series;
    private int technology;

    public Processor(double frequency, int nrOfCores, String series, int technology) {
        super(frequency, nrOfCores, series, technology);
        this.frequency = frequency;
        this.nrOfCores = nrOfCores;
        this.series = series;
        this.technology = technology;
    }


    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public int getNrOfCores() {
        return nrOfCores;
    }

    public void setNrOfCores(int nrOfCores) {
        this.nrOfCores = nrOfCores;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getTechnology() {
        return technology;
    }

    public void setTechnology(int technology) {
        this.technology = technology;
    }

    @Override
    public String getDescription() {
        return this.series + this.frequency;
    }
}
